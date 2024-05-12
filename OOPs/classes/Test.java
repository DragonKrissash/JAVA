package classes;

class Test {
    int a;
    String name;

    Test() {
        name = "Krishna";
        a = 10;
    }

    public static void main(String[] args) {
        Test ob = new Test();
        System.out.println(ob.name + " " + ob.a);
    }
}