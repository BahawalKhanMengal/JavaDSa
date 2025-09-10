public class ArmstrongNumbers {
    public static void main(String[] args) {
        // int num = 153;
        // System.out.println(armStrong(num));
        for(int i = 100;i<=1000000000;i++){
            if(armStrong(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        
    }
    // armStrong numbers
    static boolean armStrong(int num){
        int original = num;
        int ans = 0;
        while(num>0){
            int remender = num % 10;
            remender = remender*remender*remender;
            ans += remender;
            num = num /10;
        }
        return ans == original;
    }
}
