package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigits(n));
        System.out.println(productOfDigits(n));
    }
    static int sumOfDigits(int n){
        if(n<=0) return n;
        return sumOfDigits(n/10) + (n%10);
    }
    static int productOfDigits(int n){
        if(n%10==n) return n;
        return productOfDigits(n/10) * (n%10);
    }
}
