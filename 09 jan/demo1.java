
import java.awt.*;
import java.awt.event.*;

 class FDemo extends Frame implements ActionListener
{
	TextField txt1,txt2;
	Button b1;
	FDemo()
	{
		Font f=new Font("Times New Roman",Font.BOLD,40);
		setFont(f);
		setLayout(new FlowLayout());
		
		txt1=new TextField(20); add(txt1);
		
		b1=new Button ("click to copy");
		add(b1);
		b1.addActionListener(this);
		
		txt2=new TextField(30); add(txt2);
		
	}
		
	public void actionPerformed(ActionEvent  e)
	{
		String s1=txt1.getText();
		txt2.setText(s1);
		txt1.setText(" ");
		b1.removeActionListener(this);
	}
}
class Demo1
{
	public static void main (String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300,50);
		
	}
}

