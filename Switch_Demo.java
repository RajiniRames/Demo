/* Program name:Switch_Demo.java
Program purpose:
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/
import java.util.Scanner;
public class Switch_Demo
{
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		System.out.println("which of the following primitives uses the most memory?"
				+ "\nA: byte"
				+ "\nB: short"
				+ "\nC: int"
				+ "\nD: long"
				+ "\nSelect your choice...");
		//String ch =input.nextLine();
		char ch =input.next().charAt(0);
		switch(ch)
		{
		case 'A':
			System.out.println("Incorrect");
			break;
		case 'B':
			System.out.println("Incorrect");
			break;
		case 'C':
			System.out.println("Incorrect");
			break;
		case 'D':
			System.out.println("Correct");
			break;
			default:
				System.out.println("invalid choice");
		}
	}//end main
}//end class