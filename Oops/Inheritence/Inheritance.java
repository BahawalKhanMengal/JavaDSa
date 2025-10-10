package Oops.Inheritence;

public class Inheritance {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(1,5,4,5);
        System.out.println( " " + box1.w + " " + box1.h);
        box1.greeting();
//        Box box2 = new Box(box1);
        Box box2 = new Box(2,3,4);
        System.out.println(  box2.w + " " + box2.h);
        Box box3 = new BoxWeight(3,4,5,6);
        box3.greeting();
        System.out.println(box1.getL());


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
//        @Override
//        static class from parent class can not be overridden
        static void greeting(){
            System.out.println("Hey this is greeting from the BoxWeight Child class of Box Class");
        }

    }
}
