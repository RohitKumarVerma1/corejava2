class Loop19
{
	public static void main (String[]arg)
	{
		for(int i=7;i>=1;i--)
		{
		  for(int j=i;j<=7;j++)
		  {
			  System.out.printf("%d ",j%2);
				  
		  }  
			  System.out.println( );
		}
	}
}

/*output:-
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1 0 1
*/
