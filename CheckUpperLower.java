import java.util.Scanner;

public class CheckUpperLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = input.next().charAt(0);

        if (character >='a' && character<='z'){
            System.out.println("Lowercase letter : " + character);
        }else if (character >='A' && character<='Z'){
            System.out.println("Uppercase letter: " + character);
        }else {
            System.out.println("Not an alphabetic character: " + character);
        }
    }
}
