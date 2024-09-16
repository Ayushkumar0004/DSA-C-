// package Sorting;
// Time complexity - O(n^2)
import java.util.Scanner;
// Selection sort:
// 71456
// 17456
// 14756
// 14576
// 14567

public class Prog1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("Array elements: " + arr[i]);
        }
        for(int i = 0; i < n - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] > arr[index])
                {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}