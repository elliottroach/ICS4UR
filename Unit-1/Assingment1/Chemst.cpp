// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: oct 2026
/  This program is the game Chemst. You get a random number and try to guess
/  the ratio.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;
using std::string;

bool acidToWaterRatio(float waterLiters, double acidLiters) {
    // This function calculates the ratio of water to acid
    // Variables
    const float ERROR_MARGIN = 0.05;
    // RATIO is 7/3
    const double RATIO = 2.3333333;
    const double MAX_RATIO_OFF_BY = (RATIO + (RATIO * ERROR_MARGIN));
    const double MINIMUN_RATIO_OFF_BY = (RATIO - (RATIO * ERROR_MARGIN));
    bool kaboom = false;
    double ratioOfPlayer = 0;

    // Process
    ratioOfPlayer = waterLiters / acidLiters;
    if (ratioOfPlayer <= MAX_RATIO_OFF_BY &&
        ratioOfPlayer >= MINIMUN_RATIO_OFF_BY) {
            kaboom = false;
        } else {
            kaboom = true;
        }

    return kaboom;
}

double randomizeAsidAmount() {
    // This function will randomize the amount of acid
    // Variables
    const int MAX_RANDOM_ASID_AMOUNT = 100;
    double acidLiters = 0;

    while (acidLiters == 0) {
        acidLiters = rand() % MAX_RANDOM_ASID_AMOUNT;
    }

    return acidLiters;
}

int main() {
    // Variables
    bool kaboom = false;
    bool running = true;
    bool inputError = true;
    int livesLeft = 9;
    int experimentsSurvived = 0;
    float waterLiters = 0;
    double acidLiters;
    string waterLitersAsString = "";
    string errorCatch = "";

    // Getting a random time to use for randomization
    srand(time(0));

    // Intro
    cout << "\nThe fictitious chemical Kryptocyanic acid can "
    << "only be diluted by the ratio of\n7 parts water to 3"
    << " parts acid.\nIf any other ratio is attempted, the acid "
    << "becomes unstable and soon explodes.\nGiven the "
    << "amount of acid, you must decide how much water to "
    << "add for dilution.\nIf you miss you face the consequences.\n"
    << "Type -1 to exit.\n";

    // Game while loop
    while (running) {
        // Reset for next round
        waterLiters = 0;
        acidLiters = randomizeAsidAmount();
        inputError = true;
        cout << "\n\n";

        // Input
        while (inputError) {
            cout << acidLiters << " Liters of Kryptocyanic "
            << "acid. How much water?: ";
            cin >> waterLitersAsString;
            try {
                waterLiters = stof(waterLitersAsString);
            }
            catch (const std::invalid_argument &err) {
                cout << "\nError(Invalid)\n\n";
            }
            if (waterLiters > 0) {
                inputError = false;
            } else if (waterLiters == -1) {
                inputError = false;
                running = false;
            }
        }

        // process
        if (running) {
            kaboom = acidToWaterRatio(waterLiters, acidLiters);

            // Output
            if (!kaboom) {
                cout << "Good job! You may breathe now, but "
                << "don't inhale the fumes!";
                experimentsSurvived++;
            } else if (kaboom && livesLeft > 1) {
                cout << "SIZZLE! You have just been desalinated into a blob of"
                << " quivering protoplasm!\n";
                livesLeft--;
                cout << "However, you have " << livesLeft << " lives left.";
            } else if (kaboom && livesLeft <= 1) {
                cout << "SIZZLE! You have just been desalinated into a blob of"
                << " quivering protoplasm!\n\n"
                << "Your 9 lives are used.\nBut you will be long "
                << "remembered for your " << experimentsSurvived << " "
                << "contributions to the field of\n"
                << "comic book chemistry.\n";
                running = false;
            }
        }
    }
    cout << "\nGame Over\n\n";

    return 0;
}
