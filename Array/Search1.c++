#include<iostream>
using namespace std;
int main()
{
    int x;
    int a[5];
    for(int i = 0; i < 5; i++)
    {
        cin >> a[i];
    }
    cin >> x;
    for(int i = 0; i < 5; i++)
    {if(x == a[i])
    {
        return i;
    }
    }
    return -1;
    
}