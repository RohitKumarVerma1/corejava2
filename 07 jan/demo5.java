// EVENT HANDLING
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
	Button b,b1,b2;
	
	FDemo()
	{
	 Font f=new Font("Times New Roman ",Font.ITALIC,25);
     setFont(f);
     
	 setLayout(null);
	 
	 b=new Button();
	 b.setSize(100,100);
	 b.setLocation(100,100);
	 b.addActionListener(this);
	 add (b);  
	

	 b1=new Button(); 
	 b1.setSize(100,100);
	 b1.setLocation(200,100);
	 b1.addActionListener(this);
	 add (b1);
	 
	}
   public void actionPerformed(ActionEvent  e) 
   {
	if(e.getSource ()==b)   b.setLabel("0");  
	if(e.getSource ()==b1)  b1.setLabel("X");
	
	   
   }
 	
}
class Demo5
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300,50);
		f.setBackground(Color.black);
		f.setForeground(Color.red);
	
	}
}

