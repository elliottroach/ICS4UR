// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: Sep 2026
/  This program asks for five numbers and then finds the average.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;
using std::string;

int main() {
    // Variables
    const int PLACE_HOLDER_NUMBER = 0;
    const int AMOUNT_OF_NUMBERS = 5;
    float numbers[AMOUNT_OF_NUMBERS] = {
        PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER,
        PLACE_HOLDER_NUMBER, PLACE_HOLDER_NUMBER};
    float average = 0;
    string tempNumberAsString;
    float tempNumber = 0;
    int error = 0;
    int counter = 0;

    // Input
    while (counter < 5) {
        try {
            cout << "Enter a number: ";
            cin >> tempNumberAsString;
            tempNumber = stof(tempNumberAsString);
        }
        catch (const std::invalid_argument &err) {
            cout << "\nError(Invalid)\n";
            error = 1;
            break;
        }
        numbers[counter] = tempNumber;
        counter++;
    }

    // Process
    counter = 0;
    while (counter < 5) {
        average = average + numbers[counter];
        counter++;
    }
    average = average / AMOUNT_OF_NUMBERS;

    // Output
    if (error == 0) {
        counter = 0;
        cout << "\nThe average of: ";
        while (counter < 5) {
            cout << numbers[counter] << ", ";
            counter++;
        }
        cout << "\nIs: " << average;
        cout << "\n\nDone\n";
    }

    return 0;
}
