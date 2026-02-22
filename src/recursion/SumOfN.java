package recursion;

import java.util.Scanner;

public class SumOfN {

    static int sum(int i, int n) {
        if (i > n) return 0;     // base case
        return i + sum(i + 1, n); // current + remaining
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int n = sc.nextInt();

        System.out.println(sum(1, n));
    }
}
