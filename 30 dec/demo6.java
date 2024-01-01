import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo6
{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter any Character");
	
	char x=br.read();
	
	System.out.println("Character is ="+x);
	
	
	}
}

/*output:-
  error: incompatible types: possible lossy conversion from int to char
        char x=br.read();
*/
