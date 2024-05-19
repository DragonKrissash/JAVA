import java.util.Scanner;

class Calc1 implements Runnable {
    public void run() {
        System.out.println("Calculation has begun! ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("The sum is: " + (a + b));
        System.out.println("Calculation completed!");
    }
}

class Message1 implements Runnable {
    public void run() {
        System.out.println("Message has begun! ");
        try {
            for (int a = 1; a <= 3; a++) {
                System.out.println("Hello World!");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Some error!");
        }
        System.out.println("Message completed!");
    }
}

public class c4 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Calc c = new Calc();
        Message m = new Message();
        // Thread t1 = new Thread(() -> {
        // System.out.println("Message has begun! ");
        // try {
        // for (int a = 1; a <= 3; a++) {
        // System.out.println("Hello World!");
        // Thread.sleep(1000);
        // }
        // } catch (Exception e) {
        // System.out.println("Some error!");
        // }
        // System.out.println("Message completed!");
        // });
        // Thread t2 = new Thread(() -> {
        // System.out.println("Calculation has begun! ");
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int a = s.nextInt();
        // System.out.println("Enter the second number: ");
        // int b = s.nextInt();
        // System.out.println("The sum is: " + (a + b));
        // System.out.println("Calculation completed!");
        // });
        new Thread(() -> {
            System.out.println("Message has begun! ");
            try {
                for (int a = 1; a <= 3; a++) {
                    System.out.println("Hello World!");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("Some error!");
            }
            System.out.println("Message completed!");
        }).start();
        new Thread(() -> {
            System.out.println("Calculation has begun! ");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = s.nextInt();
            System.out.println("Enter the second number: ");
            int b = s.nextInt();
            System.out.println("The sum is: " + (a + b));
            System.out.println("Calculation completed!");
        }).start();
    }
}
