// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 	 
	}
  public void paint (Graphics g)
	{
		
		System.out.println(Math.round (10.4));
		System.out.println(Math.round (10.5));
		
		
	}
}
class Demo18
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(400,300);
		f.setBackground(Color.black);
		f.setForeground(Color.red);
	
	}
}

