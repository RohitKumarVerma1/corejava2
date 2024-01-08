// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 	 
	}
  public void paint (Graphics g)
	{
		//draw multi coloured rectangle
		
		Color c=new Color (130,237,165);
		
		g.setColor(c);
		g.fillRect(30,50,100,100);
		
		g.setColor(Color.blue);
		g.fillRect(150,100,100,100);
		}
}
class Demo12
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

