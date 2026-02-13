package Oops;

public class OopsLec1 {
    OopsLec1(){
        System.out.println("Oops Lecture one is Got Executed!");
    }
    public static void main(String[] args) {
        OopsLec1 oop = new OopsLec1();
        Student student1 = new Student(1,"bahawal",90.5f);
        System.out.println(student1.rollNo +" " + student1.name+" " + student1.obtainNumbers);
//        changing the name at run time now when i call greeting below this name should be changed after the
//        changedname function called below all the objects properties or method in which i am using name they will
//        be changed to new name
        student1.ChangeName("Meer Mengal");
        student1.greeting();
//        student2
        Student student2 = new Student(2,"khan",89);
        System.out.println(student2.rollNo +" " + student2.name+" " + student2.obtainNumbers );
        student2.ChangeName("meer");
        student2.greeting();
//        object with 0 argu but also we can set some default values in the empty constructure with help to this
//        keyword.
        Student student3 = new Student();
        student3.greeting();
//        taking properties from other objects
        Student student4 = new Student(student2);
        System.out.println(student4.rollNo +" " + student4.name+" " + student4.obtainNumbers );
        student4.greeting();
    }
    public static void Greet(){
        System.out.println("this is greeting message form me as develper of ");
    }
    static class Student{
        int rollNo;
        String name;
        float obtainNumbers;
        Student(int rollNoo,String namee,float obtainNumberss){
            this.rollNo = rollNoo;
            this.name = namee;
            this.obtainNumbers = obtainNumberss;
        }
//        constructure overloading when i create a object and constructure is empty this constructure will run
        Student(){
            this(0,"default person",100.0f);
            System.out.println("empty argu constructure with default this values");


        }
//        constructure overloading with taking properties from another object of the class
        Student(Student other){
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.obtainNumbers = other.obtainNumbers;
        }
        void greeting(){
            System.out.println("Hello my name is "+ this.name);
        }
        void ChangeName(String newName){
            this.name = newName;
        }


    }
}
