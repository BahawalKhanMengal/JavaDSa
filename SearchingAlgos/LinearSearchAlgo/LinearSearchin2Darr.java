package SearchingAlgos;

import java.util.Arrays;

public abstract class LinearSearchin2Darr {
    public static void main(String[] args) {
        int[][] arr = {
            {12,32,4,5},
            {55,44,66,77,8},
            {90,98,89}
        };
        System.out.println(searchIn2Dint(arr, 90));
        System.out.println(searchIn2D(arr, 98));
        System.out.println(Arrays.toString(searchIn2Darr(arr, 77)));
        System.out.println(max2D(arr));
    }
    // finding maximum in 2d array
    static int max2D(int[][] arr){
        int maximumValue = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>maximumValue) {
                    maximumValue = arr[i][j];
                }
            }
        }
        return maximumValue;
    }
    // giving the row and col of the target value
    static int[] searchIn2Darr(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }








    // giving the number as output
    static int searchIn2Dint(int[][] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return arr[i][j];
                }
            }
        }

        return -1;
    }
    static boolean searchIn2D(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }

        return false;
    }
}
