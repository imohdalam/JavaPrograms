package Framework;

import java.util.List;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {

        TreeSet<Integer> TE = new TreeSet<>(List.of(15,58,51,37,58));
        TE.add(45);
        TE.add(47);
        // Sorted element
        System.out.println(TE);
        System.out.println("TreeSet Size: "+TE.size());
        // Remove the greatest element
        TE.pollLast();
        TE.forEach((x)-> System.out.print(x+" "));
    }
}
