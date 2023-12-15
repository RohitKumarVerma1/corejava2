class Demo8
	{
public static void main(String []arg)
{
  int x=10;
  byte y=(byte)x;
  
  System.out.println(x);
  System.out.println(y);


 }
}
/*
output
error: incompatible types: possible lossy conversion from int to byte
  byte y=x;
*/