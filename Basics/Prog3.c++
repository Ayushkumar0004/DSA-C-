#include <iostream>
using namespace std;

int main() {
    char ch;
    cin >> ch;

    bool isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

    if (isVowel) {
        cout << ch << " is a vowel";
    } else {
        cout << "It is a consonant";
    }

    return 0;
}