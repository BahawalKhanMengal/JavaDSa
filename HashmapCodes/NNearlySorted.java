package HashmapCodes;

import java.util.PriorityQueue;

public class NNearlySorted {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {2,3,1,4,6,5,7,8,9};
        int n = 2;
        for(int i = 0; i <= n; i++) {
            pq.add(arr[i]);
        }
        for(int i = n + 1; i <arr.length ; i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while (pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
