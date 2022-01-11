package Framework;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {
        HashMap<Integer, String> H1 = new HashMap<>(Map.of(1, "A", 2, "B"));
        H1.put(3, "C");
        H1.put(4, "D");
        H1.put(5, "F");
        System.out.println(H1);
        System.out.println("TreeMap Size: " + H1.size());
        H1.remove(3);
        System.out.println(H1);
        System.out.println("TreeMap Size: " + H1.size());
        H1.put(3, "C");
        H1.replace(5, "E");
        System.out.println(H1);
        System.out.println("TreeMap Size: " + H1.size());
        H1.forEach((x, y) -> System.out.println(x + "=" + y + " "));
        System.out.println(H1.isEmpty());
        System.out.println("Value at Key=3: " + H1.get(3));
        System.out.println(H1);
    }
}
