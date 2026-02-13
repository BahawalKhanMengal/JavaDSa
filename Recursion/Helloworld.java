package Recursion;

public class Helloworld {
    public static void main(String[] args) {
        // recursive programms
        message(1);
    }
    static void message(int x){
        // base condition 
        // simple if condition where recursive calls are stop 
        if(x==5){
            System.out.println(x);
            return;
        }
        // function body 
        System.out.println(x);
        // recursive calls 
        // if you are calling function again and again , you can treat it as seperate call in the stack memory
        message(x+1);
    }
}
