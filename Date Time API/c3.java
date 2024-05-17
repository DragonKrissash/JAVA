import java.util.*;
import java.util.function.Consumer;

public class c3 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(2, 4, 5, 8, 9);
        // System.out.println(list2);
        // for (int i : list2) {
        // System.out.println(i);
        // }
        Consumer<Integer> cons = (Integer i) -> {

            System.out.println(i);

        };
        list2.forEach(cons);
    }
}
