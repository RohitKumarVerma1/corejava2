   class Task
{
	public static void main(String[]arg)
	{
		int p=93;
		int c=75;
		int m=88;
		int sum=p+c+m;
	    int per=sum /3;
	
	  if(per>=90)
	  {
		System.out.println("grade= A+");
	  }
	  
	 if(per>=80)
	 {
		System.out.println("grade= A");
	 }
	 
	 if(per>=70)
	 {
		System.out.println("grade= B");
	 }
	 
	 if(per>=60)
	 {
		System.out.println("grade= C");
	 }
	
	 if(per>=50)
	 {
		System.out.println("garde= D"); 
	 }
	
	 if(per<50)
	 {
		System.out.println("grade= FAil");
	 }
}
}

  /* output:grade= A
grade= B
grade= C
garde= D  
  */