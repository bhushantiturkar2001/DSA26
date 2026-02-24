package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOnePointer {

    static void reverseArray(int i, int[] arr){
        int n = arr.length;
        if (i >= n/2) return;

        int temp =arr[i];
        arr[i] =arr[n-i-1];
        arr[n-i-1]=temp;

        reverseArray(i+1,arr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int arr[] = {2,4,1,9,3};
        reverseArray(0,arr);
        System.out.println(Arrays.toString(arr));

    }
}
