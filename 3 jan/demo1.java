import java.io.*;
import java.util.*;

class Demo1

{
	public static void main (String[]arg)
	{
 	 InputStreamReader i=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(i);
	
	System.out.println("Enter no.");
	String s1=br.readLine();
	
	StringTokenizer st=new StringTokenizer(s1);
	int n=st.countTokens();
	int sum=0;
	for(int k=1; k<=n; k++)
	{
	 String s2=st.nextToken();
	 int x=Integer.parseInt(s2);
	 sum+=2;
	}
	System.out.println(sum);
}
}
/*output:-

	*/
