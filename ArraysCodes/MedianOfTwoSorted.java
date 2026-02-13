package ArraysCodes;

import java.util.ArrayList;

public class MedianOfTwoSorted {
    public static void main(String[] args) {
//         Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int medain = 0;
        ArrayList<Integer> comb = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            comb.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            comb.add(nums2[i]);
        }
        if(comb.size() % 2 != 0){
            medain = 0 + (comb.size()-0)/2;
            double ans = comb.get(medain);
            return ans;
        }else{
           medain = 0 + (comb.size()-0)/2;
            double ans = comb.get(medain-1) + comb.get(medain);
            ans = ans/2;
            return ans; 
        }
        
    }
}
