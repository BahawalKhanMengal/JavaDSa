package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {27,6,5,4,3,2,1};
        mergeInplace(arr, 0, arr.length);
        // System.out.println(Arrays.toString(mergeSort(arr)));
    }
    // merge sort inplace
    static void mergeInplace(int[] arr,int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = arr.length /2;
        mergeInplace(arr, s, mid);
        mergeInplace(arr, mid, e);

        mergeTo(arr,s,mid,e);
    }
    private static void  mergeTo(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int inc = 0;
        while(i<mid && j< e){
            if(arr[i]<arr[j]){
                mix[inc] = arr[i];
                i++;
            }else{
                mix[inc] = arr[j];
                j++;
            }
            inc++;
        }
        while(i<mid){
            mix[inc] = arr[i];
            i++;
            inc++;
        }
        while(j<e){
            mix[inc] = arr[j];
            j++;
            inc++;
        }
        System.arraycopy(mix, 0, arr, s, mix.length);         
    }
    // merge sort 
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int mixi = 0;
        while(i<first.length && j < second.length){
            if(first[i]<second[j]){
                mix[mixi] = first[i];
                i++;
            }else{
                mix[mixi] = second[j];
                j++;
            }
            mixi++;
        }
        while(i<first.length){
            mix[mixi] = first[i];
            i++;
            mixi++;
        }
        while(j<second.length){
            mix[mixi] = second[j];
            j++;
            mixi++;
        }
        return mix;
    }
}
