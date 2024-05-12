class Aeroplane {
    public void fly() {
        System.out.println("Aeroplane is flying");
    }

    public void takeoff() {
        System.out.println("Aeroplane has took off");
    }
}

class passplane extends Aeroplane {
    public void fly() {
        System.out.println("Passplane is flying");
    }

    public void takeoff() {
        System.out.println("Passplane has took off");
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

class fighterplane extends Aeroplane {
    public void fly() {
        System.out.println("Fighterplane is flying");
    }

    public void takeoff() {
        System.out.println("Fighterplane has took off");
    }
}

class Airport {
    public void runway(Aeroplane ob) {
        ob.takeoff();
        ob.fly();
    }
}

public class poly {
    public static void main(String[] args) {
        cargoplane cp = new cargoplane();
        passplane pp = new passplane();
        fighterplane fp = new fighterplane();
        Airport ap = new Airport();
        ap.runway(cp);
        ap.runway(pp);
        ap.runway(fp);
    }
}
