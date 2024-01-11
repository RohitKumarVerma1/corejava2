
import java.awt.*;
import java.awt.event.*;

 class FDemo extends Frame implements ActionListener
{
	TextField txt1,txt2,txt3;
	Button b1,b2,b3,b4;
	
	FDemo()
	{
		Font f=new Font("Times New Roman",Font.BOLD,40);
		setFont(f);
		setLayout(new FlowLayout());
		
		txt1=new TextField(20); add(txt1);
		txt2=new TextField(20); add(txt2);
		
		b1=new Button ("add");  add(b1);   b1.addActionListener(this);
		b2=new Button ("sub");  add(b2);   b2.addActionListener(this);
		b3=new Button ("mul");  add(b3);   b3.addActionListener(this);
		b4=new Button ("div");  add(b4);   b4.addActionListener(this);
		
		txt3=new TextField(20); add(txt3);
		
	}
		
	public void actionPerformed(ActionEvent  e)
	{
		if(e.getSource()==b1)
		{
		String s1=txt1.getText();
		String s2=txt2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);			
		int sum=n1+n2;
		txt3.setText(" "+sum);
		b1.setLabel("sum");
		}
		
	if(e.getSource()==b2)
		{
		String s1=txt1.getText();
		String s2=txt2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);			
		int sub=n1-n2;
		txt3.setText(" "+sub);
		b2.setLabel("sub");
		}
		
	if(e.getSource()==b3)
		{
		String s1=txt1.getText();
		String s2=txt2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);			
		int mul=n1*n2;
		txt3.setText(" "+mul);
		b3.setLabel("mul");
		}
		
	if(e.getSource()==b4)
		{
		String s1=txt1.getText();
		String s2=txt2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);			
		int div=n1/n2;
		txt3.setText(" "+div);
		b4.setLabel("div");
		}
	}		
	
}	
class Task
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300,50);
		
	}
}




