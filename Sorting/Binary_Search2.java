// first and last Occurence
import java.util.Scanner;
public class Binary_Search2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 8, 14, 16, 16, 16, 22, };
        int n = arr.length;
        System.out.println("Enter the target to search: ");
        int target = sc.nextInt();
        int first = FirstOccurence(arr, target, n);
        System.out.println(first);
        int last = LastOccurence(arr, target, n);
        System.out.println(last);
        sc.close();
    }
    public static int FirstOccurence(int arr[], int target, int n)
    {
        int start = 0, end = n - 1; 
        int first = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                first = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return first;
    }
    public static int LastOccurence(int arr[], int target, int n)
    {
        int start = 0, end = n - 1; 
        int last = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                last = mid;
                start = mid + 1;
            }
            // Right side move
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            // left side move
            else
            {
                end = mid - 1;
            }
        }
        return last;
    }
}