package Framework;

import java.util.HashSet;

public class SetHash {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>(2,0.75f);
        HS.add(10);
        HS.add(52);
        HS.add(42);
        HS.add(89);
        HS.add(37);
        HS.add(52);
        HS.add(49);
        //Not in same order as inserted
        // No duplicate element inserted
        // Size of table will be increased automatically
        System.out.println(HS);
        HS.remove(52);
        System.out.println(HS);
        System.out.println("Hash Table Size: "+HS.size());
    }
}
