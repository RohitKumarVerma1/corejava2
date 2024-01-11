// EVENT HANDLING
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
	FDemo()
	{
	 Font f=new Font("Times New Roman ",Font.ITALIC,25);
     setFont(f);
     
	 setLayout(new FlowLayout());
	 
	 Button b=new Button("Login");
	 add (b);
	 b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e) 
   {
	   System.out.println("Button clicked and colour changed");
	   setBackground(Color.white);
	   
   }
 	
}
class Demo3
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

