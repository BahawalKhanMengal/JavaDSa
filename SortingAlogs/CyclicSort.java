package SortingAlogs;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] arr2 ={3,0,2,1};
        int[] arr3 = {9,7,6,5,3,2,1,5,3};
        int[] arr5 = {4,0,1,1};
        int ans = findDuplicate(arr5);
        System.out.println("this answer is for firstMissingPositive Number in the array");
        System.out.println(firstMissingPositive(arr5));
        cyclicSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        List<Integer> arr4 =  allMissingNumbers(arr3);
        System.out.println();
        System.out.println(missingNumber(arr2));
        System.out.println(arr4);
        System.out.println(ans);

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
    // leet code proble missing positive number range from 0 to n 
    static int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }     
        }
        return arr.length;
    }
    // leet code question all missing numbers range form 1 to n ;
    static List<Integer> allMissingNumbers(int[]arr){
        int i = 0;
        
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    // find duplicate number in array from range 1 to n where just one duplicate number exists leetcode question

    static int findDuplicate(int[] arr){
        int i = 0;

        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return arr[j];
            }
        }
        return -1;
    }
    // find all duplicates in array 
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{i++;}}
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                ans.add(nums[j]);}}
        return ans;}

        // try to find mismatch and give both the duplicate and mismatch in the form of array

        static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{i++;}}
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] != j + 1){
                    return new int[]{nums[j],j+1};
                }
            }
            return new int[]{-1,-1};
    }

    // first missing positive leetcode question

    static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                return j + 1;
            }     
        }
        return nums.length + 1;
    }
}
