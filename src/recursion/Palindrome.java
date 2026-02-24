package recursion;

import java.util.Scanner;

public class Palindrome {

    static boolean checkPalindrome(String s, int l, int r) {
        // Base case - cross pointer - palindrome
        if (l >= r) return true;

        // if element not match not palindrome
        if (s.charAt(l) != s.charAt(r)) return false;

        // move inside
        return checkPalindrome(s, l + 1, r - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();

        System.out.println(checkPalindrome(str, 0, str.length() - 1));

    }
}
