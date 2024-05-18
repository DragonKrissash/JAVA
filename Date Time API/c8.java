@FunctionalInterface
interface demo {
    void d1();
}

class Plane {
    void planeFlies() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane {
    @Override
    void planeFlies() {
        System.out.println("Cargo plane is flying");
    }
}

public class c8 {
    public static void main(String[] args) {
        Plane p = new CargoPlane();
        p.planeFlies();
    }
}
