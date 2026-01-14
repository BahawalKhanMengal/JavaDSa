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
    public static void main(String[] args){
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,190,-1,-1,90,-1,-1,40,100,-1,-1,-1};
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

    }
}
