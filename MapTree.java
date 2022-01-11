package Framework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> T1 = new TreeMap<>(Map.of(1, "A", 2, "B"));
        T1.put(3,"C");
        T1.put(4,"D");
        T1.put(5,"F");
        System.out.println(T1);
        System.out.println("TreeMap Size: "+T1.size());
        T1.remove(3);
        System.out.println(T1);
        System.out.println("TreeMap Size: "+T1.size());
        T1.put(3,"C");
        T1.replace(5,"E");
        System.out.println(T1);
        System.out.println("TreeMap Size: "+T1.size());
        T1.forEach((x,y)-> System.out.println(x+"="+y+" "));
        System.out.println(T1.ceilingEntry(0).getValue());
        System.out.println("Value at Key=3: "+T1.get(3));
        Entry<Integer, String> E = T1.firstEntry();
        System.out.println(E);
        E =T1.pollFirstEntry();
        System.out.println(T1);
    }
}
