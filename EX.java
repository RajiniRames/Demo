/**
 * Program Name: SumOfTheDigits_Example.java
 * Purpose: shows how to use MODULUS division and INTEGER DIVISION to get the sum of the digits
 *          of an integer value. 
 *          This process is often used in various algorithms to create a CHECKSUM value which
 *          is used to VERIFY data. 
 *          Canada's Social Insurance Number (SIN) system uses the MODULUS-10 algorithm
 *          to verify assigned SIN numbers. 
 * Coder: Rajini Ramesh
 * Date: Jan 25,2023
 */
public class EX
{
	public static void main(String[] args)
	{
	int num =976;
	System.out.println("original number: " + num);
	int remainder = num%10;
	System.out.println("Reminder1: " + remainder);
	int add =remainder;
	System.out.println("add1: " + add);
	
	System.out.println();
	int divResult = num/10;
	System.out.println("division Result1: " +divResult);
	remainder = divResult%10;
	System.out.println("Reminder2: " + remainder);
	add +=remainder;
	System.out.println("add2: " + add);
	
	System.out.println();
	divResult /=10;
	System.out.println("division Result2: " +divResult);
	remainder = divResult%10;
	System.out.println("Reminder2: " + remainder);
	add +=remainder;
	System.out.println("the sum of all three digits is: " + add);
	
	
	}//end main
}//end class