package Recursion;

public class CountSteps {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(steps(n));
    }
    static int steps(int n){
        int count = 0;
        if(n==0){
            return count;
        }
        if(n%2!=0 ){
            
            return (count + 1) + steps(n-1);
        }
        return (count + 1)  + steps(n/2);
    }
}
