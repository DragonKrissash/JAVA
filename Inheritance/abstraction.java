abstract class Aeroplane {
    abstract public void fly();

    abstract public void takeoff();

    public void land() {
        System.out.println("Aeroplane has landed");
    }
}

class passplane extends Aeroplane {
    public void fly() {
        System.out.println("Passplane is flying");
    }

    public void takeoff() {
        System.out.println("Passplane has took off");
    }

    public void alert() {
        System.out.println("Alert...");
    }
}

class cargoplane extends Aeroplane {
    public void fly() {
        System.out.println("Cargoplane is flying");
    }

    public void takeoff() {
        System.out.println("Cargoplane has took off");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Aeroplane ref1 = new cargoplane();
        Aeroplane ref2 = new passplane();
        ref1.fly();
        ((passplane) ref2).alert();
    }
}
