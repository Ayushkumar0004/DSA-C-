#include <iostream>
using namespace std;

int main() {
    int a[5];
    cout << "Enter the array elements: ";
    for (int i = 0; i < 5; i++) {  // Corrected loop to iterate from 0 to 4
        cin >> a[i];
    }
    
    cout << "Array elements in reverse order: ";
    for (int i = 4; i >= 0; i--) {  // Loop to iterate from 4 to 0
        cout << a[i] << " ";
    }
    cout << endl;
    
    return 0;
}
