// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 	 
	}
  public void paint (Graphics g)
	{
		// math methods
		System.out.println(Math.max (20,50));
		System.out.println(Math.min (20,50));
		System.out.println(Math.pow (20,50));
		System.out.println(Math.sqrt (625));
		System.out.println(Math.sin(45));
		System.out.println(Math.cos (90));
		System.out.println(Math.tan (45));
/*
50
20
1.125899906842624E65
25.0
0.8509035245341184
-0.4480736161291702
1.6197751905438615 
		*/
		
		
	}
}
class Demo17
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

