package ArraysCodes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array list in java syntx
        ArrayList<Integer> arr = new ArrayList<>();
        // adding element in array list
        arr.add(34);
        // printing whole array list 
        System.out.println(arr);
        // setting a element at specific index
        arr.set(0,22);
        System.out.println(arr);

        // removing a element from the array list
        arr.remove(0);
        System.out.println(arr);
        // inputng into array list
        for (int i = 0; i < 5; i++) {
            arr.add(in.nextInt());
        }
        // getting array element from the spacific index
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
