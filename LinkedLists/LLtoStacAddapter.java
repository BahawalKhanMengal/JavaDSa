package LinkedLists;

import java.util.LinkedList;

public class LLtoStacAddapter {

    LinkedList<Integer> list;
    public LLtoStacAddapter(){
        list = new LinkedList<>();
    }
    int size(){
        return list.size();
    }
    void push(int val){
        list.addFirst(val);
    }
    int pop(){
        if (size() == 0){
            System.out.println("Stack");
            return -1;
        }else {
            return list.removeFirst();
        }
    }
    int top(){
        if (size()==0){

            System.out.println("Stack");
            return -1;
        }else {
            return list.getFirst();
        }
    }

    public static void main(String[] args) {

    }
}
