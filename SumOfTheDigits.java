/* Program name:SumOfTheDigits.java
Program purpose:Ask user to enter three digit number and display 
the sum of those three digits (for example: if user input is 245
 display 2+4+5 =11. (Hint: use modulus and division operators to 
 achieve this result) 
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/
import java.util.Scanner;
public class SumOfTheDigits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any three digit number"
				+ "and System will display the sum of the digits");
		int num1= input.nextInt();
		System.out.println("You have entered: " + num1);

		
		input.close();
	}
	//end main
}
//end class