package ArraysCodes;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        System.out.println("this is arrays lectures");
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int j:arr){
            System.out.println(j);
        }
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = in.nextInt();
        // }
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.println(arr1[i] + " this is the print after adding nums to arr1");
        // }
        int[][] arr2 = {{12,13,23,4,5},{1,2,3,4,5}};
        // enhenced for loop for 2d array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]+ " ");
            }
            
        }
        System.out.println(Arrays.toString(arr2));
        // for loops in different methods 
        System.out.println("enhenced for loop for 2d arrays");
        for(int[] i:arr2){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
