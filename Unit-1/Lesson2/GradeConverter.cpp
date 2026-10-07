// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: Sep 2026
/  This program asks for a number grade and converts it to a letter grade and it
/  checks for honour role status.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;
using std::string;

int main() {
    // Variables
    const int F = 49;
    const int D_MINUS = 52;
    const int D = 56;
    const int D_PLUS = 59;
    const int C_MINUS = 62;
    const int C = 66;
    const int C_PLUS = 69;
    const int B_MINUS = 72;
    const int B = 76;
    const int B_PLUS = 79;
    const int A_MINUS = 86;
    const int A = 94;
    const int A_PLUS = 100;
    const int HONOUR_ROLE = 80;
    const int GOLDEN_HONOUR_ROLE = 90;
    int numberGrade;
    int error = 0;
    string numberGradeAsString;
    string letterGrade = "Placeholder";
    string honourRoleStatus = "";

    // Input
    try {
        cout << "Enter your grade: ";
        cin >> numberGradeAsString;
        numberGrade = stoi(numberGradeAsString);
    }
    catch (const std::invalid_argument &err) {
        cout << "\nError(Invalid)\n";
        error = 1;
    }

    // Process
    if (error == 0) {
        if (numberGrade >= 0) {
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

            // Checking for honor role
            if (numberGrade >= GOLDEN_HONOUR_ROLE) {
                honourRoleStatus = (
                    "\nYou made it onto the Golden Honour Roll!!");
            } else if (numberGrade >= HONOUR_ROLE) {
                honourRoleStatus = "\nYou made it onto the Honour Roll!!";
            }

            // Output
            cout << "You got an " << letterGrade;
            cout << honourRoleStatus << endl;
            cout << "\nDone\n";
        } else {
            cout << "\nError(Negitive)\n";
        }
    }

    return 0;
}
