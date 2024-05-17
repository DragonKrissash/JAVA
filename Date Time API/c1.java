import java.util.Date;

public class c1 {
    public static void main(String[] args) {
        java.util.Date dt = new Date();
        System.out.println(dt);
        System.out.println(dt.getYear());
        long timeinms = dt.getTime();
        java.sql.Date dt2 = new java.sql.Date(timeinms);
        System.out.println(dt2);
    }
}
