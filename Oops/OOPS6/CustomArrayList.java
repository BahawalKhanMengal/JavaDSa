package Oops.OOPS6;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }

    private void reSize() {
        int[] temp = new int[data.length * 2];
//        after resize the data length copy the items of data array in temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return  size == data.length;
    }
//    remove method
    public int remove(){
        int removed = data[--size];
        return removed;
    }
//    get element of array
    public int get(int index){
        return data[index];
    }
//    size of our arraylists
    public int size(){
        return size;
    }
//    set
    public void set(int index ,int value){
         data[index] = value;
    }
//    over Ride toString method
    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data = " + Arrays.toString(data) + ", size = " + size()  + "}";
    }
}
