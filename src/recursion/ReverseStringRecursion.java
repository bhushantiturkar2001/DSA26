package recursion;

import java.util.*;

public class ReverseStringRecursion {

    static String reverse(String s) {

        // Base case
        if (s.length() == 0) return s;

        // Take first character
        char first = s.charAt(0);

        // Remaining string
        String rest = s.substring(1);

        // Recursive call
        return reverse(rest) + first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = reverse(str);

        System.out.println("Reversed: " + result);
    }
}
