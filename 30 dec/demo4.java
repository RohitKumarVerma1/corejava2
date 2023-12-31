importjava.io.InputSreamReader;
importjava.io.BufferedReader;

class Demo4
{
	public static void main (String[]arg)
	{
 	 InputSreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter any Character");
	
	int x=br.read();
	
	System.out.println("Character is = "+x);
	
	
	}
}

/*output:-
                               ^
*/
