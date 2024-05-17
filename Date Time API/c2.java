import java.time.*;

public class c2 {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        int day = dt.getDayOfMonth();
        int month = dt.getMonthValue();
        int year = dt.getYear();
        System.out.println(day + " " + month + " " + year);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int sec = time.getSecond();
        int min = time.getMinute();
        int hour = time.getHour();
        System.out.println(sec + " " + min + " " + hour);
    }
}
