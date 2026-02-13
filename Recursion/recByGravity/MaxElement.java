package Recursion.recByGravity;

public class MaxElement {
    public static void main(String[] args){
        int[] arr = {5,4,1,7,9,2};
        System.out.println(getMax(arr,0));
    }
    static int getMax(int[] arr, int index){
        if (index == arr.length-1){
            return arr[index];
        }
        int misa = getMax(arr,index+1);
        if (misa>arr[index]){
            return misa;
        }else {
           return arr[index];
        }
    }
}
