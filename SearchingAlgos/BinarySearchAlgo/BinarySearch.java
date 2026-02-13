package SearchingAlgos.BinarySearchAlgo;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 20, 36, 66, 77, 88, 99, 900};
        int target = 88;
        System.out.println(binarySearch(arr, target));
    }
//  returning the index of the element
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end) / 2; when we use this formula when the start and end are very large then it will give us error because in java int can a store a range of numbers to solve that problem the efficent formula to calculate mid is given below.
            int mid = start + (end-start) /2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
