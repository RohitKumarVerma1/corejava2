// EVENT HANDLING
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
	Button b,b1,b2;
	
	FDemo()
	{
	 //Font f=new Font("Times New Roman ",Font.ITALIC,25);
     //setFont(f);
     
	 setLayout(new FlowLayout());
	 
	 b=new Button("white");     add (b);   b.addActionListener(this);
	 b1=new Button("red");    add (b1);  b1.addActionListener(this);
	 b2=new Button("green");    add (b2);   b2.addActionListener(this);
   }
   public void actionPerformed(ActionEvent  e) 
   {
	if(e.getSource ()==b)setBackground(Color.white);  
	if(e.getSource ()==b1)setBackground(Color.red);
	if(e.getSource ()==b2)setBackground(Color.green);
	   
   }
 	
}
class Demo5
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

