package Lesson1;
import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: Sep 2026
*  This program asks for length and width and finds the area and perimeter.
*/

public final class AreaAndPrimiter {
    /**
        * Prevent instantiation.
        * Throw an exception IllegalStateException.
        * if this is ever called
        *
        * @throws IllegalStateException if this is ever called
        *
        */
    private AreaAndPrimiter() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        int length;
        int width;
        int area;
        int primiter;

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Length is: ");
        length = input.nextInt();
        System.out.print("Width is: ");
        width = input.nextInt();
        input.close();

        // Process
        if (length > 0 && width > 0) {
            area = (length * width);
            primiter = (2 * (length + width));

            // Output
            System.out.println("\nArea is: " + area);
            System.out.println("Primiter is: " + primiter);

            System.out.println("\nDone.");
        } else {
            System.out.println("Error(negitive)");
        }
    }
}
