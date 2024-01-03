class Loop25
{
	public static void main (String[]arg)
	{
		int k=0;
		for(int i=1;i<=4;i++)
		{
		  for(int j=1;j<=i;j++)
		  {
			  k++;
			  System.out.printf("%d ",k);
				  
		  }  
			  System.out.println( );
		}
	}
}

/*output:-
1
2 3
4 5 6
7 8 9 10
*/
