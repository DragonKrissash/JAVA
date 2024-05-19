import java.util.Scanner;

class Calc extends Thread {
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

class Message extends Thread {
    public void run() {
        System.out.println("Message has begun! ");
        try {
            for (int a = 1; a <= 3; a++) {
                System.out.println("Hello World!");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Some error!");
        }
        System.out.println("Message completed!");
    }
}

public class c3 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Calc c = new Calc();
        Message m = new Message();
        c.start();
        m.start();
    }
}
