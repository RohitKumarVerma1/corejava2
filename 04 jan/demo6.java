// GRAPHICS IN JAVA
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;

class FDemo extends Frame
{
	FDemo()
	{
		
	}
}
class Demo6
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(400,300);
		f.setBackground(Color.red);
		f.setForeground(Color.white);
	
	}
}

/*output:-
*/