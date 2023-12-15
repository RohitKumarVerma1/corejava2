class Demo16
	{
public static void main(String []arg)
{
  byte x= 10;
  byte y= 20;
  byte z= x+y ;
  
  System.out.println(z);
  


 }
}
/*
output-  error: incompatible types: possible lossy conversion from int to byte
  byte z= x+y ;     


*/