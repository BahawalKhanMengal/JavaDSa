package Recursion;

public class ReverseNumber {
    static  int sum = 0;
    public static void main(String[] args) {
       int n = 112232211;  
       reverseNumber(n);
       System.out.println();
       reverse(n);
       System.out.println(palindrom(n));
        System.out.println(reverseleet(132));
    }
    static int rev = 0;
    static int reverseleet(int x) {
        if(x==0){
            return rev;
        }
        int rem = x % 10;
        return (rev = rev * 10 + rem) + reverseleet(x/10);
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
