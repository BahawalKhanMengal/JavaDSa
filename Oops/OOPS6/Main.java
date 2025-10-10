package Oops.OOPS6;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 13; i++) {
            list.add(i*2);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.set(0,90000);
        System.out.println(list.get(0));
        list.remove();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.set(list.size()-1,8999);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.toString());
    }
}
