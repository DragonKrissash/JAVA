class exa implements Runnable {
    public void run() {
        for (int a = 0; a < 3; a++) {
            try {
                System.out.println("Hello worlds");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted!");
            }
        }
    }
}

public class c9 {
    public static void main(String[] args) {
        System.out.println("Main thread is running!");
        exa e = new exa();
        Thread t = new Thread(e);
        t.start();
        t.interrupt();
    }
}
