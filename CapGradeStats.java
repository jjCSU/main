package javaCTA4;

import java.util.*;

public class CapGradeStats {
	
	/*
	 * Write a program that will provide important statistics for the grades in a class. 
	 * The program will utilize a for-loop to read ten floating-point grades from user input. 
	 * Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:
	 * 
	 * Average
	 * Maximum
	 * Minimum
	 * 
	 * Compile and submit your pseudocode, source code, and screenshots of the application executing the application, 
	 * the results and GIT repository in a single document
	 */

	public static void main(String[] args) {
		int count; //Needs to count the average of 10 students
		float sum = 0; //our grade point average
		float grade; //Final grade right? 
		try(Scanner scan = new Scanner(System.in)){ //Remember this lets us input info
			
			//Add a try statement to close the annoying scan leak, looks to have fixed it!
		
		System.out.println("Enter no. of students: "); //message 1
		count = scan.nextInt(); //input your students
		
		for (int i = 0; i < count; i++) { //clarify that i is int in these cases
			System.out.print("Enter grade " + (i + 1) + ": "); //message 2
			grade = scan.nextFloat(); //Remember, C's make degrees, so 70 points or higher!
			sum += grade; //Add the grades altogether
		}
		}
		System.out.println("The grade average is: " + sum/count); //final message
	}
}	
//grades obtained with a d100 die
