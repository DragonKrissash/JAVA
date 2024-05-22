import java.util.*;

public class c1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Krish");
        map.put(2, "Kish");
        map.put(1, "ore");
        System.out.println(map);
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(3, "Krish");
        map1.put(2, "Kish");
        map1.put(1, "ore");
        System.out.println(map1);
    }
}
