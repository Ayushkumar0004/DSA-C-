import java.util.*;
public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Change this value to the number you want to find the square root of
        int n = sc.nextInt();
        int start = 0, end = n, mid;
        int index = -1; // To store the integer square root

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == n) {
                index = mid;
                break; // Perfect square found
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (index == -1) {
            index = end; // Return the integer part of the square root
        }

        System.out.println("The integer square root of " + n + " is: " + index);
        sc.close();
    }
}
