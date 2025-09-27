package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        // subSeq("", "abc");
        // System.out.println(subSets("", "abc"));
        int[] arr = {1,2,3};
        List<List<Integer>> list = subSetLoop(arr);
        for(List<Integer> ans : list){
            System.out.println(ans);
        }
    }
    // subsets using loops
    static List<List<Integer>> subSetLoop(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }
    // returning a sub sets of array list
    static ArrayList<String> subSets(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSets(p+ch, up.substring(1));
        ArrayList<String> right = subSets(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    // simple just print sub sets
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}
