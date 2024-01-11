// FRONT LOGIN PAGE
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 Font f=new Font("Times New Roman ",Font.ITALIC,25);
     setFont(f);

   FlowLayout f1=new FlowLayout();
   setLayout (f1);
   
   setLayout(null);
   
   Label un= new Label("Enter User Name -");
   un.setSize(250,50);
   un.setLocation(60,60);
   add (un);
   
   TextField txt=new TextField ();
   txt.setSize(230,50);
   txt.setLocation(400,60);
   add (txt);
   
   Label un1= new Label("Enter Password -");
   un1.setSize(250,50);
   un1.setLocation(60,120);
   add (un1);
   
   TextField txt1=new TextField ();
   txt1.setSize(230,50);
   txt1.setLocation(400,120);
   add (txt1);
   
   Button b1=new Button("Click Here!!!");
   b1.setSize(200,50);
   b1.setLocation(300,200);
   
   add(b1);
	}
 	
}
class Demo2
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(1500,1500);
		f.setLocation(400,300);
		f.setBackground(Color.black);
		f.setForeground(Color.red);
	
	}
}

