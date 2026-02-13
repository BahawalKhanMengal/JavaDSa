package Recursion.recByGravity;

import java.util.ArrayList;

public class GetStairsPath {
    public static void main(String[] args){
        ArrayList<String> paths = stairsPath(4);
        System.out.println(paths);
    }
    public static ArrayList<String> stairsPath(int n){
        if (n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = stairsPath(n-1);
        ArrayList<String> path2 = stairsPath(n-2);
        ArrayList<String> path3 = stairsPath(n-3);
        ArrayList<String > paths = new ArrayList<>();
        for (String path : path1){
            paths.add(1 + path);
        }
        for (String path : path2){
            paths.add(2 + path);
        }
        for (String path : path3){
            paths.add(3 + path);
        }
        return paths;
    }
}