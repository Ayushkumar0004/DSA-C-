import java.util.*;
import java.util.Stack;
public class StringMani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.println("Reversed: " + reverseString(input));
        System.out.println("Without vowels: " + removeVowels(input));
        
        sc.close();
    }

    // Reverse a string using stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // Remove vowels from a string
    public static String removeVowels(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!vowels.contains(ch + "")) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
