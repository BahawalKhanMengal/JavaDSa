package SearchingAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int ans = linearSearch(arr, 14);
        System.out.println(ans);
        System.out.println(linearSearchinRange(arr,14,1,4));
        System.out.println(min(arr));
    }
    // try to search a minimum number in the array
    static int min(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int linearSearchinRange(int[] arr, int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        // iterate through the array
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
