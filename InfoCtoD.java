
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

class InfoCtoD extends JFrame {
	JLabel top=new JLabel("Dhaka-Chittagong Information");
	JLabel l1= new JLabel("");
	JLabel l2= new JLabel("");
	JLabel l3= new JLabel("");
	JLabel l4=new JLabel("");
	JLabel l5=new JLabel("");
	JLabel l6=new JLabel("");
	JLabel l7=new JLabel("");
	JLabel l8= new JLabel("");
	JLabel l9= new JLabel("");
	JLabel l10= new JLabel("");
	JLabel l11=new JLabel("");
	JLabel l12=new JLabel("");
	JLabel l13=new JLabel("");
	JLabel l14=new JLabel("");
	String dsql;
	JLabel[] lb= new JLabel[15];
	JLabel[] sb= new JLabel[15];
	
	
	JButton b1= new JButton("Print");
	JButton b2= new JButton("Logout");
	
	
	public InfoCtoD(String dsql){
		super("C-D Information");
		JLabel background = new JLabel(new ImageIcon("F:\\Pictures\\texture_5.jpg"));
		setContentPane(background);
		this.dsql=dsql;
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
				
				}
		
		
			
		
			
			
			
		/*l1.setBounds(30,100,100,40);	
		
		l2.setBounds(30,200,100,40);
		
		l3.setBounds(30,300,100,40);
		
		l4.setBounds(30,150,100,40);
		
		l5.setBounds(30,250,100,40);
		
		l6.setBounds(30,350,100,40);
		
		l7.setBounds(30,400,100,40);*/
		
		b1.setBounds(75,500,100,30);
		b2.setBounds(75+100+40,500,100,30);
		add(top);
		
		/*add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);*/
		
		add(b1);
		add(b2);
		//b1.addActionListener(this);
		//b2.addActionListener(this);
	}
	

	
}

