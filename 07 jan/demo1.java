// HIERARCHY IN JAVA     to use button
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 Font f=new Font("Times New Roman ",Font.ITALIC,25);
     setFont(f);

   FlowLayout f1=new FlowLayout();
   setLayout (f1);
   
   TextField txt1=new TextField(10);
   add(txt1);
   
   Button b1=new Button("Click Here!!!");
   add(b1);
	}
 	
}
class Demo1
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

