package SearchingAlgos.BinarySearchAlgo;

public  class SmallestChar {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char latter = 'd';
        System.out.println(smallestChar(letters, latter));
    }
      static char smallestChar(char[] arr,char target){
    
        int start = 0;
        int end = arr.length-1;
        while (start<=end) { 
           int mid = start + (end-start)/2;
           if(arr[mid]<target) {
            start = mid + 1;
           }else{
            end = mid -1;
           }
        }
        return arr[start % arr.length];
    }
}