public class VariableScopingFunction {
    public static void main(String[] args) {
        int num = 40;
        String name = "bahawal";
        scoping(name);
    }

    static void scoping(String name) {
        name ="khan";
        System.out.println(name);
    }
}
