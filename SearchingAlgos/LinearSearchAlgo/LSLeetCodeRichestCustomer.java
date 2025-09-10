package SearchingAlgos;

public class LSLeetCodeRichestCustomer {
    public static void main(String[] args) {
        int[][] customer = {
            {66,55,44,33,22,11},
            {1,2,3},
            {3,2,1},
            {5,4,3,2,1}
        };
        System.out.println(richest(customer));
    }
    static int richest(int[][] arr){
        int rich = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr[i].length; j++) {
                count = count + arr[i][j];
            }
            if(rich<count){
                rich = count;
            }
        }
        return rich;
    }
}
