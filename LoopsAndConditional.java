
import java.util.Scanner;



public class LoopsAndConditional {
    public static void main(String[] args) {
        // conditional statement example
        // int salary = 4000;
        // if(salary>=5000) {
        //     salary += 1000; // bonus
        // } else {
        //     salary -= 500; // penalty
        // }
        // System.out.println("Final Salary: " + salary);

        // multiple conditional statements example
        // int age = 14;
        // if(age < 13) {
        //     System.out.println("Child");
        // } else if(age > 13 && age < 18) {
        //     System.out.println("Adult");
        // } else if(age>18) {
        //     System.out.println("Teenager");
        // }


        // loops example
        for(int i = 1;i<=5;i++){
            System.out.println("Hello World " + i);
        }
        // numbers from 1 to n
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // for (int num = 0; num <= n; num++) {
        //     System.out.print(num + " ");
        // }

        // while loop example
        // int num = 1;
        // while (num<= 5) {
        //     System.out.println(" " + num);
        //     num++;
            
        // }
        // Scanner input = new Scanner(System.in);
        // char symbol = input.next().charAt(0);
        // while (symbol != 'x') {
        //     System.out.println(symbol);
        //     symbol = input.next().charAt(0);
        // }

        // finding the largest number in an inputs
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b && a>c){
            System.out.println("Largest number is: " + a);
        } else if (b>a && b>c){
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

    }
}
