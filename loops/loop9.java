class Loop9
{
	public static void main (String[]arg)
	{
		for(int i=5;i>=1;i--)
		{
		  for(int j=i;j<=5;j++)
		  {
			  System.out.print(j+" ");
		  }  
			  System.out.println();
		}
	}
}

/*output:-
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/
