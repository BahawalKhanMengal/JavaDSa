package ArraysCodes;

public class MaxValue {
    public static void main(String[] args) {
         int[] arr = {1,3,23,9,19};
        System.out.println(maxValue(arr));
        System.out.println(maxRange(arr, 0, 1));
    }
    static int maxValue(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    // max value b/t the range 
    static int maxRange(int[] arr,int start,int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
