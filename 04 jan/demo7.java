// GRAPHICS IN JAVA
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;

class FDemo extends Frame
{
	FDemo()
	{
		
	}
	public void paint (Graphics g)
	
	{
		g.drawString("jai shree ram",100,150);
	}
}
class Demo7
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

