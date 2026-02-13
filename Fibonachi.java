
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nthFib = in.nextInt();
        int pre = 0;
        int current = 1;
        int count = 2;
        while(count<=nthFib){
            int temp = current;
            current += pre;
            pre = temp;
            count++; 
            System.out.println(current);   
        }
        System.out.println(current);
    }
}
