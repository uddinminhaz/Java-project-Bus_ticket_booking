
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

import java.sql.*;

public class Route extends JFrame implements ActionListener{
	private Color c1= Color.WHITE;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	//private JTextField txtFieldNum1;
	//private JTextField txtFieldNum2;
	
	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\18197206_223599448126940_442894522_n.png"));


	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	
	User u;
	
	
	

	public Route(User u){
		super("Routes");
		this.setBounds(100, 50, 500, 450);
		this.setResizable(false);	
		//this.setBounds(r);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setSize(500,500);
		this.setContentPane(background);
		this.setLayout(null);
		this.u=u;

		this.l1 = new JLabel("Dhaka===>Chittagong");
		this.l1.setBounds(100, 70, 350, 50);
		this.add(this.l1);
		
		this.l2 = new JLabel("Chittagong===>Dhaka");
		this.l2.setBounds(100, 120, 300, 50);
		this.add(this.l2);
		
		this.l3 = new JLabel("Dhaka===>khulna");
		this.l3.setBounds(100, 170, 300, 50);
		this.add(this.l3);
		
		this.l4 = new JLabel("khulna===>Dhaka");
		this.l4.setBounds(100, 225, 300, 50);
		this.add(this.l4);
		
		
		l1.setFont(new Font("Times New Roman", Font.BOLD,15));
		l1.setForeground(c1);
		
		l2.setFont(new Font("Times New Roman", Font.BOLD,15));
		l2.setForeground(c1);
		
		l3.setFont(new Font("Times New Roman", Font.BOLD,15));
		l3.setForeground(c1);
		
		l4.setFont(new Font("Times New Roman", Font.BOLD,15));
		l4.setForeground(c1);
	
		
		ImageIcon searchDC=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\1493410223_search.png");
		
		
		this.b1 = new JButton("Search",searchDC);
		this.b1.setBounds(280, 80, 120, 30);
		
		this.b2 = new JButton("Search",searchDC);
		this.b2.setBounds(280, 130, 120, 30);
		
		this.b3 = new JButton("Search",searchDC);
		this.b3.setBounds(280, 180, 120, 30);
		
		this.b4 = new JButton("Search",searchDC);
		this.b4.setBounds(280, 230, 120, 30);
	
		
		this.b5 = new JButton("Cancel");
		this.b5.setBounds(110, 300, 120, 30);

		
		this.add(this.b1);
		this.add(this.b2);
		this.add(this.b3);
		this.add(this.b4);
		this.add(this.b5);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	
	}
	
	public void actionPerformed(ActionEvent a){
	
	if(a.getSource()==b1)
	{
			
			String dsql1="INSERT INTO `project1`.`travle`(`travleFrom`, `travleTo`,`userName`) VALUES ('Dhaka', 'chitagong','"+u.getU()+"')";
			//String m1="SELECT `travleFrom` ,`travleTo` FROM `travle` WHERE  userName='"+u.getU()+"'";
			/*try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql1);
					System.out.println("accepted");
					
				}
				catch(Exception eq){
				
				}
			
			*/
			setVisible(false);
			busSit s = new busSit("BUS SIT DHAKA TO CHITAGONG", new Rectangle(400, 50, 500, 450),u,dsql1);
			
			
		}else if(a.getSource()==b2){
			
			String dsql1="INSERT INTO `project1`.`travle`(`travleFrom`, `travleTo`,`userName`) VALUES ('chitagong', 'Dhaka','"+u.getU()+"')";
			
			/*try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql1);
					System.out.println("accepted");
					
				}
				catch(Exception eq){
				
				}
			
			;*/
			setVisible(false);
			busSitCtg m = new busSitCtg("BUS SIT CHITAGONG TO DHAKA", new Rectangle(400, 50, 500, 450),u,dsql1);
			
			
		}else if(a.getSource()==b3){
			
			String dsql1="INSERT INTO `project1`.`travle`(`travleFrom`, `travleTo`,`userName`) VALUES ('Dhaka', 'Khulna','"+u.getU()+"')";
		/*	try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql1);
					System.out.println("accepted");
					
				}
				catch(Exception eq){
				
				}
			
			setVisible(false);*/
			setVisible(false);
			busSitDtoK n = new busSitDtoK("BUS SIT DHAKA TO KHULNA", new Rectangle(400, 50, 500, 450),u,dsql1);
			
			
		}else if(a.getSource()==b4){
			
			String dsql1="INSERT INTO `project1`.`travle`(`travleFrom`, `travleTo`,`userName`) VALUES ('Dhaka', 'Khulna','"+u.getU()+"')";
		/*	try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql1);
					System.out.println("accepted");
					
				}
				catch(Exception eq){
				
				}
			
			setVisible(false);*/
			setVisible(false);
			busSitKtoD n = new busSitKtoD("BUS SIT DHAKA TO KHULNA", new Rectangle(400, 50, 500, 450),u,dsql1);
			
			
		}
		
		else if(a.getSource()==b5){
			setVisible(false);
			login l2 = new login("login", new Rectangle(400, 50, 500, 450));
		}			
		
	
	}
	

}
