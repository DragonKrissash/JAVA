class demo extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class c2 {
    public static void main(String[] args) {
        demo d = new demo();
        d.start();
        d.setPriority(5);
        Thread.currentThread().setPriority(1);
        System.out.println("Main thread");

    }
}
