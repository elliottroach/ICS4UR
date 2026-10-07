// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: Sep 2026
/  This program asks what is being heated and the amount and then tells you how
/  long to heat it for.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;
using std::string;

int main() {
    // Variables
    const float FIFTY_PERCENT = 1.5;
    const int ONE_HUNDRED_PERCENT = 2;
    const int SUB_HEAT_TIME = 60;
    const int PIZZA_HEAT_TIME = 45;
    const int SOUP_HEAT_TIME = 105;
    const int ONE_MINUTE = 60;
    string itemAsString;
    string amountAsString;
    int itemAsNumber;
    int amountAsNumber;
    int minutes = 0;
    int error = 1;
    float multiplier = 1;
    float heatTimeSeconds = 0;

    // Input
    try {
        while (error == 1) {
            cout << "Choose your food, Sub-1, Pizza-2, Soup-3: ";
            cin >> itemAsString;
            itemAsNumber = stoi(itemAsString);
            if (itemAsNumber >= 1 && itemAsNumber <= 3) {
                error = 0;
            }
        }
        error = 1;
        while (error == 1) {
            cout << "Choose your amount, 1, 2, 3: ";
            cin >> amountAsString;
            amountAsNumber = stoi(amountAsString);
            if (amountAsNumber >= 1 && amountAsNumber <= 3) {
                error = 0;
            }
        }

        // Process
        if (amountAsNumber == 2) {
            multiplier = FIFTY_PERCENT;
        } else if (amountAsNumber == 3) {
            multiplier = ONE_HUNDRED_PERCENT;
        }
        if (itemAsNumber == 1) {
            heatTimeSeconds = SUB_HEAT_TIME * multiplier;
        } else if (itemAsNumber == 2) {
            heatTimeSeconds = PIZZA_HEAT_TIME * multiplier;
        } else if (itemAsNumber == 3) {
            heatTimeSeconds = SOUP_HEAT_TIME * multiplier;
        }
        while (heatTimeSeconds >= ONE_MINUTE) {
            heatTimeSeconds = heatTimeSeconds - ONE_MINUTE;
            minutes++;
        }

        // Output
        cout << "\nHeat your food for " << minutes << " minute ";
        cout << heatTimeSeconds << " seconds";
    }
    catch (const std::invalid_argument &err) {
        cout << "\nError(Invalid)\n";
    }
    cout << "\n\nDone\n";

    return 0;
}
