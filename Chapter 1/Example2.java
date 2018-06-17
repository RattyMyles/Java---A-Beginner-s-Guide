/*
 *  Author: Rattymyles
 *  Chapter 1 Fundamentals of Java - A Beginner's Guide 6th Edition.
 *  The purpose of this project will breakdown each line of code to help fellow students and readers.
 *  This project will demonstrate if loops.
 *  Any feedback or comments, please email my address as m.pucknell@gmail.com.
 */


public class Example2 {
	
	/*
	 * Use if to specify a block of code to be executed, if a specified condition is true.
	 */

	public static void main (String args[])
	{
		int a, b, c; // Initialises 3 variables a,b,c.
		
		a = 2;
		b = 3;
		System.out.println("a contains 2, b contains 3");
		
		if(a < b) System.out.println("if a is less than b, display this message");
		// this would not display the message
		if(a == b) System.out.println("if a equals to b, then display this message"); // equals too
		
		System.out.println("c contains -1");
		c = a - b;
		if(c >= 0) System.out.println("c is non-negative"); // greater than or equal too
		if(c < 0) System.out.println("c is negative"); // less than
		
		System.out.println("c changed to 1");
		c = b - a; // c now contains to 1
		
		if(c >= 0)System.out.println("c is non-negative");
		if(c < 0)System.out.println("c is negative");

		/*
		 * For loops
		 * Example: For how many values within that condition is met.
		 */
		int count;
		//Instead of writing a loop on one line, you can create code blocks.
		// The "{}" will hold the code you wish to execute within that loop. 
		for(count = 0; count < 5; count = count+1)
		{
			System.out.println("This is count: " + count);
		}
		
		/*
		 * While loops 
		 * While loops are good for large execution.
		 * Such as while the condition is true, carry on executing. 
		 */
		boolean Boolean = true;
		while(Boolean) // while counter is true, execute the code.
		{
			
			System.out.println("This is a while loop ");
			Boolean = false; // you have to make sure the while loop will change, as it can run forever!
		}
		
		
	}
}
