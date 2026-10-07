// Copyright (c) 2026 St. Mother Teresa HS All rights reserved.

/* Created by: Elliott Roach
/  Created on: Sep 2026
/  This program asks for length and width and finds the area and perimeter.
*/

#include <iostream>
using std::cout;
using std::endl;
using std::cin;

int main() {
    // Variables
    int length;
    int width;
    int area;
    int perimeter;

    // Input
    cout << "Length is: ";
    cin >> length;
    cout << "Width is: ";
    cin >> width;

    // process
    if (length > 0 && width > 0) {
        area = length * width;
        perimeter = 2 * (length + width);

        // Output
        cout << "\nArea is: " << area << endl;
        cout << "perimeter is " << perimeter << endl;
        cout << "\nDone\n";
    } else {
        cout << "\nError(negitive)\n";
    }

    return 0;
}
