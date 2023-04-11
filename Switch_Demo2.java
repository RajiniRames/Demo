/* Program name:Switch_Demo2.java
Program purpose:
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/
import java.util.Scanner;
public class Switch_Demo2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Which of the following primitives uses the memory most?"
				+ "\nA: byte"
				+ "\nB: short"
				+ "\nC: int"
				+ "\nD: long"
				+ "\nEnter your choice...");
		//String ch = input.nextLine();
		char ch = input.next().charAt(0);
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
			System.out.println("Ivalid choice");
		}
	}
	//end main
}
//end class