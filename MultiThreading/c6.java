
class demo1 extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
            for (int a = 1; a <= 3; a++) {
                System.out.println("Hello world!");
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            System.out.println("Something gone wrong!");
        }
        System.out.println("Thread executed!");
    }
}

public class c6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started! ");
        demo1 d = new demo1();
        System.out.println(d.isAlive());
        d.start();
        System.out.println(d.isAlive());
        d.join();
        System.out.println("Main thread executed! ");
    }
}
