import java.util.*;
import java.util.Stack;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> st = new Stack<>();  // Use Character instead of char

        // Push each character into the stack
        for (char c : input.toCharArray()) {
            st.push(c);
        }

        // Pop characters to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!st.isEmpty()) {
            reversed.append(st.pop());
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
