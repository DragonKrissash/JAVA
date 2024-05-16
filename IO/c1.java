import java.io.*;

public class c1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("pw.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());
    }
}
