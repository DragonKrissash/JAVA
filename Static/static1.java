public class static1 {
    static int a;

    static {
        a = 10;
        System.out.println("Static block");
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}