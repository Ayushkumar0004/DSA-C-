// // Selection Sort;
// import java.util.Scanner;
// public class prac 
// {
//     public static void SelectionSort(int arr[], int n)
//     {
//         for(int i = 0; i < n - 1; i++)
//         {
//             int index = i;
//             for(int j = i + 1; j < n; j++)
//             {
//                 if(arr[j] > arr[index])
//                 {
//                     index = j;
//                 }
//             }
//         int temp = arr[i];
//         arr[i] = arr[index];
//         arr[index] = temp;
//         }
//         System.out.println("Sorting elements are: ");
//         for(int i = 0; i < n; i++)
//         {
//             System.out.println(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements: ");
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Array elements are: ");
//         for(int i = 0 ; i < n; i++)
//         {
//             System.out.println(arr[i]);
//         }
//         SelectionSort(arr, n);
//         sc.close();
//     }
// }


// // Insertion Sort

// import java.util.Scanner;

// public class prac
// {
//     public static void InsertionSort(int arr[], int n)
//     {
//         for(int i = 1 ; i < n ; i++)
//         {
//             for(int j = i; j > 0; j--)
//             {
//                 if(arr[j] < arr[j - 1])
//                 {
//                 int temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//         }
//         System.out.println("Sorting elements are: ");
//         for(int i = 0; i < n; i++)
//         {
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements: ");
//         for(int i = 0 ; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++)
//         {
//             System.out.println("Array elements " + i + " are: "+ arr[i]);
//         }
//         InsertionSort(arr, n);
//         sc.close();
//     }
// }

// Bubble Sort
import java.util.Scanner;
public class prac
{
    public static void BubbleSort(int arr[], int n)
    {
        for(int  i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
            }
        }
        System.out.println("Sorting elements are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("Array elements " + i + " are : " + arr[i]);
        }
        BubbleSort(arr, n);
    }
}