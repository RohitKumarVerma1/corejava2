// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 	 
	}
  public void paint (Graphics g)
	{
		//draw rectangle
		g.drawLine(100,100,300,100);
		g.drawLine(100,200,300,200);
		g.drawLine(100,100,100,200);
		g.drawLine(300,100,300,200);
	}
}
class Demo3
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

