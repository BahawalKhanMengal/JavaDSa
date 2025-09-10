
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();
        switch (fruit) {
            case "apple":
                System.out.println("A Red Fruit full of flavors.");
                break;
            case "banana":
                System.out.println("A Yellow Fruit rich in potassium.");
                break;
            case "orange":
                System.out.println("A Citrus Fruit that is juicy and sweet.");
                break;
            case "grape":
                System.out.println("A Small Fruit that comes in bunches.");
                break;
            case "kiwi":
                System.out.println("A Brown Fruit with a green inside.");
                break;
            default:
                System.out.println("Unknown fruit. Please try again.");
                break;
        }
    }
}
