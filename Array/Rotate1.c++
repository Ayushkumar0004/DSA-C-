#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the size of the array (up to 1000): ";
    cin >> n;
    
    int arr[1000];
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int last = arr[n - 1];  // Store the last element

    for (int i = n - 1; i > 0; i--) {  // Shift elements to the right
        arr[i] = arr[i - 1];
    }
    arr[0] = last;  // Move the last element to the first position

    cout << "Array after rotation: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
