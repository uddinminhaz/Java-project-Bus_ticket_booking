
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JLabel;
import java.awt.*;
import java.sql.*;

public class AdminReg extends JFrame implements ActionListener{
	private JLabel l1 = new JLabel("                  WELCOME TO ADMIN PANEL ");
	private JLabel l2 = new JLabel("User Name: ");
	private JLabel l3 = new JLabel("ID: ");
	private JLabel l4 = new JLabel("ADD ADMIN ");
	private JLabel l5 = new JLabel("DELETE ADMIN(username)");
	private JLabel l6 = new JLabel("ID");
	private JLabel l7 = new JLabel("Contact Num:");
	private JLabel l8;
	private Color c1= Color.RED;
	
	private JTextField t1=new JTextField();
	private JTextField t2=new JTextField();
	private JTextField t3=new JTextField();
	private JTextField t4=new JTextField();
	
	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\Marcopolo-Audace-School-Charter-Bus-1.png"));


	private JButton b1=new JButton("ADD");
	private JButton b2=new JButton("DELETE");
	private JButton b3=new JButton("info DHK-CTG");
	private JButton b4=new JButton("info CTG-DHK");
	private JButton b5=new JButton("info KHU-DHK");
	private JButton b6=new JButton("info DHK-KHU");
	private JButton b7=new JButton("Cancel");
	
	Admin a1;

	
	


	public AdminReg(Admin a1){
		super("ADMIN WORK");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(background);
		this.setSize(754,560);
		this.setLayout(null);
		this.a1=a1;
		
		this.setResizable(false);

		
		
		l1.setBounds(100,10,300,85);
		l2.setBounds(35,140,100,35);
		l3.setBounds(35,180,100,35);
		l4.setBounds(35,110,150,35);
		l5.setBounds(295,110,150,35);
		l6.setBounds(295,150,150,35);
		l7.setBounds(35,220,100,35);
		
		l8 = new JLabel("Admin: ");
		l8.setBounds(10,15,100,35);
		
		l1.setForeground(c1);
		l2.setForeground(c1);
		l3.setForeground(c1);
		l4.setForeground(c1);
		l5.setForeground(c1);
		l6.setForeground(c1);
		l7.setForeground(c1);
		l8.setForeground(c1);
		
		
		t1.setBounds(295,150,150,30);
		t2.setBounds(120,185,150,30);
		t3.setBounds(120,220,150,30);
		t4.setBounds(120,150,150,30);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		
		
		
		b1.setBounds(55,300,100,30);
		b2.setBounds(300,200,100,30);
		
			b3.setBounds(55,340,150,30);
			b4.setBounds(55,380,150,30);
			b5.setBounds(55,420,150,30);
			b6.setBounds(55,460,150,30);
			b7.setBounds(300,250,100,30);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b4.addActionListener(this);
		this.b5.addActionListener(this);
		this.b6.addActionListener(this);
		this.b7.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a){
		
		if(a.getSource()==b1){
						Admin a1= new Admin();
						
						a1.setAU(t4.getText());
						a1.setAI(new String(t2.getText()));
						a1.setAC(t3.getText());
						
		
						String dsql2 = "INSERT INTO `admin`(`AuserName`, `AcontactNum`, `Aid`) VALUES ('"+a1.getAU()+"','"+a1.getAC()+"','"+a1.getAI()+"')";

					try
						{
						Class.forName("com.mysql.jdbc.Driver");  
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
						Statement stmt=con.createStatement();
						stmt.executeUpdate(dsql2);
						JOptionPane.showMessageDialog(this,"Inserted");
						System.out.println("add successfully....:");
						
						}
						
					catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Same id found");
				}
				catch(Exception eq){
				
				}
				
				setVisible(false);
				AdminReg n = new AdminReg(a1);
						
		}else if(a.getSource()==b2){
			
			
						String name1 =new String(t1.getText());
		
						String dsql="DELETE FROM `admin` WHERE `AuserName` = '"+name1+"' ";

					try
						{
						Class.forName("com.mysql.jdbc.Driver");  
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
						Statement stmt=con.createStatement();
						stmt.executeUpdate(dsql);
						JOptionPane.showMessageDialog(this,"Press ok to Delete");
						System.out.println("delete successfully....:"+name1);
						
						}
						
					catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Exception");
				}
				catch(Exception eq){
				
				}
					
				setVisible(false);
				AdminReg n = new AdminReg(a1);
		}else if(a.getSource()==b3){
						
						String dsql2 = "SELECT `userName`,`sitNum` FROM `sit` WHERE userName IS NOT NULL";

			
				
				setVisible(false);
				InfoDtoC n = new InfoDtoC(dsql2);
						
		}else if(a.getSource()==b4){
						
						
						  String dsql2 = "SELECT `userName`,`sitNum` FROM `bussitctg` WHERE userName IS NOT NULL";
			
				
				setVisible(false);
				InfoDtoC n = new InfoDtoC(dsql2);
						
		}else if(a.getSource()==b5){
						
						
						String dsql2 = "SELECT `userName`,`sitNum` FROM `bus_sit_k_to_d` WHERE userName IS NOT NULL";
			
				
				setVisible(false);
				InfoDtoC n = new InfoDtoC(dsql2);
						
		}else if(a.getSource()==b6){
						
						
						String dsql2 = "SELECT `userName`,`sitNum` FROM `bussitdtok` WHERE userName IS NOT NULL";
			
				
				setVisible(false);
				InfoDtoC n = new InfoDtoC(dsql2);
						
		}else if(a.getSource()==b7){
			
				
				setVisible(false);
				AdminLogin l2 = new AdminLogin("AdminLogin", new Rectangle(400, 50, 500, 450));
		}
		
	
	}	

}
