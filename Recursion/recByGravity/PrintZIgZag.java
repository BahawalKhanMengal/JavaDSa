package Recursion.recByGravity;

public class PrintZIgZag {
    public static void main(String[] args) {
        printZigZag(5);
    }

    public static void printZigZag(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("pre " + n);
        printZigZag(n - 1);
        System.out.println("in " + n);
        printZigZag(n - 1);
        System.out.println("post " + n);
    }
}
