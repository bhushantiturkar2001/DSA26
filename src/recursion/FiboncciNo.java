package recursion;

import java.util.Scanner;

public class FiboncciNo {

    static int fib(int n) {
        if (n <= 1) return n;
        int last = fib(n - 1);
        int slast = fib(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int n = sc.nextInt();

        System.out.println(fib(n));

    }
}
