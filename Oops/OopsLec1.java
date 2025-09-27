package Oops;

public class OopsLec1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "bahawal";
        student1.rollNo = 1;
        student1.obtainNumbers = 90;
        System.out.println(student1);
    }
    static class Student{
        int rollNo;
        String name;
        float obtainNumbers;
    }
}
