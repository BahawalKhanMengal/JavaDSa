package ArraysCodes;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args){
        int[] arr = {7,12,9,11,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        for(int index = 0; index < arr.length-1; index++) {
            for(int inner = 0; inner <arr.length - index -1 ; inner++) {
// check if value at  inner greater than value at inner + 1 than swap
                if (arr[inner] > arr[inner+1]){
                    int temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
        }
    }
}
