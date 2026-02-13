package Recursion;

import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int[] arr = {1,9,3};
        int[]  arr2 = plusOne(arr);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length];
        int size = digits.length;
        int j = 0;
        if (digits.length == 0)
            return arr;
        if (digits.length == 1 && digits[0] == 9) {
            arr = new int[size +1 ];
            arr[j] = 1;
            j++;
            arr[j] = 0;
            return arr;
        }
        if (digits.length == 1) {
            arr[0] = digits[0] + 1;
            return arr;
        }
        int i = 0;
        while (i<arr.length + 1) {
            if (i == arr.length - 1) {
                if (digits[i] == 9) {
                    arr = new int[size + 1];
                    arr[j] = 1;
                    j++;
                    arr[j] = 0;
                }
                arr[j] = digits[i] + 1;
                j++;

            } else {
                if (digits[i] == 9) {
                    arr = new int[size + 1];
                    arr[j] = 1;
                    j++;
                    arr[j] = 0;
                    j++;
                }
                arr[j] = digits[i];
                j++;
            }
            i++;
        }
        return arr;
    }
}
