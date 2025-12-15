package weeklyTemps;

import java.util.*; //This imports all possible utilities, right? 
//It's warning that this call is never used. Will see if it changes as I develop this program. 
//Warning went away as I added functions

public class weeklyTemps {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //adds scanners
			//First arraylist here for days
			ArrayList<String> daysOfTheWeek = new ArrayList<String>();
			
			//Second arraylist here for temperatures
			ArrayList<Double> dailyTemps = new ArrayList<Double>();
			
			for (int i=0; i<7; i++) {
				System.out.println("Enter the Day of the Week (Monday, etc.): ");
				String day = scanner.nextLine(); 
				System.out.println("Enter the average temperature for " + day + ": ");
				double temperature = scanner.nextDouble();
				
				//scan the days and temps
				scanner.nextLine();
				//Adding the info
				daysOfTheWeek.add(day);
				dailyTemps.add(temperature);
		}
		//Here we need to get the stored information back
		while (true) {
			System.out.println("Enter the Day of the Week (Monday - Sunday) for that day's temperature, or type 'week' for the weekly average: ");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("week")) {
				//Perform math to calculate average daily temperatures
				double weeklyAverage = calculateWeeklyAverage(dailyTemps);
				System.out.println("The weekly average temperature is: " + weeklyAverage);
		}
			else if (daysOfTheWeek.contains(input)) { //If not the weekly average, this will print
				int index = daysOfTheWeek.indexOf(input);
				double temperature = dailyTemps.get(index);
				System.out.println("Temperature for " + input + ": " + temperature);	
			}
			else {
				System.out.println("Error, please enter valid Day or enter 'week'");
				}
			//Loop the program to ask for the next input
			System.out.print("Would you like to check another day or the week? (yes/no)?");
			String continueInput = scanner.nextLine();
			if (!continueInput.equalsIgnoreCase("yes")) {
				break;
			}
			}
		scanner.close(); 
		}
	
	//calculate weekly average temperature
	private static double calculateWeeklyAverage(ArrayList<Double> temperatures) {
		double sum = 0;
		for (double temperature : temperatures) {
			sum += temperature;
		}
		return sum / temperatures.size();
	}
}
	/*
	 * store data in the form of average temperatures for one week
	 * day of the week in its own arraylist
	 * temperature of that day in its own arraylist
	 * must prompt for each day of the week, starting Monday thru to Sunday
	 * if Week is entered, the output should include all days and their respective temperatures
	 * use looping and decision constructions to help
	 */


