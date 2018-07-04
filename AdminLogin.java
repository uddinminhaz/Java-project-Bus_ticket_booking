


import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class AdminLogin extends JFrame implements ActionListener{
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private Color c1= Color.RED;
	private JTextField t1;
	private JPasswordField t2;
	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\18191760_223599411460277_1111224886_n.png"));


	private JButton b1;
	private JButton b2;
	
	Admin a1=new Admin();
	
	
	public AdminLogin(String title, Rectangle r){
		
		this.setBounds(r);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(background);
		this.setLayout(null);
		this.setResizable(false);
		
		ImageIcon loginImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168190_Login.png");
		ImageIcon cancelImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168949_Delete.png");

		l1 = new JLabel("User Name: ");
		l2 = new JLabel("ID: ");
		l1.setFont(new Font("Times New Roman", Font.BOLD,16));
		l2.setFont(new Font("Times New Roman", Font.BOLD,16));
		l1.setForeground(c1);
		l2.setForeground(c1);
		
		b1 = new JButton("login",loginImage);
		b2 = new JButton("Cancel",cancelImage);
		
		
		b1.setBounds(110, 135, 120, 30);
		b2.setBounds(110, 185, 120, 30);
		
		l1.setBounds(10, 70, 90, 35);
		l2.setBounds(10, 100, 90, 35);
		
		
		
		
		
		
		t1 = new JTextField();
		t2 = new JPasswordField();
		
		t1.setBounds(110, 70, 170, 25);
		t2.setBounds(110, 100, 170, 25);
	
		
		
			
			
		add(t1);
		add(t2);

		add(l1);
		add(l2);
		
		add(b1);
		add(b2);
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
		
	
	}
	
	public void actionPerformed(ActionEvent a){
		String i=new String(t2.getText());
		
		if(a.getSource()==b1){
			String dsql="SELECT * FROM `admin` WHERE AuserName='"+t1.getText()+"'";
			try{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(dsql);
				
				if(rs.next()){
					
					if(i.equals(rs.getString(3))){
						
						a1.setAC(rs.getString(2));
						a1.setAU(rs.getString(1));
						
					
					setVisible(false);
					AdminReg n = new AdminReg(a1);
						
						
						
					}else{
						JOptionPane.showMessageDialog(this,"Wrong Username or Password");
					}
				}else{
					JOptionPane.showMessageDialog(this,"Wrong Username or Password");
				}
			}
			catch(SQLException g){
				JOptionPane.showMessageDialog(this,"Wrong Username or Password");
			}
			catch(Exception eq){
				JOptionPane.showMessageDialog(this,"Wrong Username or Password");
			}
			
		}else if(a.getSource()==b2){
			setVisible(false);
			login l2 = new login("login", new Rectangle(400, 50, 500, 450));
		}
	}
	
	

}
