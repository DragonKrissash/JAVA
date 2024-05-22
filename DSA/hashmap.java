import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "KRidhna");
        hm.put(2, "Kishore");
        System.out.println(hm.get(1));
        System.out.println(hm.containsKey(1));
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
