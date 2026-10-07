package Lesson3;

import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: Sep 2026
*  This program asks for five numbers and then finds the average.
*/

public final class AverageFinder {
    /**
        * Prevent instantiation.
        * Throw an exception IllegalStateException.
        * if this is ever called
        *
        * @throws IllegalStateException if this is ever called
        *
        */
    private AverageFinder() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
        * A constant representing some number.
        */
    private static final int AMOUNT_OF_NUMBERS = 5;
    /**
        * A constant representing some number.
        */
    private static final int PLACE_HOLDER_NUMBER = 0;

    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        float[] numbers = {PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER,
            PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER};
        float average = 0;
        int counter = 0;
        float tempNumber = 0;
        Scanner input = new Scanner(System.in);

        // Input
        try {

            while (counter < AMOUNT_OF_NUMBERS) {
                System.out.print("Enter a number: ");
                tempNumber = input.nextInt();
                numbers[counter] = tempNumber;
                counter++;
            }

            // Process
            counter = 0;
            while (counter < AMOUNT_OF_NUMBERS) {
                average = average + numbers[counter];
                counter++;
            }
            average = average / AMOUNT_OF_NUMBERS;

            // Output
            counter = 0;
            System.out.print("\nThe average of: ");
            while (counter < AMOUNT_OF_NUMBERS) {
                System.out.print(numbers[counter] + ", ");
                counter++;
            }
            System.out.print("\nIs: " + average);

        // Errors
        } catch (Exception e) {
            System.out.println("\nError(Letter)");
        }
        System.out.println("\n\nDone.");
        input.close();
    }
}
