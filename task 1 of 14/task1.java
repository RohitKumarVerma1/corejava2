   class Task1
{
	public static void main(String[]arg)
	{
		int p=90;
		int c=89;
		int m=99;
		int sum=p+c+m;
	    int per=sum /3;
	
	  if(per>=90)
	  {
		System.out.println("grade= A+");
	  }
	  
	 else if(per>=80 && per<90)
	 {
		System.out.println("grade= A");
	 }
	 
	 else if(per>=70 && per<80)
	 {
		System.out.println("grade= B");
	 }
	 
	 else if(per>=60 && per<70)
	 {
		System.out.println("grade= C");
	 }
	
	 else if(per>=50 && per<60)
	 {
		System.out.println("garde= D"); 
	 }
	
	 else if(per<50 )
	 {
		System.out.println("grade= FAil");
	 }
}
}

  /* output:grade= A
  */