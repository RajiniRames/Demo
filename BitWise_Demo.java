/* Program name:BitWise_Demo.java
Program purpose:To understand the bitwise operations using logical operators
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/

public class BitWise_Demo
{
	public static void main(String[] args)
	{
		boolean num3 =true;
		int num1 = 5; //101
		System.out.println(num1);
		
		int num2 = 8;//1000
		System.out.println(num2);
		
		int and =num1 & num2;
		System.out.println(and);
		
		int or =num1 |num2;
		System.out.println(or);
		
		int xor =num1 ^ num2;
		System.out.println(xor);
		
		boolean not = (!num3);
		System.out.println("\n"+ not);

	}//end main
}//end class