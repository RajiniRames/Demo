/* Program name:Scope_Variables_Demo.java
Program purpose:
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/

public class Scope_Variables_Demo
{
	public static void main(String[] args)
	{//main starts
		int num1 = 5;
		System.out.println(num1);
		
		{//outer 
			String str1 = "hi";
			System.out.println(num1);
			{//inner
				char ch = 'a';
				System.out.println(ch);
				System.out.println(num1);
				System.out.println(str1);
			}//end inner
			System.out.println(str1);
			
		}//end outer
		System.out.println(num1);
		
	}//end main
}//end class