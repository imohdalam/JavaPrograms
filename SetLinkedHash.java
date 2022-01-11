package Framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> LHS = new LinkedHashSet<>();
        // Not in sorted order
        LHS.add("Amazon");
        LHS.add("AWS");
        LHS.add("EC2");
        LHS.add("AWS"); // set have unique elements, so no;
        // Using Lambda function
      //  LHS.forEach((x)-> System.out.print(x+" "));
        // Using Iterator
        Iterator<String> i = LHS.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
