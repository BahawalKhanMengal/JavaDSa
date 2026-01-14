package Recursion.recByGravity;

public class PrintArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printArr(arr,arr.length-1);
        System.out.println();
        print(arr,0);
        System.out.println();
        printReverse(arr,0);
    }
//    display reverse array elements
    static void printReverse(int[] arr , int index){
        if ( index == arr.length){
            return;
        }
        printReverse(arr,index + 1);
        System.out.print(arr[index] + " ");
    }
//    using head recursion
    static void printArr(int[] arr, int index){
        if (index < 0){
            return;
        }
        printArr(arr,index-1);
        System.out.print(arr[index] + " ");
    }
//    using tail recursion
    static void print(int[] arr, int index){
        if (index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        print(arr,index+1);
    }
}
