package StackandQues;

import java.util.Scanner;
import java.util.Stack;

public class BlancedBarcAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (!val){
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');  // Fixed: should be '{'
                if (!val){
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');  // Fixed: should be '['
                if (!val){
                    System.out.println(false);
                    return;
                }
            }
            // Ignore other characters (letters, numbers, operators, etc.)
        }

        if (st.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char correspondingOpen) {
        if(st.isEmpty()) {
            return false; // Closing bracket without opening
        } else if (st.peek() != correspondingOpen) {
            return false; // Mismatched brackets
        } else {
            st.pop(); // Matching bracket found
            return true;
        }
    }
}