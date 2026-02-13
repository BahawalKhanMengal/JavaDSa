package StackandQues;
import java.util.Scanner;
import java.util.Stack;
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ')'){
                    if (ch.peek() == '('){
                        System.out.println(true);
                        return;
                    }else {
                        while (ch.peek() != '('){
                            ch.pop();
                        }
                        ch.pop();
                    }
                }else {
                    ch.push(str.charAt(i));
                }
        }
        System.out.println(false);
    }
}
