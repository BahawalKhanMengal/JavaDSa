package LinkedLists;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class LinkedListGeeks {
    public static void  displayRec(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayRec(head.next);
        System.out.println();
        System.out.print(head.val + " ");

    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
//        also we can use for loop for the printing the elements
        for(Node tempp = head; tempp != null;tempp = tempp.next){
            System.out.print(tempp.val + " ");
        }
        System.out.println();
    }
    private static int get(Node head,int index){
        Node temp = head;
        for(int i = 1;i<=index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
//        a.val = 10;
        Node b = new Node(12);
//        b.val = 12;
        Node c = new Node(11);
//        c.val = 11;
        Node d = new Node(23);
//        d.val = 23;
        Node e = new Node(55);
//        e.val = 55;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(e.next);
        display(a);
        System.out.println("rec");
        displayRec(a);
        System.out.println("while getting the value of the Node by index");
        System.out.println(get(a,2));

    }
}
