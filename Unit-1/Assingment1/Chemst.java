package Assingment1;

import java.util.Scanner;

/* Created by: Elliott Roach
*  Created on: oct 2026
*  This program is the game Chemst. You get a random number and try to guess
*  the ratio.
*/

public final class Chemst {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Chemst() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * A constant representing some percentage.
    */
    private static final double ERROR_MARGIN = 0.05;
    /**
    * /**
    * A constant representing some number(7/3).
    */
    private static final double RATIO = 2.3333333;
    /**
    * /**
    * A constant representing some number.
    */
    private static final double MAX_RATIO_OFF_BY = (
        RATIO + (RATIO * ERROR_MARGIN));
    /**
    * A constant representing some number.
    */
    private static final double MINIMUN_RATIO_OFF_BY = (
        RATIO - (RATIO * ERROR_MARGIN));
    /**
    * A constant representing some number.
    */
    private static final int MAX_RANDOM_ASID_AMOUNT = 100;
    /**
    * A constant representing some number.
    */
    private static final int AMOUNT_OF_LIVES = 9;

    /**
    * The starting acidToWaterRatio() function.
    *
    * @param waterLiters
    * @param acidLiters
    * @return kaboom
    */
    public static Boolean acidToWaterRatio(final float waterLiters,
        final double acidLiters) {
        // This function calculates the ratio of water to acid
        // Variables
        boolean kaboom = false;
        double ratio = 0;

        ratio = waterLiters / acidLiters;
        if (ratio <= MAX_RATIO_OFF_BY && ratio >= MINIMUN_RATIO_OFF_BY) {
            kaboom = false;
        } else {
            kaboom = true;
        }

        return kaboom;
    }

    /**
        * The starting randomizeAsidAmount() function.
        *
        * @return acidLiters
        */
    public static double randomizeAsidAmount() {
        // This function will randomize the amount of acid
        // Variables
        double acidLiters = 0;

        while (acidLiters == 0) {
            acidLiters = (int) (Math.random() * MAX_RANDOM_ASID_AMOUNT);
        }

        return acidLiters;
    }

    /**
        * The starting main() function.
        *
        * @param args No args will be used
        */
    public static void main(final String[] args) {
        // Variables
        boolean kaboom = false;
        boolean exit = false;
        boolean inputError = true;
        int livesLeft = AMOUNT_OF_LIVES;
        int experimentsSurvived = 0;
        float waterLiters = 0;
        double acidLiters;
        String errorCatch = "";
        Scanner input = new Scanner(System.in);

        // Intro
        System.out.print("\nThe fictitious chemical Kryptocyanic acid can ");
        System.out.print("only be diluted by the ratio of\n7 parts water to 3");
        System.out.print(" parts acid.\nIf any other ratio is attempted, the ");
        System.out.print("acid becomes unstable and soon explodes.\nGiven the");
        System.out.print(" amount of acid, you must decide how much water to ");
        System.out.print("add for dilution.\nIf you miss you face the ");
        System.out.print("consequences.\n");
        System.out.print("Type -1 to exit.");


        // Game while loop
        while (!exit) {
            // Reset for next round
            waterLiters = 0;
            acidLiters = randomizeAsidAmount();
            System.out.println("\n");
            inputError = true;

            // Input
            while (inputError) {
                System.out.print(acidLiters + " Liters of Kryptocyanic ");
                System.out.print("acid. How much water?: ");
                try {
                    waterLiters = input.nextFloat();
                } catch (Exception e) {
                    errorCatch = input.nextLine();
                    System.out.println("\nError(" + errorCatch + ")\n");
                }
                if (waterLiters > 0) {
                    inputError = false;
                } else if (waterLiters == -1) {
                    inputError = false;
                    exit = true;
                }
            }

            // Process
            if (!exit) {
                kaboom = acidToWaterRatio(waterLiters, acidLiters);

                // Output
                if (!kaboom) {
                    System.out.print("Good job! You may breathe now, but ");
                    System.out.print("don't inhale the fumes!");
                    experimentsSurvived++;
                } else if (kaboom && livesLeft > 1) {
                    System.out.print("SIZZLE! You have just been ");
                    System.out.print("desalinated into a blob of ");
                    System.out.print("quivering protoplasm!\n");
                    livesLeft--;
                    System.out.print("However, you have " + livesLeft);
                    System.out.print(" lives left.");
                } else if (kaboom && livesLeft <= 1) {
                    System.out.print("SIZZLE! You have just been ");
                    System.out.print("desalinated into a blob of ");
                    System.out.print("quivering protoplasm!\n");
                    System.out.print("Your 9 lives are used.\nBut you ");
                    System.out.print("will be long remembered for your ");
                    System.out.print(experimentsSurvived);
                    System.out.print(" contributions to the field of\ncomic");
                    System.out.print(" book chemistry.\n");
                    exit = true;
                }
            }
        }
        System.out.print("\nGame Over\n\n");
        input.close();
    }
}
