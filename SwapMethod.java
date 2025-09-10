public class SwapMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b; // This change will not affect the original a
        b = temp; // This change will not affect the original b
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
        // The original values of a and b in main remain unchanged
    }
}
