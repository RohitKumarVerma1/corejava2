class Loop21
{
	public static void main (String[]arg)
	{
		for(int i=1;i<=7;i++)
		{
		  for(int j=i;j<=7;j++)
		  {
			  if(j%2==1)
			  System.out.printf("1 ");
			  
			  else
			  System.out.printf("0 ");
				  
		  }  
			  System.out.println( );
		}
	}
}

/*output:-
1 0 1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1
0 1 0 1
1 0 1
0 1
1
*/
