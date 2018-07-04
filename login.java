import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class login extends JFrame implements ActionListener{
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private Color c1= Color.RED;
	private JTextField t1;
	private JPasswordField t2;
	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\witer-road-trip-jeff-clow.jpg"));


	private JButton b1;
	private JButton b2;
	private JButton b3;
	
	User u=new User();
	
	
	public login(){
		
		this.setBounds(100, 50, 500, 450);
		
		this.setVisible(true);
			
	}

	public login(String title, Rectangle r){
		super("BusTicketBooking-Login");
		this.setBounds(r);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(background);
		this.setLayout(null);
		this.setResizable(false);

		this.l1 = new JLabel("User Name: ");
		this.l2 = new JLabel("Password: ");
		this.l3 = new JLabel("Not Registerd Yet ??? ");
		
		l1.setBounds(10, 70, 90, 35);
		l2.setBounds(10, 100, 90, 35);
		l3.setBounds(10, 190, 190, 35);
		
		
		add(l1);
		add(l2);
		add(l3);
		
		
		l1.setFont(new Font("Times New Roman", Font.BOLD,16));
		l2.setFont(new Font("Times New Roman", Font.BOLD,16));

		l1.setForeground(c1);
		l2.setForeground(c1);
		l3.setForeground(c1);
		
		t1 = new JTextField();
		t2 = new JPasswordField();
		
		
		t2.setBounds(110, 100, 170, 25);
		t1.setBounds(110, 70, 170, 25);
		
		
		add(t1);
		add(t2);
		
		ImageIcon loginImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168190_Login.png");
		ImageIcon registerImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168506_list-add-user.png");
	
		
		
		this.b1 = new JButton("login",loginImage);
		this.b1.setBounds(110, 135, 120, 30);
		
		this.b2= new JButton("register",registerImage);
		this.b2.setBounds(110, 230, 120, 30);
		
		this.b3= new JButton("Admin");
		this.b3.setBounds(350, 50, 100, 30);
	
		
		this.add(this.b1);
		this.add(this.b2);
		this.add(this.b3);
		
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		
		this.setVisible(true);
		
	
	}
	
	public void actionPerformed(ActionEvent a){
		String p=new String(t2.getText());
		
		if(a.getSource()==b1){
			String dsql="SELECT * FROM `user` WHERE userName='"+t1.getText()+"'";
			try{
				
				Class.forName("com.mysql.jdbc.Driver");  
				JOptionPane.showMessageDialog(this,"Wrong cnn");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(dsql);
				
				if(rs.next()){
					
					if(p.equals(rs.getString(4))){
						
						
						u.setC(rs.getString(7));
						u.setD(rs.getString(8));
						u.setE(rs.getString(5));
						u.setF(rs.getString(2));
						u.setL(rs.getString(3));
						u.setP(rs.getString(4));
						u.setG(rs.getString(6));
						u.setU(rs.getString(1));
						
					setVisible(false);
					Route l1 = new Route(u);
						
						
						
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
			registration r1 = new registration("registration", new Rectangle(400, 50, 500, 350));
			
		}
		else if(a.getSource()==b3){
			setVisible(false);
			AdminLogin a1 = new AdminLogin("AdminLogin", new Rectangle(400, 50, 500, 450));
			
		}
	}	
	

}
