import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    String country() default "India";

    int age() default 34;
}

@CricketPlayer
class Virat {
    @CricketPlayer
    private int innings;
    private int runs;

    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class c9 {

    public static void main(String[] args) {
        Virat v = new Virat();
        v.setInnings(5);
        System.out.println(v.getInnings());
        v.setRuns(10);
        System.out.println(v.getRuns());
        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) a;
        String country = cp.country();
        int age = cp.age();
        System.out.println("country: " + country + " age: " + age);
    }
}
