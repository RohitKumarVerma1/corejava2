   class Demo15
{
	public static void main(String[]arg)
	{
		byte x=100;
		switch(x)
		{
			case 100:
			System.out.println("case aaa");
			break;
			
			case 1000:
			System.out.println("case aaa");
			break;
		}
}
}

  /* output:  error: incompatible types: possible lossy conversion from int to byte
                        case 1000: 
  */