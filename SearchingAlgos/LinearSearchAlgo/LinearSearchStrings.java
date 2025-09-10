package SearchingAlgos;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name = "bahawal";
        char target = 'h';
        System.out.println(linearSearch(name,target));
    }

    static boolean linearSearch(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
