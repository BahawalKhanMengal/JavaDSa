package ArraysCodes;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {7,12,9,11,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        for(int outer = 0; outer < arr.length -1; outer++) {
            int minIndex = outer;
            for(int inner = minIndex + 1; inner < arr.length; inner++) {
                if (arr[inner] < arr[minIndex]){
                    minIndex = inner;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[outer];
            arr[outer] = temp;
        }
    }
}
