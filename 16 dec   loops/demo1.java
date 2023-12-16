   class Demo1
{
	public static void main(String[]arg)
	{
	 long x=100;
	  switch (x)
	  {
		  case 99:
		  System.out.println("ram");
		  break;
		  
		  case 100:
		  System.out.println("sita");
		  break;
		  
	  }
}
}

  /* output:error: incompatible types: possible lossy conversion from long to int
          switch (x)
  */