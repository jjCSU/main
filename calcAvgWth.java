package javaCTA3; //This overall file, package must always be first line
import java.util.Scanner; //allows for user input
public class calcAvgWth {

	public static void main(String[] args) {
		/*Homework assignment:
		Create a program that will calculate the weekly average tax withholding for a 
		customer given the following weekly income guidelines:
		Income less than $500: tax rate 10%
		Incomes greater than/equal to $500 and less than $1500: tax rate 15%
		Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
		Incomes greater than/equal to $2500: tax rate 30%
		Compile and submit your pseudocode, source code, and screenshots of the application executing 
		the application, the results and GIT repository in a single document.
		 
		 Personal notes: 
		- Remember to end lines with ; 
		- comment everything for good documentation
		- Double-check all spelling for spelling errors, programming is 
		less forgiving than English
		
		 */
		
		System.out.println("Customer's Weekly Average Tax Withholding Calculation");
		System.out.println(" ");
		
		Scanner inputScanner = new Scanner(System.in);
		int weeklyInc; //This is the integer for weekly income rate
		double taxRate; //double works with decimal numbers
		int taxToWth; //This integer is for the tax withholding
		
		System.out.print("Enter weekly avg income: $"); // Type your income here
		weeklyInc = inputScanner.nextInt(); //This does the math
		
		if (weeklyInc < 500) { //For the small income
			taxRate = .10;
		} 
		else if (weeklyInc < 1500 ) { //For the medium income
			taxRate = .15;
		}
		else if (weeklyInc < 2500) { //for the large income
			taxRate = .20;
		}
		else { //Wish I was making this income
			taxRate = .30; 
		}
		
		taxToWth = (int)(weeklyInc * taxRate); //Withholding tax
		
		System.out.println("Rate: " + taxRate); //Here's what we owe you
		System.out.println("Withholding: $" + taxToWth); //Here's what we're keeping
	}

}
