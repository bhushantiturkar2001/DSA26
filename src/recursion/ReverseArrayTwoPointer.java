package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayTwoPointer {

    static void reverseArray(int[] arr, int l, int r){

        if (l>=r)return;

        int temp=arr[l];
        arr[l] =arr[r];
        arr[r] = temp;

        reverseArray(arr,l+1,r-1);

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

        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
