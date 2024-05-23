import java.util.*;

public class c2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = s.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int a = 0; a < word.length(); a++) {
            if (map.get(word.charAt(a)) == 1) {
                System.out.println("The first letter is: " + word.charAt(a));
                break;
            }
        }
    }
}