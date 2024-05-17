import java.io.*;

public class c3 {

    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File f = new File(dir, "pw.txt");
        FileWriter fw = new FileWriter(f, true);
        fw.write("\npw");
        fw.write(65);
        fw.write(97);
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write(ch);
        fw.close();
    }

}
