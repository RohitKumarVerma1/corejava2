   class Loop2
{
	public static void main(String[]arg)
	{
		int i;
	 	  for(i=1; i<=5; i++)
		  {
	          System.out.println(i);
			  System.out.println(i);  
		  }
}
}

/* output:
error: variable i is already defined in method main(String[])
                  for( int i=1; i<5; i++);
*/