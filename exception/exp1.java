class demo {
    void a() throws Exception {
        b();
    }

    void b() throws Exception {
        System.out.println(5 / 0);
    }
}

public class exp1 {

    public static void main(String[] args) {
        demo d = new demo();
        try {
            d.a();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
