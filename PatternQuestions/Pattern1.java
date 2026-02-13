package PatternQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        int x = 5;
        pattern2(x);
        System.out.println("____________________________________");
        pattern1(x);
        System.out.println("___________________________");
        pattern3(x);
        System.out.println("___________________________");
        pattern4(x);
        System.out.println("___________________");
        pattern5(x);
    }
    // pattern5
    static void pattern5(int x){
        for (int row = 1; row <x*2; row++) {
            if(row<=x){
               for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println(); 
            }else{

                for (int col = 1; col <=2*x-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
    // pattern4
    static void pattern4(int x){
        for (int row = 1; row <=x; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    // pattern1 of the assigment
    static void pattern1(int x){
        for (int row = 1; row <=x; row++) {
            for (int col = 1; col <=x; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern 2 of assigment
    static void pattern2(int x){
        for (int row = 1; row <=x; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern3
    static void pattern3(int x){
        for (int row = 1; row <=x; row++) {
            for (int col = 1; col <=x-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
