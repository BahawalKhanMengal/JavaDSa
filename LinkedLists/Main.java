package LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
//        adding elements to the list
        ll.add("bahawal");
        ll.add("mengal");
//        adding at the specified place
        ll.add(1,"khan");
        System.out.println(ll);
        for(String ele:ll){
            System.out.println(ele);
        }
//        changing of element
        ll.set(1,"Mengle");
        for(String ele:ll){
            System.out.println(ele);
        }
//        iterating using indexes of the linked list
        System.out.println("Iterating using Indexes");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
//        converting LinkedList to array
        Object[] a = ll.toArray();
        System.out.println("After converting to an array");
        System.out.println(Arrays.toString(a));
//        for(Object element: a){
//            System.out.println(element);
//        }

    }
}
