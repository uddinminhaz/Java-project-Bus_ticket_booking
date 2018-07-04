import com.itextpdf.text.Document;
import java.io.FileOutputStream;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Rectangle;

public class PDFDemo {
				//setVisible(false);
				login l2 = new login("login", new Rectangle(400, 50, 500, 450));
	
	String t;
	
	public PDFDemo(User u,String tr) {
		
		this.t=tr;
				
		try{
			
			Document document =new Document();
			PdfWriter.getInstance(document,new FileOutputStream("I:/Ticket "+u.getF()+" "+t+".pdf"));
			document.open();
			document.add(new Paragraph(".................TICKET INFO.................................."));
			
			
			//JLabel ln1= new JLabel(u.getF()+" "+u.getL());
			document.add(new Paragraph("NAME   :                               "+u.getF()+"  "+u.getL()));
			document.add(new Paragraph("PHONE :                               "+u.getC()));
			document.add(new Paragraph("DOB     :                               "+u.getD()));
			document.add(new Paragraph("GENDER:                               "+u.getG()));
			document.add(new Paragraph("E-MAIL:                               "+u.getE()));
			document.add(new Paragraph("SEAT   :                               "+u.getS()));
			document.add(new Paragraph("COST   :                               "+u.getCost()));
			document.add(new Paragraph("Travle :                               "+t));
			
			document.add(new Paragraph("***\\\\DONOT FORGET TO BRING THE TICKET\\\\***"));
			document.add(new Paragraph("N.B: Ticket is not refundable."));
			document.add(new Paragraph(".................................................................."));
			
			document.close();
			
			
			
		}
		catch(Exception e){
			
			System.out.println(e);
			System.out.println("boom");
		}
		
		System.out.println("itext PDF program executed ");
		
	}
	
		
	}
