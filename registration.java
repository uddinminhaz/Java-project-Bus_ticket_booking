



import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.sql.*;

public class registration extends JFrame implements ActionListener{
	private JLabel l1=new JLabel("First Name:");
	private JLabel l2=new JLabel("Last Name:");
	private JLabel l3=new JLabel("User Name:");
	private JLabel l4=new JLabel("Password:");
	private JLabel l5=new JLabel("Confirm Password:");
	private JLabel l6=new JLabel("Gender:");
	private JLabel l7=new JLabel("E-mail:");
	private JLabel l8=new JLabel("Date-Of-Birth:");
	
	private JLabel l9=new JLabel("Mobile Number:");
	private Color c1= Color.WHITE;

	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\reg.png"));
	
	
	private JTextField t1=new JTextField();
	private JTextField t2=new JTextField();
	private JTextField t3=new JTextField();
	private JPasswordField t4=new JPasswordField();
	private JPasswordField t5=new JPasswordField();
	private JRadioButton rb1=new JRadioButton("Male");
	private JRadioButton rb2=new JRadioButton("Female");
	private ButtonGroup bg1 = new ButtonGroup();
	private JTextField t6=new JTextField();
	private JTextField t7=new JTextField();
	
	String[] year={"2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990"};
	String[] mon={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	
	JComboBox yearList = new JComboBox(year);
	JComboBox monList= new JComboBox(mon);
	JComboBox dateList= new JComboBox(date);
	
	
	ImageIcon submitImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168793_Add button.png");
	ImageIcon cancelImage=new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\1493168949_Delete.png");

	private JButton b1=new JButton("Submit",submitImage);
	private JButton b2=new JButton("Cancel",cancelImage);
	
	
	
	public registration(){
		
		this.setBounds(100, 50, 500, 450);
		this.setVisible(true);
			
	}

	public registration(String title, Rectangle r){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(background);
		this.setBounds(r);
		this.setLayout(null);
		this.setVisible(true);
		setSize(700,650);
		setResizable(false);

		
		l1.setBounds(25,50,150,35);
		l2.setBounds(25,100,150,35);
		l3.setBounds(25,150,150,35);
		l4.setBounds(25,200,150,35);
		l5.setBounds(25,250,150,35);
		l6.setBounds(25,300,150,35);
		l7.setBounds(25,350,150,35);
		l8.setBounds(25,400,150,35);
		l9.setBounds(25,450,150,35);
		
		l1.setForeground(c1);
		l2.setForeground(c1);
		l3.setForeground(c1);
		l4.setForeground(c1);
		l5.setForeground(c1);
		l6.setForeground(c1);
		l7.setForeground(c1);
		l8.setForeground(c1);
		l9.setForeground(c1);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		
		add(rb1);
		add(rb2);
		yearList.setBounds(25+150+30,400,60,35);
		monList.setBounds(25+150+30+60,400,60,35);
		dateList.setBounds(25+150+30+60+60,400,60,35);
		add(yearList);
		add(dateList);
		add(monList);
		
		t1.setBounds(25+150+30,50,200,28);
		t2.setBounds(25+150+30,100,200,28);
		t3.setBounds(25+150+30,150,200,28);
		t4.setBounds(25+150+30,200,200,28);
		t5.setBounds(25+150+30,250,200,28);
		t6.setBounds(25+150+30,350,200,28);
		t7.setBounds(25+150+30,450,200,28);
		
		
		
		
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		
		
		rb1.setBounds(25+150+30,300,80,35);
		rb2.setBounds(25+150+30+100+20,300,80,35);
		bg1.add(rb1);
		bg1.add(rb2);
		
		b1.setBounds(200,550,120,30);
		b2.setBounds(400,550,120,30);
		add(b1);
		add(b2);
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent a){
		String p1=new String(t4.getPassword());
		String p2=new String(t5.getPassword());
		
		if(a.getSource()==b1){
			if(t3.getText().isEmpty() || t1.getText().isEmpty() ||t2.getText().isEmpty()||t6.getText().isEmpty()||t7.getText().isEmpty()){
				JOptionPane.showMessageDialog(this,"All Fields Must Be Filled");
			}else if(p1.equals(p2)){
				
				User u= new User();
				u.setF(t1.getText());
				u.setL(t2.getText());
				u.setU(t3.getText());
				u.setP(new String(t4.getPassword()));
				u.setE(t6.getText());
				u.setC(t7.getText());
				if(rb1.isSelected()){
					u.setG(rb1.getText());
				}else{
					u.setG(rb2.getText());	
				}
				
				u.setD(yearList.getSelectedItem().toString(),monList.getSelectedItem().toString(),dateList.getSelectedItem().toString());
				
				String dsql="INSERT INTO `project1`.`user` (`userName`, `firstName`, `lastName`, `password`, `email`, `gender`, `contactNo`, `dateOfBirth`) VALUES ('"+u.getU()+"', '"+u.getF()+"', '"+u.getL()+"', '"+u.getP()+"', '"+u.getE()+"', '"+u.getG()+"', '"+u.getC()+"', '"+u.getD()+"')";
				try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql);
					
				}
			catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Username Already in Use");
					
				}
				catch(Exception eq){
				
				}
				setVisible(false);
				login l2 = new login("login", new Rectangle(400, 50, 500, 450));
			}else{
				JOptionPane.showMessageDialog(this,"Password did not match");
			}
		}else if(a.getSource()==b2){
			setVisible(false);
			login l2 = new login("login", new Rectangle(400, 50, 500, 450));
		}
	}
	

}
