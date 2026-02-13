package Recursion;

public class Patterns {
    public static void main(String[] args) {
        int row = 4;
        int col = 0;
        triangel(row, col);
        triangelNormal(row, col);
    }
    static void triangel(int row , int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print('*' + " ");
            triangel(row, col + 1);
        }
        if(col>=row){
            System.out.println();
            triangel(row-1, col=0);
        }
        
    }
    static void triangelNormal(int row , int col){
        if(row == 0){
            return;
        }
        if(col<row){
            triangelNormal(row, col + 1);
            System.out.print('*' + " ");
        }
        if(col>=row){
            triangelNormal(row-1, col=0);
            System.out.println();
        }
        
    }
}
