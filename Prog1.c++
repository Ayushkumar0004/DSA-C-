#include<iostream>
using namespace std;
int main()
{
    int marks;
    cout << "Enter the marks: ";
    cin >> marks;
    if(marks >= 70)
    {
        cout << "Pass";
    }
    else
    {
        cout << "Fail";
    }
    int a, b;
    cout << "Enter the value of a and b: ";
    cin >> a >> b;
    if(a > b)
    {
        cout << "a is greater than b";
    } 
    else
    {
        cout << "b is greater than a";
    }
}