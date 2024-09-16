import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size and elements
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Display the array elements
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        // Sorting array using insertion sort
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        
        // Display the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        // Input the key to search
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        
        // Binary search logic
        int start = 0, end = n - 1;
        boolean found = false;
        
        while (start <= end) {
            // for median of array
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element not found!");
        }
        
        sc.close();
    }
}
