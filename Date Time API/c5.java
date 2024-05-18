enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class c5 {
    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);
        int ind = Week.MON.ordinal();
        System.out.println(ind);
        Week wr[] = Week.values();
        for (Week w1 : wr) {
            System.out.println(w1);
        }
    }
}
