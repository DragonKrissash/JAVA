import java.util.Scanner;

class Mythr extends Thread {
    public void run() {
        if (Thread.currentThread().getName().equals("calc")) {
            calc();
        } else
            msg();
    }

    void calc() {
        System.out.println("Calculation has begun! ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("The sum is: " + (a + b));
        System.out.println("Calculation completed!");
    }

    void msg() {
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

public class c5 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Mythr t1 = new Mythr();
        Mythr t2 = new Mythr();
        t1.setName("calc");
        t2.setName("msg");
        t1.start();
        t2.start();
    }
}
