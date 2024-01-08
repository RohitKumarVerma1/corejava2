// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 Font f=new Font("Algerian ",Font.BOLD,50);
     setFont(f);	 
	}
  public void paint (Graphics g)
	{
		g.drawString("jai shree ram",100,150);
	}
}
class Demo1
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(400,300);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	
	}
}

