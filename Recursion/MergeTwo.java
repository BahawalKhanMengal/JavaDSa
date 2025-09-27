package Recursion;

public class MergeTwo {
    public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, nums2.length);
        for(int num : nums1){
            System.out.println(num);
        }
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m - 1;     // last element of nums1's actual data
        int j = n - 1;     // last element of nums2
        int k = m + n - 1; // last position of nums1
        
        // Merge from the end to avoid overwriting
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
