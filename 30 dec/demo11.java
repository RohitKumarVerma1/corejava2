import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo11

{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter No.1");
	String n1=br.readLine();
	int x= Integer.parseInt(n1);
	
	System.out.println("Enter no.2");
	String n2=br.readLine();
	int y= Integer.parseInt(n2);
	
	int sum=x+y;
	
	System.out.println("Sum= "+sum);
	
	
	}
}

/*output:-
Enter No.1
12
Enter no.2
23
Sum= 35

	*/
