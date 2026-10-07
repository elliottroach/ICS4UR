// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: Sep 2026
/  This program asks for width and height of your board and then tells you how
/  long it needs to be to be one board foot.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;
using std::string;

float boardFootCalculations(float widthAsNumber, float heightAsNumber) {
    // This function calculates the length of one board foot.
    // Variables
    const int ONE_BOARD_FOOT = 144;
    float length;

    // Process
    length = (ONE_BOARD_FOOT / (widthAsNumber * heightAsNumber));

    return length;
}

int main() {
    // Variables
    string widthString;
    string heightAsString;
    float widthAsNumber;
    float heightAsNumber;
    float lengthOutput = 0;
    bool error = true;

    // Input
    try {
        while (error) {
            cout << "Enter the width(inch): ";
            cin >> widthString;
            widthAsNumber = stof(widthString);
            if (widthAsNumber > 0) {
                error = false;
            }
        }
        error = true;
        while (error) {
            cout << "Enter the height(inch): ";
            cin >> heightAsString;
            heightAsNumber = stof(heightAsString);
            if (heightAsNumber > 0) {
                error = false;
            }
        }

        // Process
        lengthOutput = boardFootCalculations(widthAsNumber, heightAsNumber);

        // Output
        cout << "\nThe wood should be " << lengthOutput << " inch(es) long. ";
    }
    catch (const std::invalid_argument &err) {
        cout << "\nError(Invalid)\n";
    }
    cout << "\n\nDone\n";

    return 0;
}
