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

}

public class c8 {
    public static void main(String[] args) throws IOException {
        Cricketer c = new Cricketer("Sachin", 30, 1000);
        File f = new File("stream_object.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}
