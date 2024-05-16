import java.io.*;

public class c2 {

    public static void main(String[] args) throws IOException {
        // File dir = new File("PW");
        // dir.mkdir();
        // File f = new File(dir, "pw.txt");
        // f.createNewFile();
        int c = 0;
        File f = new File("PW");
        String str[] = f.list();
        for (String name : str) {
            System.out.println(name);
        }
    }

}
