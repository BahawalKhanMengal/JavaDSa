package Oops.AbstractInterfaceAnotations;

public class Main {
    public static void main(String[] args) {
        Son son = new Son() {
            @Override
            void career(String name) {

            }

            @Override
            void partner(String name, int age) {

            }
        };
        son.career();
        Daughter daughter = new Daughter() {
            @Override
            void career(String name) {

            }

            @Override
            void partner(String name, int age) {

            }
        };
        daughter.career();
    }
}
