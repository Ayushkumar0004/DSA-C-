import java.util.*;
import java.util.Stack;
public class ArrayBeautiful {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, -2, 3, -4, 5}; // Example input
        
        for (int num : arr) {
            // Remove elements while stack is not empty and signs are different
            while (!stack.isEmpty() && (stack.peek() >= 0) != (num >= 0)) {
                stack.pop();
            }
            stack.push(num);
        }

        System.out.println("Final stack: " + stack);
    }
}
