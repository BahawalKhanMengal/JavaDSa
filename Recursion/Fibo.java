package Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        
    }
    static int fibo(int x){
        if(x < 2){
            return x;
        }
        return fibo(x-1) + fibo(x-2);
    }
}
