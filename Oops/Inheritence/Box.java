package Oops.Inheritence;

public class Box {
//    private int l;
    int l;
    int w;
    int h;

    //cube
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
