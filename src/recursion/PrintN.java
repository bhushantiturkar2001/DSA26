package recursion;

import java.util.Scanner;

public class PrintN {

    static void print(int i, int n) {
        if (i > n) return;
        System.out.println("Google");
        print(i + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int n = sc.nextInt();

        print(1, n);
    }
}
