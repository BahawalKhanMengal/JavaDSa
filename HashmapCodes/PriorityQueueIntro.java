package HashmapCodes;

import java.util.PriorityQueue;

public class PriorityQueueIntro {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ranks = {11,9,90,8,7,6,4,5,33,55,66,89};
        for (int val  : ranks){
            pq.add(val);
        }
        while (pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
