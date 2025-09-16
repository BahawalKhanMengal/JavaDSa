package SortingAlogs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6};
        bubble(arr);
        bubble(arr2);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        // taking boolean to check wether the array is already sorted or not 
        boolean swaped;
        // run the steps n-1 times 
        for (int i = 0; i < arr.length-1; i++) {
            swaped = false;
            // for the every step , max item will come to last respective index so the formula is n-i-1
            for (int j = 0; j < arr.length-i-1; j++) {

                // compare and swap the item when the previous is greater then newer
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            // checking if no swaps made then array is already sort and break
            if(!swaped){
                break;
            }
        }
    }
}
