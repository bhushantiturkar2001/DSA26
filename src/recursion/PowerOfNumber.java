package recursion;

import java.util.*;

public class PowerOfNumber {

    static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int x = sc.nextInt();

        System.out.print("Enter power: ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println("Result: " + result);
    }
}
