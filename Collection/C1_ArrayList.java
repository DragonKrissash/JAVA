import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C1_ArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(250);
        System.out.println(al1);

        // for (int a = 0; a < al1.size(); a++) {
        // // Object o = al1.get(a);
        // System.out.println(al1.get(a));
        // }
        // for (Object o : al1) {
        // System.out.println(o);
        // }

        int sum = 0;
        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            Integer a = (Integer) itr.next();
            sum = sum + a;
            System.out.println(sum);

        }
        ListIterator litr = al1.listIterator(al1.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
