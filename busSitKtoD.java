import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.*;
import java.sql.*;


public class busSitKtoD extends JFrame implements ActionListener{

	
	private JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\final project\\picture\\18197614_223721108114774_2017259668_n.png"));
String msg="";
boolean A1=false,A2=false,B1=false,B2=false,C1=false,C2=false,D1=false,D2=false,E1=false,E2=false,F1=false,F2=false,G1=false,G2=false,H=false;

	private JToggleButton b1;
	private JToggleButton b2;
	private JToggleButton b3;
	private JToggleButton b4;
	private JToggleButton b5;
	private JToggleButton b6;
	private JToggleButton b7;
	private JToggleButton b8;
	private JToggleButton b9;
	private JToggleButton b10;
	private JToggleButton b11;
	private JToggleButton b12;
	private JToggleButton b13;
	private JToggleButton b14;
	private JToggleButton b15;
	private JButton b16;
	private JButton b17;
	private JButton b18;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private Color c1= Color.RED;
	User u=new User();
	String[] sit = new String[15];
	int count;
	
	private JTextField t1=new JTextField();
	private JTextField t2=new JTextField();
	String d;
		


	public busSitKtoD(String title, Rectangle r,User u,String d){
		super("BUS SIT DHAKA TO KHULNA");
		this.count=0;
		this.setResizable(false);	
		this.setBounds(r);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setSize(754,560);
		this.setContentPane(background);
		this.setLayout(null);
		this.d=d;
		this.u=u;
		
		this.l1=new JLabel("CHOOSE YOUR SEAT...");
		this.l1.setBounds(50,10,200,90);
		
		this.l2=new JLabel("SELECTED SEAT No.");
		this.l2.setBounds(20,200,150,90);
		
		this.l3=new JLabel("TOTAL BILL");
		this.l3.setBounds(450,200,150,90);
		
		
		l1.setFont(new Font("Times New Roman", Font.BOLD,16));
		l2.setFont(new Font("Times New Roman", Font.BOLD,14));
		l3.setFont(new Font("Times New Roman", Font.BOLD,14));
		l1.setForeground(c1);
		l2.setForeground(c1);
		l3.setForeground(c1);
		
		this.b1 = new JToggleButton("A2");
		this.b1.setBounds(20, 80, 50, 50);
		
		this.b2 = new JToggleButton("B2");
		this.b2.setBounds(70, 80, 50, 50);
		
		this.b3 = new JToggleButton("C2");
		this.b3.setBounds(120, 80, 50, 50);
		
		this.b4 = new JToggleButton("D2");
		this.b4.setBounds(170, 80, 50, 50);
		
		this.b5 = new JToggleButton("E2");
		this.b5.setBounds(220, 80, 50, 50);
		
		this.b6 = new JToggleButton("F2");
		this.b6.setBounds(270, 80, 50, 50);
		
		this.b7 = new JToggleButton("G2");
		this.b7.setBounds(320, 80, 50, 50);
		
		this.b8 = new JToggleButton("H");
		this.b8.setBounds(370, 115, 50, 50);
	

	
		this.b9 = new JToggleButton("A1");
		this.b9.setBounds(20, 140, 50, 50);
		
		this.b10 = new JToggleButton("B1");
		this.b10.setBounds(70, 140, 50, 50);
		
		this.b11 = new JToggleButton("C1");
		this.b11.setBounds(120, 140, 50, 50);
		
		this.b12 = new JToggleButton("D1");
		this.b12.setBounds(170, 140, 50, 50);
		
		this.b13 = new JToggleButton("E1");
		this.b13.setBounds(220, 140, 50, 50);
		
		this.b14 = new JToggleButton("F1");
		this.b14.setBounds(270, 140, 50, 50);
		
		this.b15 = new JToggleButton("G1");
		this.b15.setBounds(320, 140, 50, 50);
		
		this.b16 = new JButton("Check");
		this.b16.setBounds(20, 350, 180, 50);
	
		this.b17 = new JButton("Submit");
		this.b17.setBounds(220, 350, 180, 50);
		
		
		this.b18 = new JButton("Cancel");
		this.b18.setBounds(440, 350, 180, 50);
			
		t1.setBounds(20,270,200,28);
		t2.setBounds(440,270,200,28);

		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		
		this.add(b9);
		this.add(b10);
		this.add(b11);
		
		this.add(b12);
		this.add(b13);
		this.add(b14);
		this.add(b15);
		this.add(b16);
		this.add(b17);
		this.add(b18);
		this.b16.addActionListener(this);
		this.b17.addActionListener(this);
		this.b18.addActionListener(this);
	
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(l3);
		
		this.b1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				A2=true;
				}else
				{
					A2=false;
				}
				
			}
			
		}
		
		);
		//b2
		this.b2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				B2=true;
				}else
				{
					B2=false;
				}
				
			}
			
		}
		
		);
		//b3
		this.b3.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				C2=true;
				}else
				{
					C2=false;
				}
				
			}
			
		}
		
		);
		//b4
		
		this.b4.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				D2=true;
				}else
				{
					D2=false;
				}
				
			}
			
		}
		
		);
		
		//b5
				this.b5.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				E2=true;
				}else
				{
					E2=false;
				}
				
			}
			
		}
		
		);
		//b6
				this.b6.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				F2=true;
				}else
				{
					F2=false;
				}
				
			}
			
		}
		
		);
		//b7
				this.b7.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				G2=true;
				}else
				{
					G2=false;
				}
				
			}
			
		}
		
		);
		//b8
				this.b8.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				H=true;
				}else
				{
					H=false;
				}
				
			}
			
		}
		
		);
		//b9
				this.b9.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				A1=true;
				}else
				{
					A1=false;
				}
				
			}
			
		}
		
		);
		//b10
				this.b10.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				B1=true;
				}else
				{
					B1=false;
				}
				
			}
			
		}
		
		);
		//b11
				this.b11.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				C1=true;
				}else
				{
					C1=false;
				}
				
			}
			
		}
		
		);
		//b12
				this.b12.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				D1=true;
				}else
				{
					D1=false;
				}
				
			}
			
		}
		
		);
		//b13
				this.b13.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				E1=true;
				}else
				{
					E1=false;
				}
				
			}
			
		}
		
		);
		//b14	
				this.b14.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				F1=true;
				}else
				{
					F1=false;
				}
				
			}
			
		}
		
		);
		//b15
				this.b15.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
				G1=true;
				}else
				{
					G1=false;
				}
				
			}
			
		}
		
		);
		
		//this.b3.addItemListener(e);
	}
		
	public void actionPerformed(ActionEvent a){
		msg="sets : ";
		
		if(a.getSource()==b16){
		count=0;
		if(A1==true){
			msg+="A1 ";
			sit[count]= new String();
			sit[count]="A1";
			count++;
		}
		if(A2==true){
			msg+="A2 ";
			sit[count]= new String();
			sit[count]="A2";
			count++;
		}if(B1==true){
			msg+="B1 ";
			sit[count]= new String();
			sit[count]="B1";
			count++;
		}
		if(B2==true){
			msg+="B2 ";
			sit[count]= new String();
			sit[count]="B2";
			count++;
		}if(C1==true){
			msg+="C1 ";
			sit[count]= new String();
			sit[count]="C1";
			count++;
		}
		if(C2==true){
			msg+="C2 ";
			sit[count]= new String();
			sit[count]="C2";
			count++;
		}if(D1==true){
			msg+="D1 ";
			sit[count]= new String();
			sit[count]="D1";
			count++;
		}
		if(E1==true){
			msg+="E1 ";
			sit[count]= new String();
			sit[count]="E1";
			count++;
		}if(F1==true){
			msg+="F1 ";
			sit[count]= new String();
			sit[count]="F1";
			count++;
		}
		if(G1==true){
			msg+="G1 ";
			sit[count]= new String();
			sit[count]="G1";
			count++;
		}if(H==true){
			msg+="H ";
			sit[count]= new String();
			sit[count]="H";
			count++;
		}
		if(E2==true){
			msg+="E2 ";
			sit[count]= new String();
			sit[count]="E2";
			count++;
		}if(D2==true){
			msg+="D2 ";
			sit[count]= new String();
			sit[count]="D2";
			count++;
		}
		if(G2==true){
			msg+="G2 ";
			sit[count]= new String();
			sit[count]="G2";
			count++;
		}if(F2==true){
			msg+="F2";
			sit[count]= new String();
			sit[count]="F2";
			count++;
		}
		t1.setText(msg);
		t2.setText(Integer.toString(count*400));
		
		//JOptionPane.showMessageDialog(null,msg);
		
	
		
		
		
		}
		
		
		if(a.getSource()==b17){
				int flag=0;
				u.setS(t1.getText());
				u.setCost(t2.getText());
				String sitc="";
				
				for(int i=0; i< count; i++){
					
					if(i<count-1){
					sitc =sitc+"'"+sit[i]+"',";
					}else{
					sitc =sitc +"'"+sit[i]+"'";
					}
				}
				
				JOptionPane.showMessageDialog(this,sitc);
				
				String dsql2="SELECT `userName` from `bus_sit_k_to_d` Where sitNum IN ("+sitc+")";
				try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(dsql2);
					
					while(rs.next()){
						if(rs.getString(1)!=null){
							JOptionPane.showMessageDialog(this,"Seat Already in Use");
							flag=1;
							
						}
					}
				}
				catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Exception");
				}
				catch(Exception eq){
				
				}
				
				
				if(flag==0){
					
				String dsql = "UPDATE `bus_sit_k_to_d` SET `userName`='"+u.getU()+"',`contactNo`='"+u.getC()+"' WHERE sitNum IN ("+sitc+")";
				
				
				
				
				
	
			try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(dsql);
					System.out.println(" bus SIT dhaka to khulna Sit....accepted");
					
				}
			catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Seat Already in Use");
				}
			catch(Exception eq){
				
				}
						
			try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(d);
					System.out.println("accepted");
					
				}
				catch(Exception eq){
				
				}
			
						
				setVisible(false);
				Ticket T2 = new Ticket("Ticket", new Rectangle(400, 50, 500, 450),u,"KHULNA to DHAKA");
					}
				
				
				
		}
		else if(a.getSource()==b18){
			setVisible(false);
			login l2 = new login("login", new Rectangle(400, 50, 500, 450));
		}
		
	}

	
	}
	


		
		
	



		
		
	





		
		
	


