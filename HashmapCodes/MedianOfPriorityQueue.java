package HashmapCodes;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianOfPriorityQueue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr){
            pq.add(val);
        }

        for(int i = 0; i < (size -1) / 2; i++) {
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
