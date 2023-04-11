/**
 * Program Name:Basic_BITWISE_Example.java
 * Purpose: shows the use of the XOR operator on int values
 * Coder: 
 * Date: 
 * 
 */
import java.util.Scanner;
public class BitWise
{

	public static void main(String[] args)
	{
		// create Scanner
		Scanner input = new Scanner(System.in);
		//variables
		int a, b, result; //multiple declaration on one line
		
		//get some values from the user
		System.out.print("Enter the first integer value and press ENTER:" );
		a = input.nextInt();
		System.out.print("Enter the second integer value and press ENTER:" );
    b = input.nextInt();
    System.out.println("\nNow doing a bitwise comparison of " + a + " and " + b);
    //do the comparison
    result = a ^ b;
    //output
    System.out.println("Result of doing " + a + " XOR " + b + " is " + result);
    
   System.out.println("End of the program");
	}
	//end main
}//end class
