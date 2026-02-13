package HashmapCodes;
import java.util.HashMap;
import java.util.Scanner;
public class LongestConsecutiveSequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int val : arr1){
            map.put(val,true);
        }
        for (int val : arr1){
            if (map.containsKey(val -1)){
                map.put(val,false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val : arr1){
            if (map.get(val) == true){
                int tl = 1;
                int tsp = val;
                while (map.containsKey(tsp + tl)){
                    tl++;
                }
                if (tl>ml){
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for(int i = 0; i < ml; i++) {
            System.out.print(msp + i + " -> ");
        }
    }
}
