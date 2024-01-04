
/* -2nd type to take input in java ie scanner class     aur ye class util ke pas hota hai
-scaner class ke pass next method hai jo string ko read karti hai
-space se data ko split karti hai
- next method ka return type string hai
*/

import java.util.*;
class Demo5
{
	public static void main (String[]arg)
	{
     Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers ");
	//String s1=sc.next();
	//String s2=sc.next();

     int n1=sc.nextInt();
     int n2=sc.nextInt();

int sum=(n1+n2);
 
	System.out.println("sum is= "+sum);

}
}
/*output:-
test caSE M1
Enter 2 numbers
12 23
sum is= 35

TEST CASE 2
Enter 2 numbers
11 RAM
Exception in thread "main" java.util.InputMismatchException
	*/
