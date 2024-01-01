import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo10

{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter Name");
	String name=br.readLine();
	
	System.out.println("Address");
	String add=br.readLine();
	
	System.out.println("Gender ");
	char g=(char)br.read();
	
	System.out.println("Name= "+name);
	System.out.println("Add= "+add);
	System.out.println("G= "+g);
	
	
	}
}

/*output:-
Enter Name
rohit
Address
indore
Gender
m
Name= rohit
Add= indore
G= m
*/
