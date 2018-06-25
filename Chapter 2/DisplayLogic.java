/*
 *  Author: Rattymyles
 *  Chapter 2 Fundamentals of Java - A Beginner's Guide 6th Edition.
 *  The purpose of this project will breakdown each line of code to help fellow students and readers.
 *  The DisplayLogic program will demonstrate the logical operators and how boolean works.
 *  Any feedback or comments, please email my address as m.pucknell@gmail.com.
 */

public class DisplayLogic {
	
	public static void main(String args[]){
		
		boolean p,q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		
	}

}
