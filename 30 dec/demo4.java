import java.io.InputStreamReader;
import java.io.BufferedReader;

class Demo4
{
	public static void main (String[]arg)
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter any Character");
	
	int x=br.read();
	
	System.out.println("Character is ="+x);
	
	
	}
}

/*output:-
  error: unreported exception IOException; must be caught or declared to be thrown
        int x=br.read();                              ^
*/
