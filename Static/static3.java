class demo {

    static void disp1() {
        System.out.println("Static void display 1");
    }

    void disp2() {
        System.out.println("Non-static void display 2");
    }
}

public class static3 {

    public static void main(String[] args) {
        demo.disp1();
        demo d = new demo();
        d.disp2();
    }

}
