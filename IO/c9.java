import java.io.IOException;
import java.io.Serializable;
import java.io.*;

class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.age = age;
        this.name = name;
        this.runs = runs;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Runs: " + runs);
    }
}

public class c9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("stream_object.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer c = (Cricketer) ois.readObject();
        c.display();
        ois.close();
    }
}
