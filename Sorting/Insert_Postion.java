import java.util.*;

class InsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    
    public static void main(String[] args) {
        int arr[] = {13, 33, 55, 65};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int inserted = searchInsert(arr, target);
        System.out.println("Insert position: " + inserted);
        
        sc.close();
    }
}
