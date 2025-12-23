package LinkedLists;

import java.util.LinkedList;

public class NewLL {
    public static void main(String[] args) {
        LL linklist = new LL();
        linklist.addLast(3);
        linklist.addLast(34);
        linklist.addLast(39);
        linklist.addFirst(12);
        linklist.addAt(11,2);
        linklist.display();
//        linklist.removeFirst();
        System.out.println("first value of node : "+linklist.getFirst());
        System.out.println("getting particular value at index : "+linklist.getAt(2));
        System.out.println("get last node value : " + linklist.getLast());
//        linklist.removeLast();
//        linklist.reverseList();
//        linklist.reversePointerList();
        linklist.removeAt(4);
        linklist.display();
    }
    public  static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public  static  class LL{
        Node head;
        Node tail;
        int size;
//        display nodes of linkedList
        public void display() {
    if (head == null) return;
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
    System.out.println();
}
//        adding element at last
        void addLast(int val){
            Node temp = new Node(val);
            temp.next = null;
            if(size == 0){
                head = tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        //    remove first element from linkedlist
        public void removeFirst(){
            if (size == 0){
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            }else {
                head = head.next;
                size--;
            }
        }
//        get first node data in linkedlist
        public  int getFirst(){
            if (size == 0){
                System.out.println("List is empty");
                return  -1;
            }else{
                return head.val;
            }
        }
//        get node data at particular index
        public int getAt(int index){
            if (size == 0){
                System.out.println("List is empty");
                return -1;
            } else if (index<0 || index > size) {
                System.out.println("Invalid Argument");
                return -1;
            }else {
                Node temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.val;
            }
        }
//        get last node data
        public  int getLast(){
            if (size == 0){
                System.out.println("List is empty");
                return -1;
            }else {
                return tail.val;
            }
        }
//        add node in linkedlist at first
        public void addFirst(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            if (size == 0){
                tail = temp;
            }
            size++;
        }
        public void addAt(int value , int index){
            if (index<0 || index>size){
                System.out.println("Invalid index!");
                return;
            } else if (index == 0) {
                addFirst(value);
            } else if (index == size) {
                addLast(value);
            }else {
                Node node = new Node(value);
                Node temp = head;
                for (int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
//        remove last node from linkedlist
        public void removeLast(){
            if (size == 0){
                System.out.println("list is empty!");
                return;
            } else if (size == 1) {
                head = null;
                tail = null;
                size--;
            }else {
                Node temp = head;
                for (int i = 1; i < size; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }
//        reverse the linkedlist but the getNodeAt is supporting function for reverseList
        private Node getNodeAt(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void reverseList(){
            int li = 0;
            int ri = size -1;
            while (li<ri){
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);
                int temp = left.val;
                left.val = right.val;
                right.val = temp;
                li++;
                ri--;
            }
        }
//        reverse linked list by using its next property and
        public void reversePointerList(){
            Node prev = null;
            Node current = head;
            while (current != null){
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }
//        remove from particular index
        public void removeAt(int index){
            if(size == 0 || index < 0 || index > size){
                System.out.println("list is empty");
                return;
            } else if (index == 0) {
                removeFirst();
                size--;
            } else if (index == size -1 ) {
                removeLast();
                size--;
            }else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;

            }
        }
//        nth element from the last
        public int nthElementFromLast(int n){
            Node f = head;
            Node s = head;
            for (int i = 0; i < n; i++) {
                f = f.next;
            }
            while (f != tail){
                f = f.next;
                s = s.next;
            }
            return s.val;

        }
//        mid of linkedlist using slow fast approch
        public int mid(){
            Node fast = head;
            Node slow = head;
            while (fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow.val;
        }

//    merge two soreted LinkedLists
    public static LL merge(LL l1, LL l2){
        Node one = l1.head;
        Node two = l2.head;

        LL res = new LL();
        while (l1 != null && l2 != null){
            if (one.val < two.val){
                res.addLast(one.val);
                one = one.next;
            }else {
                res.addLast(two.val);
                two = two.next;
            }
        }
        while (one != null){
            res.addLast(one.val);
            one = one.next;
        }
        while (two != null){
            res.addLast(two.val);
            two = two.next;
        }
        return res;
    }
//    merge sort Linkedlist
    public static Node midNode(Node head,Node tail){
        Node slow = head;
        Node fast = head;
        while (fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static LL mergeSort(Node head,Node tail){
        if(head == tail){
            LL br = new LL();
            br.addLast(head.val);
            return br;
        }
        Node mid = midNode(head,tail);
        LL fsh = mergeSort(head,mid);
        LL ssh = mergeSort(mid.next, tail);
        LL cl = merge(fsh,ssh);
        return cl;
    }
//    remove duplicates
    public void removeDuplicates(){
        LL res = new LL();
        while (this.size > 0){
            int val = this.getFirst();
            this.removeFirst();
            if (res.size ==0 && res.tail.val != val){
                res.addLast(val);
            }
        }
        this.head = res.head;
        this.tail = res.tail;
        this.size = res.size;
    }
//    odd even
        public void oddEven(){
            LL odd = new LL();
            LL even = new LL();
            while (this.size > 0){
                int val = this.getFirst();
                this.removeFirst();
                if (val % 2 == 0){
                    even.addLast(val);
                }else {
                    odd.addLast(val);
                }
            }
            if (odd.size > 0 && even.size > 0){
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            }else  if (odd.size>0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            }else if (even.size>0){
                this.head = even.head;
                this.tail = even.tail;
                this.size =  even.size;
            }

        }
//        k reverse where k is number that group of k elements of linkedlist to be reversed if elements are less than k than just leave it
        public void kReverse(int k){
            LL prev = null;
            while (this.size>0){
                LL curr = new LL();
                if (this.size>=k){
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        curr.addFirst(val);
                        this.removeFirst();
                    }
                }else {
                    int s = this.size;
                    for (int i = 0; i < s; i++) {
                        int val = this.getFirst();
                        curr.addLast(val);
                        this.removeFirst();
                    }
                }

                if (prev == null){
                    prev = curr;
                }else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                }
            }
            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }
// display linkedlist in reverse order
        private void reverseHelplerFucntion(Node head){
            if (head == null){
                return;
            }
            reverseHelplerFucntion(head.next);
            System.out.print(head.val + " ");
        }
        public void displayReverse(){
            reverseHelplerFucntion(head);
            System.out.println();
        }
//        reverse linkedlist using pointer methods
        public void reversePRHelper(Node node){
            if (node == null){
                return;
            }
            reversePRHelper(node.next);
            if (node == tail){
//                nothing to doo here
            }else {
                node.next.next = node;
            }
        }
        public void reversePR(){
                reversePRHelper(head);
                head.next = null;
                Node temp = head;
                head = tail;
                tail = temp;
        }
//        Reverse LinkedList Data recursively
        public void reverseDRHelper(Node right , int floor){
            if (right == null) {
                return;
            }
            reverseDRHelper(right.next , floor + 1);
            if (floor> size/2){
                int temp = right.val;
                right.val = rleft.val;;
                rleft.val = temp;

                rleft = rleft.next;
            }
        }
        Node rleft;
        public void reverseDR(Node head){
            rleft = head;
            reverseDRHelper(head, 0);
        }
    }

}
