package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        List<List<String>> list = lengthOfLongestSubstring(s);
        for(List<String> ans : list){
            System.out.println(ans);
        }
    }
    static List<List<String>> lengthOfLongestSubstring(String s) {
        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        List<String> internal = new ArrayList<>();
        internal.add(String.valueOf(s.charAt(0)));
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)){
                internal.add(String.valueOf(s.charAt(i)));
                outer.add(internal);
            }
        }
        
        
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return outer;
    }

}
