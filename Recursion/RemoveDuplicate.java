package Recursion;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}
