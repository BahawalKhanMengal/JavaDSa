package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        print1n(n);
    }
    static void print1n(int n){
        if(n==0){
            return;
        }
        print1n(n-1);
        System.out.println(n);
    }
}
