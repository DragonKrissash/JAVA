
interface car {
    void drive(int avg, int max);
}

public class lambdaexp {
    public static void main(String[] args) {
        car c = (avg, max) -> System.out.println("Driving with " + avg + " " + max);
        c.drive(50, 100);
    }

}
