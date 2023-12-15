   class Demo16
{
	public static void main(String[]arg)
	{
		boolean b=100;
		switch(b)
		{
			case true:
			System.out.println("true");
			break;
			
			case false:
			System.out.println("false")   ;
			break;
		}
}
}

  /* output:  error: incompatible types: int cannot be converted to boolean
                boolean b=100; 
  */