package recursion;

import java.util.Scanner;

public class PrintNToOne {

    static void print(int i,int n){
        if (i < 1 ) return;
        System.out.println(i); // N to 1
        print(i-1,n);
        //System.out.println(i); // 1 to N with Backtracking
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int n = sc.nextInt();
        print(n, n);
    }
}
