package Recursion.recByGravity;

public class FirstOccurence {
    public static void main(String[] args){
        int[] arr = {5,4,1,7,9,2,9,4};
        System.out.println(firstOccur(arr,0,9));
        System.out.println(lastOccur(arr,arr.length-1,5));
    }
//    last occurence
    static int lastOccur(int[] arr, int index,int target){
        if (index < 0){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return lastOccur(arr,index-1,target);
        }
    }
//    first occurence of the element
    static int firstOccur(int[] arr, int index,int target){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return firstOccur(arr,index+1,target);
        }
    }
}
