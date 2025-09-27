package Recursion;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "this is bahawal khan mengal";
        // removeChar(str, 'b', "");
        // StringBuilder ans = rChar(str, 'a');
        // System.out.println(ans);
        String newStr = removea(str, 'b');
        System.out.println(newStr);
    }
    // returing String
    static String  removea(String str,char target){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0)==target){
            return  removea(str.substring(1), target);
        }else{
            return  removea(str.substring(1), target);
        }
    }
    // not returning just printing the values
    static void  removeChar(String str,char target,String newStr){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }
        if(str.charAt(0)==target){
            removeChar(str.substring(1), target, newStr);
        }else{
            removeChar(str.substring(1), target, newStr + str.charAt(0));
        }
    }
    // using loops 
    static StringBuilder rChar(String str, char target){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=target){
                ans.append(str.charAt(i));
            }
        }
        return ans;
    }
}
