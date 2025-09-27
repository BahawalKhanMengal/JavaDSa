package Recursion;

public class ReverseNumber {
    static  int sum = 0;
    public static void main(String[] args) {
       int n = 112232211;  
       reverseNumber(n);
       System.out.println();
       reverse(n);
       System.out.println(palindrom(n));
        reverseNumber(132);
        System.out.println();
        System.out.println(reverseleet(132));
    }
    static int rev = 0;
    static int reverseleet(int x) {
        
        if(x%10==x){
            int rem = x % 10;
            rev = rev * 10 + rem;
            return rev;
        }
        int rem = x % 10;
        rev = rev * 10 + rem;
        return  reverseleet(x/10);
    }
    // palindrom
    static boolean palindrom(int n){
        return n == sum;
    }
    // return version of this 
    static void  reverse(int n){
        int rem = n % 10;
        if(n==0) {
            return;
        }
        sum = sum * 10 + rem;
        
        reverse(n/10);
        System.out.println(sum);
      
    }
    // simple
    static void reverseNumber(int n){
        if(n%10 == n) {
            System.out.print(n);
            return; 
        }
        System.out.print(n%10);
        reverseNumber(n/10);
      
    }
}
