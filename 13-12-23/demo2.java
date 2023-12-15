class Demo2
{
public static void main(String[]arg)
{
int y=100;
char x=y;

  System.out.println(x);
  System.out.println(y);
}
}

/*output- 
         error: incompatible types: possible lossy conversion from int to char
char x=y;
*/