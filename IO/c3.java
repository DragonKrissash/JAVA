import java.io.*;

public class c3 {

    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File f = new File(dir, "pw.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("pw");
        fw.write(65);
        fw.write(97);
        fw.close();
    }

}
