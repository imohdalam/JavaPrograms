package Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHash {
    public static void main(String[] args) {
       // LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5,0.5f);
        LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5,0.5f,true){
            // working as Cached Memory
          protected boolean removeEldestEntry(Map.Entry entry){
              return size()>5;
          }
        };
        // Initial Capacity is 5 and loading function ₰ = 50%
        LHM.put(1,"Apple");
        LHM.put(3,"Cake");
        LHM.put(2,"Donuts");
        System.out.println(LHM);
        LHM.put(5,"Egg");
        LHM.put(4,"Bucket");
        System.out.println("Value at Key=1 : "+LHM.get(1)); // Using Key=1
        LHM.put(6,"Funny"); // Least Recent used is key=3 will be overridden
        System.out.println("Value at Key=3 : "+LHM.get(3)); // No available
        LHM.forEach((key,value)-> System.out.println(key+" -> "+value));
    }
}
