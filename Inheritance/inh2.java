class demo1 {
    demo1() {
        this(5, 10);
        System.out.println("Demo1 0 constructor");
    }

    demo1(int x, int y) {
        System.out.println("Demo1 2 var constructor");
    }
}

class demo2 extends demo1 {
    demo2() {
        this(5, 10);
        System.out.println("Demo2 0 constructor");
    }

    demo2(int x, int y) {
        super();
        System.out.println("Demo2 2 var constructor");
    }
}

public class inh2 {
    public static void main(String[] args) {
        demo2 d = new demo2();
    }
}