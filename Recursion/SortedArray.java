package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        System.out.println(isSorted(arr, 0));
        System.out.println(linearSearch(arr, 2, 0));
    }
    static int linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr, target, index+1);
    }
    static boolean isSorted(int[] arr,int start){
        if(start == arr.length-1){
            return  true;
        }
        if(arr[start]<=arr[start+1]){
            return isSorted(arr, start+1);
        }
        return false;
    }

}
