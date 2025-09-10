package SearchingAlgos.BinarySearchAlgo;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 20, 36, 66, 77, 88, 99, 900};
        int[] arr2 = {900, 99, 88, 77, 66, 36, 20, 6, 5, 4, 3, 2};
        int target = 88;
        System.out.println(orderAgnosticBS(arr, target));
        System.out.println(orderAgnosticBS(arr2, target));
        System.out.println("the below ones are oreder agnostic bs modifed");
        System.out.println(orderAgnosticBsModified(arr, target));
        System.out.println(orderAgnosticBsModified(arr2, target));
    }

    // some modification just to decrease line of codes 
    static int orderAgnosticBsModified(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
//  some lengthy code but very good for understanding the deeply

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
