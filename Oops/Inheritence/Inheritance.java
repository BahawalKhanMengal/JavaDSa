package Oops.Inheritence;

public class Inheritance {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(1,5,4,5);
        System.out.println( box1.l +" " + box1.w + " " + box1.h);
//        Box box2 = new Box(box1);
        Box box2 = new Box(2,3,4);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);


    }
    static class Parent{
        int length;
        int width;
        int height;
    }
    static class BoxWeight extends Box{
        int weight;
        public BoxWeight(int l,int w, int h, int weight){
            super(l,w,h);
            this.weight = weight;
        }
    }
}
