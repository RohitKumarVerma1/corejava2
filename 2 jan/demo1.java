import java.io.*;
import java.util.*;
import java.io.IOException;

class Demo1
// Sring Tokenizer method
{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter sentence");
	String s1=br.readLine();
	System.out.println(s1);
	
	StringTokenizer st=new StringTokenizer(s1);
	
	String s2=st.nextToken();
	System.out.println(s2);
	
	String s3=st.nextToken();
	System.out.println(s3);

	}
}

/*output:-

Enter sentence
my name is rohit
my name is rohit
my
name
	*/
