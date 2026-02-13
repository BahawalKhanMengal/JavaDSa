
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        valueChange(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        
    }
    static void valueChange(int[] nums){
        nums[0] = 99;
    }
}
