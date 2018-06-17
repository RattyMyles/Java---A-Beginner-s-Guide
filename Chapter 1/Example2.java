/*
 *  Author: Rattymyles
 *  Chapter 1 Fundamentals of Java - A Beginner's Guide 6th Edition.
 *  The purpose of this project will breakdown each line of code to help fellow students and readers.
 *  This project will demonstrate if loops, while loops and for loops.
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

		
		
		
	}
}
