
class demo {
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("Control in static block!");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Control in non-static block!");
        m = 30;
        n = 40;
    }

    static void disp1() {
        System.out.println("Value of var a: " + a);
        System.out.println("Value of var b: " + b);
    }

    void disp2() {
        System.out.println("Value of var m: " + m);
        System.out.println("Value of var n: " + n);
    }

}

public class static2 {

    public static void main(String[] args) {
        // demo d = new demo();
        demo.disp1();
        // d.disp2();
    }

}
