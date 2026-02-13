package SearchingAlgos.BinarySearchAlgo;
// leet code quesion
public class CellingNumbersFlorNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,12,14,16,18};
        int target = 19;
        System.out.println(cellingNumber(arr, target));
        System.out.println(floorNumber(arr, target));
        
    }
    // floor number mean a target number of number less the number but should be first occurence of the array
    static int floorNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) { 
           int mid = start + (end-start)/2;
           if(arr[mid]==target){
            return arr[mid];
           }else if(arr[mid]<target) {
            start = mid + 1;
           }else{
            end = mid -1;
           }
        }
        return arr[end];
    }
    // celling number mean a target number or number greater than a target number but should be first greate number 
    static int cellingNumber(int[] arr,int target){
        // edge case when the last element of the array is less then the target element 
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end) { 
           int mid = start + (end-start)/2;
           if(arr[mid]==target){
            return arr[mid];
           }else if(arr[mid]<target) {
            start = mid + 1;
           }else{
            end = mid -1;
           }
        }
        return arr[start];
    }
}
