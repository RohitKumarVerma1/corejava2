// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 	 
	}
  public void paint (Graphics g)
	{
		//draw coloured rectangle
		g.fillRect(100,100,300,300);
		}
}
class Demo9
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

