package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        PrintNum(n);
    }
    static void PrintNum(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }
}
