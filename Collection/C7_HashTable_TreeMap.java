import java.util.*;;

public class C7_HashTable_TreeMap {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Rohan");
        ht.put(3, "Rohit");
        ht.put(2, "Ramesh");
        ht.put("Virat", "kohli");
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(2, "Rohit");
        tm.put(1, "Ramesh");
        tm.put(4, "Rahul");
        tm.put(3, "Rohan");
        System.out.println(tm);
    }
}
