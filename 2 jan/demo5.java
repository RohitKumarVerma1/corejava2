import java.io.*;
import java.util.*;
import java.io.IOException;

class Demo5
{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter 2 number ");
	
	int x=br.read();
	int y=br.read();
	
	int sum=(x+y);
	System.out.println("sum is ="+sum);

	}									
}

/*output:-
Enter 2 number
22
sum is =100

	*/
