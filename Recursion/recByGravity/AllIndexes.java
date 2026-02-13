package Recursion.recByGravity;
import java.util.Arrays;
public class AllIndexes {
    public static void main(String[] args){
        int[] arr = {1,3,45,66,77,6,3,54,53,56,3};
        int[] ans = allIndices(arr,3,0,0);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] allIndices(int[] arr, int x, int idx, int fsf){
        if (idx == arr.length) return new int[fsf];
        if (arr[idx] == x){
          int[] iarr =  allIndices(arr,x,idx + 1,fsf + 1);
          iarr[fsf] = idx;
          return iarr;
        }else {
           int[] iarr = allIndices(arr,x,idx + 1,fsf);
           return iarr;
        }
    }
}
