package Recursion;

import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,2,4,5,6,7};
        System.out.println(isSorted(arr, 0));
        System.out.println(linearSearch(arr, 2, 0));
        search(arr, 2, 0);
        System.out.println(list);
        System.out.println(searchList(arr, 2, 0, new ArrayList<>()));

    }
    // retrun arraylist
    static ArrayList searchList(int[] arr, int target, int index,ArrayList<Integer> list1){
        if(index == arr.length){
            return list1;
        }
        if(arr[index]==target){
            list1.add(index);
        }
        return  searchList(arr, target, index+1,list1);
    }
    // find all occurences
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        search(arr, target, index+1);
    }
    // linearSearch
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
