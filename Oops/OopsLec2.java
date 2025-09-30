package Oops;

public class OopsLec2 {
    public static void main(String[] args) {
//     Human khan = new Human(23,"khan","male",false);
//        Human khann = new Human(24,"khann","male",false);
        System.out.println(Human.population);
        System.out.println(Human.HumanPopulation());
        System.out.println("\uD83D\uDCA1");
    }

    public static class Human {
        int age;
        String name;
        String gender;
        boolean married;
        static long population;

        public Human(int age, String name, String gender, boolean married) {
            this.age = age;
            this.name = name;
            this.gender = gender;
            this.married = married;
            Human.population += 1;
        }

        static long HumanPopulation() {
            long pop = Human.population;
            return pop;
        }
    }
}
