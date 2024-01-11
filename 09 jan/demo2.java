
import java.awt.*;
import java.awt.event.*;

 class FDemo extends Frame implements ActionListener
{
	TextField txt1,txt2,txt3;
	Button b1;
	FDemo()
	{
		Font f=new Font("Times New Roman",Font.BOLD,40);
		setFont(f);
		setLayout(new FlowLayout());
		
		txt1=new TextField(30); add(txt1);
		txt2=new TextField(30); add(txt2);
		
		b1=new Button ("click to copy");
		add(b1);
		b1.addActionListener(this);
		
		txt3=new TextField(30); add(txt3);
		
	}
		
	public void actionPerformed(ActionEvent  e)
	{
		String s1=txt1.getText();
		String s2=txt2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int sum=n1+n2;
		txt3.setText(" "+sum);
		}
}
class Demo2
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300,50);
		
	}
}

