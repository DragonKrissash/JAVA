import java.util.ArrayDeque;

public class C2_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addFirst(20);
        ad1.add("PW");
        System.out.println(ad1);
        ad1.offer(1);
    }
}
