interface Car {
    void drive();
}

public class anonymousinnerclass {
    public static void main(String[] args) {
        Car c = new Car() {
            public void drive() {
                System.out.println("Driving");
            }
        };
        c.drive();
    }
}
