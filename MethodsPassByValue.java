public class MethodsPassByValue {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original Number: " + number);
        changeNumber(number);
        System.out.println("Number after method call: " + number);
        String str = "Hello";
        System.out.println("Original String: " + str);
        bothPremitiveAndNonPrimitive(number, str);
        System.out.println("String after method call: " + str);
    }
    static void changeNumber(int num) {
        num = 54321; // This change will not affect the original number
        System.out.println("Changed Number inside method: " + num);
    }
    static void bothPremitiveAndNonPrimitive(int num, String str) {
        num = 99999; // This change will not affect the original number
        str = "Changed String"; // This change will not affect the original string
        System.out.println("Inside method - Number: " + num + ", String: " + str);
    }
}
