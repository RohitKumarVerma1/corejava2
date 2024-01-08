// GRAPHICS IN JAVA
import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
	 Font f=new Font("Times New Roman ",Font.ITALIC,25);
     setFont(f);	 
	}
  public void paint (Graphics g)
	{
		int i,j;
		int x=100;
		int y=100;
		for(i=1; i<=10;i++)
		{
		for(j=1; j<=10;j++)
		{
		 int r=(int)Math.round(Math.random()*255);	
		 int g1=(int)Math.round(Math.random()*255);	
		 int b=(int)Math.round(Math.random()*255);	
		 
        Color c=new Color(r,g1,b);
         g.setColor(c);	

        int cal=i*j;
        g.drawString(" "+cal,x,y);

     // for delay
 
    try {Thread.sleep (100);}
	catch(Exception e){}
	
	x+=50;
			
		}
		x=100;
		y+=50;
			
		}
		
		
		
	}
}
class Demo20
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

