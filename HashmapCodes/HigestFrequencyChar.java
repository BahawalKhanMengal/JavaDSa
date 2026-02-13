package HashmapCodes;

import java.util.HashMap;

public class HigestFrequencyChar {
    public static void main(String[] args){
        String str = "balochistan";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!hm.containsKey(ch)){
                hm.put(ch,1);
            }else {
               int freq = hm.get(ch);
               int newFreq = freq + 1;
               hm.put(ch,newFreq);
            }
        }
        char mfc = str.charAt(0);
        for (Character key : hm.keySet()){
            if (hm.get(key) > hm.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
