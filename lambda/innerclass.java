class A {
    class B {
        void disp() {
            System.out.println("In B");
        }
    }

    void show() {
        System.out.println("In A");
    }
}

public class innerclass {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        A.B ob1 = ob.new B();
        ob1.disp();
    }
}
