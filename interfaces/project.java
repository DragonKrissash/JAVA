interface Computer {
    void computeCode();
}

class Laptop implements Computer {
    public void computeCode() {
        System.out.println("Code is computing");
    }
}

class Desktop implements Computer {
    public void computeCode() {
        System.out.println("Code is computing faster in desktop");
    }
}

class Developer {
    public void writeCode(Computer cpt) {
        System.out.println("Starting to write code");
        cpt.computeCode();
    }
}

public class project {
    public static void main(String[] args) {
        Developer d = new Developer();
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        d.writeCode(laptop);
    }
}
