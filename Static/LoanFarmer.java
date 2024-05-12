import java.util.Scanner;

class farmer {
    int pa;
    float td, ri, si;

    void input() {
        System.out.println("Please enter the amount required: ");
        Scanner s = new Scanner(System.in);
        pa = s.nextInt();
        System.out.println("Please enter the time required to repay: ");
        td = s.nextFloat();
        ri = 4.5f;
    }

    void compute() {
        si = (pa * td * ri) / 100f;
    }

    void display() {
        System.out.println("The simple interest is: " + si);
    }
}

public class LoanFarmer {

    public static void main(String[] args) {
        farmer f1 = new farmer();
        farmer f2 = new farmer();
        f1.input();
        f1.compute();
        f1.display();
        f2.input();
        f2.compute();
        f2.display();
    }

}
