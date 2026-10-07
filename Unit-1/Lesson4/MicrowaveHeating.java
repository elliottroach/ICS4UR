package Lesson4;

import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: Sep 2026
*  This program asks what is being heated and the amount and then tells you how
*  long to heat it for.
*/

public final class MicrowaveHeating {
    /**
        * Prevent instantiation.
        * Throw an exception IllegalStateException.
        * if this is ever called
        *
        * @throws IllegalStateException if this is ever called
        *
        */
    private MicrowaveHeating() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
        * A constant representing some number.
        */
    private static final double FIFTY_PRESENT = 1.5;
    /**
        * A constant representing some number.
        */
    private static final int ONE_HUNDRED_PRESENT = 2;
    /**
        * A constant representing some number.
        */
    private static final int SUB_HEAT_TIME = 60;
    /**
        * A constant representing some number.
        */
    private static final int PIZZA_HEAT_TIME = 45;
    /**
        * A constant representing some number.
        */
    private static final int SOUP_HEAT_TIME = 105;
    /**
        * A constant representing some number.
        */
    private static final int SOUP_NUMBER = 3;
    /**
        * A constant representing some number.
        */
    private static final int ONE_MINUTE = 60;
    /**
        * A constant representing some number.
        */
    private static final int AMOUNT_IS_TWO = 2;
    /**
        * A constant representing some number.
        */
    private static final int AMOUNT_IS_THREE = 3;
    /**
        * A constant representing some number.
        */
    private static final int MAX_ITEMS = 3;
    /**
        * A constant representing some number.
        */
    private static final int MAX_AMOUNT = 3;

    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        int inputErrorCheck = 1;
        int itemAsNumber = 0;
        int amountAsNumber = 0;
        double heatTime = 0;
        int minutes = 0;
        double multiplier = 1;
        Scanner input = new Scanner(System.in);

        // Input
        try {
            while (inputErrorCheck == 1) {
                System.out.print("Choose your food, Sub-1, Pizza-2, Soup-3: ");
                itemAsNumber = input.nextInt();
                if (itemAsNumber >= 1 && itemAsNumber <= MAX_ITEMS) {
                    inputErrorCheck = 0;
                }
            }
            inputErrorCheck = 1;
            while (inputErrorCheck == 1) {
                System.out.print("Choose your amount, 1, 2, 3: ");
                amountAsNumber = input.nextInt();
                if (amountAsNumber >= 1 && amountAsNumber <= MAX_AMOUNT) {
                    inputErrorCheck = 0;
                }
            }

            // Process
            if (amountAsNumber == AMOUNT_IS_TWO) {
                multiplier = FIFTY_PRESENT;
            } else if (amountAsNumber == AMOUNT_IS_THREE) {
                multiplier = ONE_HUNDRED_PRESENT;
            }
            if (itemAsNumber == 1) {
                heatTime = SUB_HEAT_TIME * multiplier;
            } else if (itemAsNumber == 2) {
                heatTime = PIZZA_HEAT_TIME * multiplier;
            } else if (itemAsNumber == SOUP_NUMBER) {
                heatTime = SOUP_HEAT_TIME * multiplier;
            }
            while (heatTime >= ONE_MINUTE) {
                heatTime = heatTime - ONE_MINUTE;
                minutes++;
            }

            // Output
            System.out.print("\nHeat your food for " + minutes + " minute ");
            System.out.print(heatTime + " seconds");

            // Errors
        } catch (Exception e) {
            System.out.println("\nError(Letter)");
        } finally {
            System.out.println("\n\nDone.");
        }
        input.close();
    }
}
