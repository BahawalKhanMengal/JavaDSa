package NumberSystems;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] binary = {1,0,0,0,1};
        int decimal=0;
        int sum;
        for (int i = binary.length-1; i>=0; i--) {
            sum = (int) ((binary[i])*Math.pow(2, i));
            decimal += sum; 
        }
        System.out.println(decimal);
        
    }
}
