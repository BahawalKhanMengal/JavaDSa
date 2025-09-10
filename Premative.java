import java.util.Scanner;

public class Premative {
    public static void main(String[] args) {
        System.out.println("Hello, this is a primitive data type example.");
        int number = 10;
        double decimalNumber = 20.5;
        char letter = 'A';
        boolean isTrue = true;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isTrue);

        System.out.print("Enter you Roll Number: ");
        Scanner scanner = new Scanner(System.in);
        int rollNumber = scanner.nextInt();
        System.out.println("Your Roll Number is: " + rollNumber);
    }
}
