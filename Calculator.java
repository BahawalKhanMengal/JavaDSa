
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int answer = 0;
    while (true) { 
        System.out.println("Enter operator :");
    char operator = scanner.next().charAt(0);
       if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            System.out.println("Enter two numbers : ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(operator == '+') {
                answer = num1 + num2;
            } else if(operator == '-') {
                answer = num1 - num2;
            } else if(operator == '*') {
                answer = num1 * num2;
            } else if(operator == '/') {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    continue;
                }
                answer = num1 / num2;
            } else if(operator == '%') answer = num1 % num2;
       }
       else if (operator == 'q' || operator == 'Q') {
            System.out.println("Exiting calculator.");
            break;
       } else {
            System.out.println("Invalid operator. Please try again.");
            break;
       }
       System.out.println("Result: " + answer);
            
    }
   } 
}
