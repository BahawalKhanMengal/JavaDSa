
import java.util.Scanner;

public class CountNumb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;
        while (number != 0) {
            if (number % 10 == 7) {
                count++; // Count the occurrences of 7
            }
            number /= 10; // Remove the last digit
            System.out.println(number);
        }
        System.out.println("Count of 7s: " + count);
    }
}
