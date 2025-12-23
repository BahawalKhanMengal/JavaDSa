package LinkedLists;

import java.util.LinkedList;

public class LLtoQueueAdapter {
    LinkedList<Integer> list ;
    public LLtoQueueAdapter(){
        list = new LinkedList<>();
    }
    int size(){
        return list.size();
    }
    void add(int val){
    list.addLast(val);
    }
    int remove(){
    if (size()==0){
        System.out.println("Queue underflow");
        return -1;
    }else {
        return list.removeFirst();
    }
    }
    int peek(){
    if (size()==0){
        System.out.println("Queue underflow");
        return -1;
    }else {
        return list.getFirst();
    }
    }
    public static void main(String[] args) {

    }
}
