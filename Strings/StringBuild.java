package Strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builer.append(ch);
        }
        // System.out.println(builer);
        String str ="race a car";
        System.out.println(palindrome(str));
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        int num4 =0;
        boolean ans = isPalindrome(num1);
        System.out.println(ans);
    }
    // good enough for all cases of palindrome
    static boolean palindrome(String s){
         if(s.length()==0){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length()==0){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        boolean state = true;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return state;
    }
    // 121 -121 10 
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans = 0;
        while(x>ans){
            int reminder = x % 10;
            ans = ans * 10 + reminder;
            x /=10; 
        }


        return x==ans;
    }
}
