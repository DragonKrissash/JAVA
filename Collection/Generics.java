class Gen<T> {
    T obj;

    Gen(T ob) {
        this.obj = ob;
    }

    T getObj() {
        return obj;
    }

    void display() {
        System.out.println(this.obj.getClass().getName());
    }
}

public class Generics {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(20);
        g.display();
        System.out.println(g.getObj());
    }
}
