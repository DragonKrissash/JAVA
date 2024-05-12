interface A {
    default void abc() {
        System.out.println("in abc");
    }

    static void config() {
        System.out.println("In config");
    }

    void show();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }
}

public class Java8 {
    public static void main(String[] args) {
        A ob = new B();
        ob.abc();
        A.config();
        ob.show();
    }
}
