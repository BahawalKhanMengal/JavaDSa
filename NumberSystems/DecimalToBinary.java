package NumberSystems;

import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 1;
        ArrayList<Integer> binary = new ArrayList<>();
        int remainder;
        while(decimal >= 1){
            remainder = decimal % 2;
            decimal = decimal / 2;
            binary.add(remainder);
        }
        for (int i = binary.size()-1; i >=0; i--) {
            System.out.print(binary.get(i));
        }
        System.out.println();
    }
}
