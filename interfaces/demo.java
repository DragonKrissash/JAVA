interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("This is show");
    }
}

public class demo {
    public static void main(String[] args) {
        A ob = new B();
        ob.show();
    }
}
