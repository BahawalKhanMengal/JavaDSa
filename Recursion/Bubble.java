package Recursion;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,7,8,9,23,0};
        int[] arr2 = {1,2,3,4,5,6};
        int outer = 0;
        int inner = 0;
        sort(arr, outer, inner);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int outer, int inner ){
        if(outer>=arr.length){
            return;
        }
        if(inner<arr.length-1-outer){
            if(arr[inner]>arr[inner+1]){
                int temp = arr[inner];
                arr[inner] = arr[inner+1];
                arr[inner + 1] = temp;
                sort(arr, outer, inner+1);
            }
            sort(arr, outer, inner+1);
        }else{
            sort(arr, outer+1, inner=0);
        }
    }
}
