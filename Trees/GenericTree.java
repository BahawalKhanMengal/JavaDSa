package Trees;

import java.util.*;

public class GenericTree {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void display(Node node){
        String str = node.data + "-> ";
        for(Node child : node.children){
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children){
            display(child);
        }
    }
//    size of a tree
    public  static int size(Node node){
        int s =0 ;
        for (Node child : node.children){
            int cs = size(child);
            s = s + cs;
        }
        s = s+ 1;
        return s;
    }
//    maximum element in generic tree
    public  static int max(Node node){
        int max = Integer.MIN_VALUE;
        for (Node child : node.children){
            int cm = max(child);
            max = Math.max(cm,max);
        }
        max = Math.max(node.data,max);
        return max;
    }
//    height of a tree
    public static int height(Node node){
//       ht = -1 because we want height in terms of edges not node if node than its initial value will be 0
        int ht = -1;
        for (Node child : node.children){
            int ch = height(child);
            ht = Math.max(ch,ht);
        }
        ht += 1;
        return ht;
    }
//    pre area and post area showing in recursion
    public static void triversal(Node node){
//        euler's left , on the way deep in recursion , node's pre area
        System.out.println("Node Pre " + node.data);
        for (Node child : node.children){
//            Edge pre area
            System.out.println("Edge Pre " + node.data + "-->" + child.data);
            triversal(child);
//            Edge post area
            System.out.println("Edge Post " + node.data + "-->" + child.data);
        }

//        euler's right  , on the way out of  recursion , node's post area
        System.out.println("Node Post " + node.data);
    }
//    level order triversal
    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size()>0){
            node = q.remove();
            System.out.print(node.data + " ");
            for (Node child:node.children){
                q.add(child);
            }
        }
        System.out.print(".");
        System.out.println();
    }
//    lever order linewise
    public static void levelOrderLinewise(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        Queue<Node> ch= new ArrayDeque<>();
        while (mq.size()>0){
            node = mq.remove();
            System.out.print(node.data + " ");
            for (Node child : node.children){
                ch.add(child);
            }
            if (mq.size() == 0){
                mq =ch;
                ch = new ArrayDeque<>();
                System.out.println();
            }
        }
    }
//    level order linewise zig zag
    public static void levelOrderLineWiseZZ(Node node){
        Stack<Node> ms = new Stack<>();
        ms.push(node);
        Stack<Node> cs = new Stack<>();
        int level = 1;
        while (ms.size()>0){
            node = ms.pop();
            System.out.print(node.data + " ");
            if (level % 2 == 1){
                for(int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }else {
                for(int i = node.children.size()-1; i>=0; i--) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }
            if (ms.size() == 0){
                ms = cs;
                cs   = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }
//    mirror of a tree
    public  static void mirror(Node node){
        for (Node child : node.children){
            mirror(child);
        }
        Collections.reverse(node.children);
    }
//    remove leaves
    public static void removeLeaves(Node node){
        for(int i = node.children.size()-1; i >=0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0){
                node.children.remove(child);
            }
        }
        for (Node child : node.children){
            removeLeaves(child);
        }
    }
//    linearize tree
    public static void linearize(Node node){
        for (Node child : node.children){
            linearize(child);
        }
        while (node.children.size()>1){
            Node lc = node.children.remove(node.children.size()-1);
            Node sl = node.children.get(node.children.size()-1);
            Node slt = getTail(sl);
            slt.children.add(lc);
        }
    }
//    getTail function which is supporting function to linear
    private static Node getTail(Node node){
        while (node.children.size() == 1){
            node = node.children.get(0);
        }
        return node;
    }
//    find  or search in generic tree
    public static boolean find(Node node,int target){
        if (node.data == target){
            return true;
        }
        for (Node child : node.children){
            boolean fic = find(child,target);
            if (fic){
                return true;
            }
        }
        return false;
    }
//    Node to Root Path
    public static ArrayList<Integer> nodeToRootPath(Node node , int data){
        if (node.data == data){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        for (Node child : node.children){
            ArrayList<Integer> ptc = nodeToRootPath(child,data);
            if (ptc.size()>0){
                ptc.add(node.data);
                return ptc;
            }
        }
        return new ArrayList<>();
    }
//    lowest common ancestor
    public static int lowestCommonAncestor(Node node , int data1, int data2){
        ArrayList<Integer> p1 = nodeToRootPath(node,data1);
        ArrayList<Integer> p2 = nodeToRootPath(node,data2);
        int i = p1.size()-1;
        int j = p2.size()-1;
        while (i>=0 && j>=0 && p1.get(i) == p2.get(i)){
            i--;
            j--;
        }
        i++;
        j++;
        return p1.get(i);
    }
//    Distance b/t two nodes
public static int distanceBetweenTwoNodes(Node node , int data1, int data2){
    ArrayList<Integer> p1 = nodeToRootPath(node,data1);
    ArrayList<Integer> p2 = nodeToRootPath(node,data2);
    int i = p1.size()-1;
    int j = p2.size()-1;
    while (i>=0 && j>=0 && p1.get(i) == p2.get(i)){
        i--;
        j--;
    }
    i++;
    j++;
    return i+j;
}
// function to check that the trees are similar in shape
    public static boolean areSimilar(Node n1 , Node n2){
        if (n1.children.size() != n2.children.size()){
            return false;
        }
        for(int i = 0; i <n1.children.size() ; i++) {
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(i);
            if (areSimilar(c1,c2) == false){
                return false;
            }
        }
        return true;
    }
//    function to check that two generic trees are mirror of each other or not
    public static boolean areMirror(Node n1, Node n2){
        if (n1.children.size() != n2.children.size()){
            return false;
        }
        for(int i = 0; i < n1.children.size(); i++) {
            int j = n1.children.size()-1-i;
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(j);
            if (areMirror(c1,c2) == false){
                return false;
            }
        }
        return true;
    }
//    function to check that a tree is mirror image of itself or not
    public static boolean isSymmetric(Node node){
        return areMirror(node,node);
    }
//    multi solver function
    public static void mulitiSolver(Node node){

    }
    public static void main(String[] args){
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,190,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        int[] arr2 = {103,20,50,-1,60,-1,-1,30,70,-1,800,110,-1,190,-1,-1,90,-1,-1,40,600,-1,-1,-1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i = 0; i <arr.length ; i++) {
            if (arr[i] == -1){
                st.pop();
            }else {
                Node t = new Node();
                t.data = arr[i];
                if (st.size() > 0){
                st.peek().children.add(t);
                }else {
                   root = t;
                }
                st.push(t);
            }
        }
        Node root2 = null;
        Stack<Node> st2 = new Stack<>();
        for(int i = 0; i <arr2.length ; i++) {
            if (arr2[i] == -1){
                st2.pop();
            }else {
                Node t = new Node();
                t.data = arr2[i];
                if (st2.size() > 0){
                    st2.peek().children.add(t);
                }else {
                    root2 = t;
                }
                st2.push(t);
            }
        }
        System.out.println(areSimilar(root,root2));
        System.out.println(areMirror(root,root2));
        display(root);
        int sz = size(root);
        System.out.println(sz);
        System.out.println(max(root));
        System.out.println(height(root));
        triversal(root);
        levelOrder(root);
        levelOrderLinewise(root);
        levelOrderLineWiseZZ(root);
        mirror(root);
//        removeLeaves(root);
        System.out.println(find(root,30));
        System.out.println(find(root,90000));
        ArrayList<Integer> list = nodeToRootPath(root,110);
        ArrayList<Integer> list2 = nodeToRootPath(root,70);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(lowestCommonAncestor(root,110,190));
        System.out.println(distanceBetweenTwoNodes(root,70,110));

    }
}
