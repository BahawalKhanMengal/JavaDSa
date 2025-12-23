package ArraysCodes;

public class MinValue {
    public static void main(String[] args){
        int[] arr = {7,12,9,11,3};
        System.out.println(minValue(arr));
    }
    static int minValue(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
