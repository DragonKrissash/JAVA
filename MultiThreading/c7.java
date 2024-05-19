class Car extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " entered the parking");
            Thread.sleep(1000);
            synchronized (this) {
                System.out.println(name + " got into the car");
                Thread.sleep(1000);
                System.out.println(name + " started driving");
                Thread.sleep(1000);
                System.out.println(name + " came back and parked");
            }
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}

public class c7 {
    public static void main(String[] args) {
        Car c = new Car();
        Thread s1 = new Thread(c);
        Thread s2 = new Thread(c);
        Thread s3 = new Thread(c);
        s1.setName("Son-1");
        s2.setName("Son-2");
        s3.setName("Son-3");
        s1.start();
        s2.start();
        s3.start();
    }
}
