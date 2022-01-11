package Framework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> HT = new Hashtable(5,0.5f);
        // Old Class
        HT.put(123,"Supervised");
        HT.put(458, "Unsupervised");
        HT.put(432, "Reinforcement");
        HT.put(954, "Recommender");
        System.out.println("Algo at key=458: "+HT.get(458));
        //String s = HT.get(432);
        HT.compute(954,(k,v)->v+" System");
        HT.compute(852, (k,v)->"Gradient Decent");
        Enumeration enumeration = HT.elements();
       // Enumeration enumeration = HT.keys();
        // Works like Iterator
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println(HT);
    }
}
