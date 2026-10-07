package Lesson5;

import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: Sep 2026
*  This program asks for width and height of your board and then tells you how
*  long it needs to be to be one board foot.
*/

public final class BoardFoot {
    /**
        * Prevent instantiation.
        * Throw an exception IllegalStateException.
        * if this is ever called
        *
        * @throws IllegalStateException if this is ever called
        *
        */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
        * A constant representing some number.
        */
    private static final int ONE_BOARD_FOOT = 144;

    /**
        * The starting boardFootCalculations() function.
        *
        * @param width
        * @param height
        * @return length
        */
    public static float boardFootCalculations(
        final float width, final float height) {
        // This function calculates the length of one board foot.
        // Variables
        float length;

        // Process
        length = (ONE_BOARD_FOOT / (width * height));

        return length;
    }

    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        boolean inputError = true;
        float width = 0;
        float height = 0;
        float lengthOutput = 0;
        Scanner input = new Scanner(System.in);

        // Input
        try {
            while (inputError) {
                System.out.print("Enter the width(inch): ");
                width = input.nextFloat();
                if (width > 0) {
                    inputError = false;
                }
            }
            inputError = true;
            while (inputError) {
                System.out.print("Enter the height(inch): ");
                height = input.nextFloat();
                if (height > 0) {
                    inputError = false;
                }
            }

            // Process
            lengthOutput = boardFootCalculations(width, height);

            // Output
            System.out.print("\nThe wood should be " + lengthOutput);
            System.out.print(" inch(es) long.");

            // Errors
        } catch (Exception e) {
            System.out.println("\nError(Letter)");
        } finally {
            System.out.println("\n\nDone.");
        }
        input.close();
    }
}
