import java.io.*;

public class c1 {
    public static void main(String[] args) throws IOException {
        // File f1 = new File("pw.txt");
        // System.out.println(f1.exists());
        // f1.createNewFile();
        // System.out.println(f1.exists());
        File f1 = new File("PW");
        f1.mkdir();
        System.out.println(f1.exists());
    }
}
