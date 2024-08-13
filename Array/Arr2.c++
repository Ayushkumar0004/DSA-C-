#include <iostream>
#include <climits>
using namespace std;

int main()
{
    int ans = INT_MIN;
    int n;
    cout << "Enter the size of Array: ";
    cin >> n;
    int a[n];
    cout << "Enter " << n << " elements: ";
    for(int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << "Array values: ";
    for(int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    
    for(int i = 0; i < n; i++)
    {
        if(a[i] > ans)
        {
            ans = a[i];
        }
    }
    cout << "Maximum value in the array: " << ans << endl;
    
    return 0;
}
