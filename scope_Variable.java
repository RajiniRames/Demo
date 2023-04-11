/* Program name:scope_Variable.java
Program purpose:
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/

public class scope_Variable
{

	public static void main(String[] args)
	{ //starts outer layer 
		System.out.println("Outer layer");
		String str1 = "Hello";
		
		{//start middle layer 
			System.out.println();
			System.out.println("middle layer");
			int num1 = 56;
			
			
			{//start inner layer
				System.out.println();
				System.out.println("inner layer");
				char ch = 'a';
				System.out.println(ch);
				System.out.println(num1);
				System.out.println(str1);
				System.out.println("end inner layer");
			}// end inner layer ends
			
			System.out.println(num1);
			System.out.println(str1);
			System.out.println("end middle layer");
		}//end middle layer end
		
		System.out.println(str1);	
		System.out.println("end outer layer");
	}//end outer layer
//end main
	
}//end class