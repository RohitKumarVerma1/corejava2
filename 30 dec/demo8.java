import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo8

{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter any Character");
	
	char x=(char)br.read();
	
	System.out.println("Character is ="+x);
	
	
	}
}

/*output:-
Enter any Character
rohit
Character is =r
*/
