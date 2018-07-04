
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.*;
import java.sql.*;

class InfoDtoC extends JFrame implements ActionListener{
	JLabel top=new JLabel("BUS Sit Information ");
	
	String dsql;
	JLabel[] lb= new JLabel[15];
	JLabel[] sb= new JLabel[15];
	Admin a1=new Admin();
	
	
	JButton b1= new JButton("Cancel");
	
	
	
	public InfoDtoC(String dsql){
		super("Information");
		JLabel background = new JLabel(new ImageIcon("F:\\Pictures\\texture_5.jpg"));
		setContentPane(background);
		this.dsql=dsql;
		this.a1=a1;
		setSize(400,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		top.setBounds(145,10,300,35);
		
		
		
				try
				{
						
						
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(dsql);
					
					int i=0;
					while(rs.next()){
						 lb[i]= new JLabel(rs.getString(1));
						 sb[i]= new JLabel(rs.getString(2));
						 lb[i].setBounds(30,(i+1)*20,100,40);
						 sb[i].setBounds(130,(i+1)*20,100,40);
						 add(lb[i]);
						 add(sb[i]);
						 i++;
						 
					}
						
						
				}
						
				catch(SQLException g){
					JOptionPane.showMessageDialog(this,"exception");
				}
				catch(Exception eq){
					JOptionPane.showMessageDialog(this,"Other exception");
				}
		
		

		
		b1.setBounds(75,500,100,30);
		add(top);
		add(b1);
		b1.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent a){
		
		if(a.getSource()==b1){
			setVisible(false);
			
			AdminReg n = new AdminReg(a1);
		 }
	}

	
}

