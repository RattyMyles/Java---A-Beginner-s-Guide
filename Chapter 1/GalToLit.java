/*
 *  Author: Rattymyles
 *  Chapter 1 Fundamentals of Java - A Beginner's Guide 6th Edition.
 *  The purpose of this project will breakdown each line of code to help fellow students and readers.
 *  The Gallons-to-Liters project will demonstrate the conversion table of gallons to liters. 
 *  Any feedback or comments, please email my address as m.pucknell@gmail.com.
 */


public class GalToLit {
	
	public static void main (String args[]){
		double gallons, liters; // double is a integer with a floating point value
		int counter;
		
		counter = 0; // counter is set to zero
		
		for(gallons =1; gallons <= 100; gallons++){
			liters = gallons * 3.7854; // convert to liters
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			counter+=1; // increment counter by 1, you can also do counter++ or counter+1
			// every tenth line, print a blank line
			if (counter == 10) {
				System.out.println();
				counter = 0; //resets the line counter
			}
		
		}
	}
}
