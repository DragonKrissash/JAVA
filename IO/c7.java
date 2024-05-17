import java.io.*;

public class c7 {
    public static void main(String[] args) throws IOException {
        File f = new File("PW/pw.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("Java");
        pw.println(100);
        pw.println(300);
        pw.close();
    }
}
