import java.util.*;
import java.util.stream.*;

public class c4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamData = list.stream();
        streamData.forEach(n -> System.out.println(n));
    }
}
