package HashmapCodes;

import java.util.Collections;
import java.util.PriorityQueue;

public class NLargestElements {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> nElements = new PriorityQueue<>();
        int n = 3;
        int[] array = {2,10,5,17,7,18,6,4};
        for (int val : array){
            pq.add(val);
        }
        while (n>0){
            int val = pq.peek();
            nElements.add(val);
            pq.remove();
            n = n -1;
        }
        while (nElements.size()>0){
            System.out.println(nElements.peek());
            nElements.remove();
        }
    }
}
