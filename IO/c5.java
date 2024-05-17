import java.io.*;

public class c5 {
    public static void main(String[] args) throws IOException {
        File f = new File("PW/pw.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("JAVA");
        bw.write(65);
        bw.newLine();
        bw.write(66);
        bw.close();
    }
}
