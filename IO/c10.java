import java.io.*;

class Cricketer1 implements Serializable {
    String name;
    transient int age;
    int runs;

    Cricketer1(String name, int age, int runs) {
        this.age = age;
        this.name = name;
        this.runs = runs;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Runs: " + runs);
    }
}

public class c10 {
    public static void main(String[] args) throws Exception {
        // Cricketer1 c1 = new Cricketer1("Sachin", 40, 10000);
        // File f = new File("ob2_stream.txt");
        // f.createNewFile();
        // FileOutputStream fos = new FileOutputStream(f);
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);
        // oos.writeObject(c1);
        // oos.flush();
        // oos.close();
        FileInputStream fos = new FileInputStream("ob2_stream.txt");
        BufferedInputStream bos = new BufferedInputStream(fos);
        ObjectInputStream ois = new ObjectInputStream(bos);
        Cricketer1 c2 = (Cricketer1) ois.readObject();
        c2.display();
        ois.close();
    }
}
