class Loop31
{
	public static void main (String[]arg)
	{
		for(int i=1;i<=8;i++)
		{
			if(i%2==0)
			{
			  System.out.print("  ");
				
			}
		  for(int j=1;j<=11;j++)
		  {
			 
			  System.out.print(" *");
				  
		  }  
			  System.out.println( );
		}
	}
}

/*output:-

 * * * * * * * * * * *
   * * * * * * * * * * *
 * * * * * * * * * * *
   * * * * * * * * * * *
 * * * * * * * * * * *
   * * * * * * * * * * *
 * * * * * * * * * * *
   * * * * * * * * * * *
*/
