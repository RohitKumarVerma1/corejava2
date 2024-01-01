import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo9

{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter any Character");
	
	String x=br.readLine();
	
	System.out.println("Character is ="+x);
	
	
	}
}

/*output:-
Enter any Character
rohit
Character is =rohit
*/
