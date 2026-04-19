package recursion;
import java.util.Scanner;

public class ProductRecursion {

    // Recursive method for calculating the product of numbers
    public static int product(int[] numbers, int index) {

        // recursion prevention
        if (index == numbers.length) {
            return 1;
        }

        // multiply current number by product of remaining numbers
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {

    	// Scan five numbers max
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        // Collect five numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calling the recursive method
        int result = product(numbers, 0);

        // Display results
        System.out.println("The product of the five numbers is: " + result);

        scanner.close();
    }
}
