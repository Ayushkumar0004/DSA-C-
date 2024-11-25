import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] charArray = s1.toCharArray();
        int start = 0, end = charArray.length - 1;
        while(start < end)
        {
            char temp = charArray [start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(charArray);
        System.out.println("Reversed string: " + reversedString);
    }
}
