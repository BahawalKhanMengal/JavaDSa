package StackandQues;

import java.util.Stack;

public class Stackslec {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("bahawal");
        st.push("meer");
        System.out.println(st);
        st.push("mengal");
        System.out.println(st);
        System.out.println(st.peek()  + " " + st.size());
    }
}
