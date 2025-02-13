import java.util.*;
import java.util.Stack;
public class InsAtBottom {
    public static void InsertAtBottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }

        // Pop the top element
        int top = st.pop();

        // Recursive call
        InsertAtBottom(st, element);

        // Push the top element back
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        InsertAtBottom(stack, 0);

        System.out.println("Stack after inserting at bottom: " + stack);
    }
}
