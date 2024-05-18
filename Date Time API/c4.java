import java.util.*;
import java.util.stream.*;

public class c4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Stream<Integer> streamData = list.stream();
        // Stream<Integer> evenData = streamData.filter(n -> n % 2 == 0);
        // Stream<Integer> sortedData = evenData.sorted();

        Stream<Integer> mapData = list.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> 2 * n);
        mapData.forEach(n -> System.out.println(n));
    }
}
