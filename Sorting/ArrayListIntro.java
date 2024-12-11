import java.util.*;

public class ArrayListIntro
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the list
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Use ArrayList to store elements
        List<Integer> num = new ArrayList<>();
        System.out.println("Enter the vector elements:");

        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt()); // Add input elements to the list
        }

        // Print the elements of the list
        System.out.println("Vector elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(num.get(i)); // Access elements using get()
        }
        
        sc.close();
    }
}