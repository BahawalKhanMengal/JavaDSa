package SearchingAlgos;
// leet code question
public class LinearSearchEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7892,34,7890,4,2,3,4,-12};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        
        return count;
    }
    static boolean even(int number){
        int count =0;
        while(number>0 ){
            count++;
            number = number/10;
        }
        
        return count%2==0;
    }
}
