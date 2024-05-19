
public class c1 {
    public static void main(String[] args) {
        System.out.println("Name of the main thread: " + Thread.currentThread().getName());
        System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setName("PW");
        Thread.currentThread().setPriority(1);
        System.out.println("Name of the main thread: " + Thread.currentThread().getName());
        System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());

    }
}
