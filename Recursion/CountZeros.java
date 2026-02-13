package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 304030440;
        int count = 0;
        System.out.println(countZeros(n,count));
    }
    static int countZeros(int n,int count){
        if(n ==0){
            return count;
        }
        int rem = n % 10;
        if(rem==0){
            return countZeros(n/10, count+1);
        }
        return countZeros(n/10,count);

    }
}
