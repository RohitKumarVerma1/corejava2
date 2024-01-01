class Loop17
{
	public static void main (String[]arg)
	{
		for(int i=1;i<=5;i++)
		{
		  for(int j=1;j<=5;j++)
		  {
			  if(i%2==1)
			  {
 	          System.out.printf("%d ",j);
 	          }
			  else
			  {
			  System.out.printf("* ");
			  }
		  }  
			  System.out.println( );
		}
	}
}

/*output:-
1 2 3 4 5
* * * * *
1 2 3 4 5
* * * * *
1 2 3 4 5
*/
