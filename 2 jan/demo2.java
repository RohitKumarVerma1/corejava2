import java.io.*;
import java.util.*;
import java.io.IOException;

class Demo2
// addition of 2 number Sring Tokenizer method
{
	public static void main (String[]arg)throws IOException
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter 2 number ");
	String s1=br.readLine();
	System.out.println(s1);
	
	StringTokenizer st=new StringTokenizer(s1);
	
	String s2=st.nextToken();
	String s3=st.nextToken();
	

	int n1=Integer.parseInt(s2);
	int n2=Integer.parseInt(s3);
	
	int sum=(n1+n2);
	System.out.println("sum is ="+sum);

	}									
}

/*output:-kyokyi hm do number ko hi e rahe hain
Enter 2 number
12 13 12
12 13 12
sum is =25
*/
