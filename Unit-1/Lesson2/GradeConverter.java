package Lesson2;
import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: Sep 2026
*  This program asks for a number grade and converts it to a letter grade and it
*  checks for honour role status.
*/

public final class GradeConverter {
    /**
        * Prevent instantiation.
        * Throw an exception IllegalStateException.
        * if this is ever called
        *
        * @throws IllegalStateException if this is ever called
        *
        */
    private GradeConverter() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
        * A constant representing some number.
        */
    private static final int F = 49;
    /**
        * A constant representing some number.
        */
    private static final int D_MINUS = 52;
    /**
        * A constant representing some number.
        */
    private static final int D = 56;
    /**
        * A constant representing some number.
        */
    private static final int D_PLUS = 59;
    /**
        * A constant representing some number.
        */
    private static final int C_MINUS = 62;
    /**
        * A constant representing some number.
        */
    private static final int C = 66;
    /**
        * A constant representing some number.
        */
    private static final int C_PLUS = 69;
    /**
        * A constant representing some number.
        */
    private static final int B_MINUS = 72;
    /**
        * A constant representing some number.
        */
    private static final int B = 76;
    /**
        * A constant representing some number.
        */
    private static final int B_PLUS = 79;
    /**
        * A constant representing some number.
        */
    private static final int A_MINUS = 86;
    /**
        * A constant representing some number.
        */
    private static final int A = 94;
    /**
        * A constant representing some number.
        */
    private static final int A_PLUS = 100;
    /**
        * A constant representing some number.
        */
    private static final int HONOUR_ROLE = 80;
    /**
        * A constant representing some number.
        */
    private static final int GOLDEN_HONOUR_ROLE = 90;

    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        int numberGrade;
        String letterGrade = "PlaceHolder";
        String honourRole = "";
        Scanner input = new Scanner(System.in);

        // Input
        try {
            System.out.print("Enter your Grade: ");
            numberGrade = input.nextInt();

            if (numberGrade > 0) {
                // Process
                if (numberGrade <= F) {
                    letterGrade = "F";
                } else if (numberGrade <= D_MINUS) {
                    letterGrade = "D-";
                } else if (numberGrade <= D) {
                    letterGrade = "D";
                } else if (numberGrade <= D_PLUS) {
                    letterGrade = "D+";
                } else if (numberGrade <= C_MINUS) {
                    letterGrade = "C-";
                } else if (numberGrade <= C) {
                    letterGrade = "C";
                } else if (numberGrade <= C_PLUS) {
                    letterGrade = "C+";
                } else if (numberGrade <= B_MINUS) {
                    letterGrade = "B-";
                } else if (numberGrade <= B) {
                    letterGrade = "B";
                } else if (numberGrade <= B_PLUS) {
                    letterGrade = "B+";
                } else if (numberGrade <= A_MINUS) {
                    letterGrade = "A-";
                } else if (numberGrade <= A) {
                    letterGrade = "A";
                } else if (numberGrade <= A_PLUS) {
                    letterGrade = "A+";
                }
                if (numberGrade >= HONOUR_ROLE) {
                    honourRole = "You made it onto the Honour Roll!!";
                }
                if (numberGrade >= GOLDEN_HONOUR_ROLE) {
                    honourRole = "You made it onto the Golden Honour Roll!!";
                }

                // Output
                System.out.println("You got an " + letterGrade + "!");
                System.out.println(honourRole);

            } else {
                System.out.println("Error(Negitive)");
            }
        } catch (Exception e) {
            System.out.println("Error(Letter)");
        }

        System.out.println("\nDone.");
        input.close();
    }
}
