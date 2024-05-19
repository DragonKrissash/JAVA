class Library implements Runnable {
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Student 1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student 1 got " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 1 got " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 1 got " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some error");
            }
        } else {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("Student 2 got " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 2 got " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println("Student 2 got " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some error");
            }
        }
    }
}

public class c8 {
    public static void main(String[] args) {
        Library l = new Library();
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.setName("Student 1");
        t2.setName("Student 2");
        t1.start();
        t2.start();
    }
}
