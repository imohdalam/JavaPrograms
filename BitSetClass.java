package Framework;

import java.util.BitSet;

public class BitSetClass {
    public static void main(String[] args) {
        BitSet x = new BitSet();
        // Sorted
        x.set(0);
        x.set(5);
        x.set(3);
        x.set(6);
        x.set(8);
        x.set(10);
        System.out.println("x Set: "+x);
       // x.flip(0,15);
       // System.out.println("Flipped Set: "+x);
        System.out.println("Bit Size: "+x.size());
        BitSet y = new BitSet();
        y.set(1);
        y.set(2);
        y.set(4);
       // x.and(y);
        x.or(y);
        System.out.println(x);
        System.out.println("At 7 bit: "+x.get(7));
    }
}
