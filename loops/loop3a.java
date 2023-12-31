class Loop3a
{
	public static void main (String[]arg)
	{
		for(int i=1;i<=5;i++)
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
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5*/
