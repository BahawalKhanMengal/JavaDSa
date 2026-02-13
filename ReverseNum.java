
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int answer = 0;
        while(number != 0){
            int rem = number % 10; // Get the last digit
            answer = answer * 10 + rem; // Build the reversed number
            number /= 10; // Remove the last digit
            System.out.println("Current Number: " + number + ", Current Answer: " + answer);
        }
        System.out.println("Reversed Number: " + answer);
    }
}
