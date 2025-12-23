package Strings;

public class Vowels {
    public static void main(String[] args) {
            String s = "IceCreAm";
    }
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() -1;
        StringBuilder sb = new StringBuilder();
        while (left < right){
            if ((s.charAt(left) == 'a' ||s.charAt(left) == 'A' || s.charAt(left) == 'e' ||s.charAt(left) == 'E' || s.charAt(left) == 'i' || s.charAt(left) == 'I' || s.charAt(left) == 'o'|| s.charAt(left) == 'O'|| s.charAt(left) == 'u'|| s.charAt(left) == 'U') && (s.charAt(right) == 'a' ||s.charAt(right) == 'A' || s.charAt(right) == 'e' ||s.charAt(right) == 'E' || s.charAt(right) == 'i' || s.charAt(right) == 'I' || s.charAt(right) == 'o'|| s.charAt(right) == 'O'|| s.charAt(right) == 'u'|| s.charAt(right) == 'U')){
                left ++;
                right--;
            }
        }
        return s;
    }
}
