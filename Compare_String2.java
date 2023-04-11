/* Program name:Compare_String2.java
Program purpose:
Coder:Rajini Ramesh
Date:Jan 25, 2023
*/

public class Compare_String2
{

	public static void main(String[] args)
	{
		String str1 = "B";
		String str2 = "A";
		
	//compareTo()
	  System.out.println();
	  if(str1.compareTo(str2) == 0 ) //0
	  {
	  	System.out.println("str1 is equal to str2");
	  }
	  else System.out.println("str1 is NOT equal to str2");
	  
	  if(str1.compareTo(str2) > 0 ) //positive integer number
	  {
	  	System.out.println("str2 comes first");
	  	System.out.println("str1 is NOT equal to str2");
	  }
	 
	  if(str1.compareTo(str2) < 0 )//negative integer number
	  {
	  	System.out.println("str1 comes first");
	  	System.out.println("str1 is NOT equal to str2");
	  }

	}
	//end main
}
//end class