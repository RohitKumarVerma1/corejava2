class Demo9
	{
public static void main(String []arg)
{
  short x=10;
  byte y=x;
  
  System.out.println(x);
  System.out.println(y);


 }
}
/*
output- error: incompatible types: possible lossy conversion from short to byte
  byte y=x;


*/