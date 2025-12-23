package LinkedLists;

class Nodes {
    int val;
    Nodes next;

    Nodes(int val) {
        this.val = val;
    }
    Nodes(int val, Nodes next){
        this.val = val;
        
    }
}

class Linkedlist {
    Nodes head;
    Nodes tail;
    int size;

    void addAtTail(int val) {
        Nodes temp = new Nodes(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val) {
        Nodes temp = new Nodes(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void display() {
        if (head == null) return;
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean search(int val) {
        if (head == null) return false;
        Nodes temp = head;
        while (temp != null) {
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("The Linked List is empty");
            return;
        }
        Nodes temp = head;
        head = temp.next;
        if (head == null) tail = null;
        size--;
    }

    public void insert(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            addAtHead(value);
            return;
        }
        if (index == size) {
            addAtTail(value);
            return;
        }
        Nodes temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Nodes t = new Nodes(value);
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    public void deleteAt(int index) {

        if (index >= size || index < 0 || head == null) {
            System.out.println("Invalid Index to Delete");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }

        Nodes temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) tail = temp;
        size--;
        return;
    }

    public void deleteValNotNode(Nodes target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }

    public Nodes get(int value) {
        if (head == null) {
            System.out.println("Not found Linked List is Empty");
            return null;
        }
        Nodes temp = head;
        while (temp != null) {
            if (temp.val == value) {
                System.out.println("Answer found");
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }

    public int getMiddle(Nodes head) {
        int length = 0;
        Nodes temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        temp = head;
        for (int i = 1; i <= length / 2; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    //    slow fast approch for getting middle element of the LinkedList
//    this code handle both the odd and even length Linkedlists
    public int getMiddleSlowFast(Nodes head) {

        Nodes slow = head;
        Nodes fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public Nodes deleteMiddle(Nodes head) {
        if (head == null || head.next == null) {
            return null; // Single node or empty list
        }

        int length = 0;
        Nodes temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int middleIndex = length / 2;
        temp = head;

        // Move to node before middle
        for (int i = 1; i < middleIndex; i++) {
            temp = temp.next;
        }

        // Delete middle node
        temp.next = temp.next.next;

        return head;
    }

    public int getKthNodeFromBack(Nodes head,int nodeFromPrevious) {
        Nodes slow = head;
        Nodes fast = head;
        for (int i = 1; i <=nodeFromPrevious ; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public Nodes deleteKthNode(Nodes head, int nodeFromPrevious) {
        Nodes slow = head;
        Nodes fast = head;
        for (int i = 0; i <=nodeFromPrevious ; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
    public Nodes removeElements(Nodes head,int value){
        while (head != null && head.val == value){
            head = head.next;
        }
        if(head == null) return null;
        Nodes dummy = head;
        Nodes temp = head;
        while (temp.next != null){
            if(temp.next.val == value){
                temp.next =temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}

public class LinkedListUserDefined {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(12);
        ll.addAtTail(14);
        ll.addAtTail(16);
        ll.addAtHead(8);
        ll.addAtHead(12);
        ll.removeElements(ll.head,12);
//        ll.deleteKthNode(ll.head,2);
        ll.display();
        Linkedlist ll2= new Linkedlist();
        ll2.addAtHead(34);
        ll2.addAtHead(32);
        ll2.addAtHead(36);
        ll2.display();
        System.out.println(ll.head);
        System.out.println(ll.tail.next);

//        System.out.println(ll.size);
//        ll.deleteAtHead();
//        System.out.println(ll.size);
//        ll.display();
//        System.out.println(ll.search(142));
//        ll.insert(45, 2);
//        ll.display();
//        ll.deleteAt(4);
//        ll.display();
////        ll.get(14);
//        ll.deleteValNotNode(ll.get(12));
//        ll.display();
//        System.out.println(ll.getMiddle(ll.head));
//        ll.deleteMiddle(ll.head);
//        ll.display();
//        ll.addAtHead(40);
//        ll.addAtHead(400);
//        ll.display();
//        System.out.println(ll.getMiddleSlowFast(ll.head));
//        System.out.println(ll.getKthNodeFromBack(ll.head,3));
//        ll.deleteKthNode(ll.head,3);
//        ll.display();
    }

}
