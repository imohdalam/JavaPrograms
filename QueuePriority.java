package Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuePriority {
    public static void main(String[] args) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        PQ.add(2);
        PQ.add(5);
        PQ.add(13);
        PQ.add(8);
        PQ.add(1);
        PQ.add(11);
        PQ.offer(15);
        System.out.println("Root Element: "+PQ.peek());
        System.out.print("All Elements of PriorityQueue: ");
        PQ.forEach((x)-> System.out.print(x+" "));
        PQ.poll();
        System.out.println("\nDeleted the Root Element");
        System.out.println("Root Element: "+PQ.peek());
        System.out.print("All Elements of PriorityQueue: ");
        PQ.forEach((x)-> System.out.print(x+" "));
        System.out.println("\nSize: "+PQ.size());

        PriorityQueue<Integer> MQ = new PriorityQueue<>(new MyPriority());
        MQ.add(2);
        MQ.add(5);
        MQ.add(13);
        MQ.add(8);
        MQ.add(1);
        MQ.add(11);
        MQ.offer(15);
        System.out.println("Root Element: "+MQ.peek());
        System.out.print("All Elements of PriorityQueue: ");
        MQ.forEach((x)-> System.out.print(x+" "));
        MQ.poll();
        System.out.println("\nDeleted the Root Element");
        System.out.println("Root Element: "+MQ.peek());
        System.out.print("All Elements of PriorityQueue: ");
        MQ.forEach((x)-> System.out.print(x+" "));
        System.out.println("\nSize: "+MQ.size());

    }
}

class MyPriority implements Comparator<Integer>{
    @Override
    public int compare(Integer Obj1, Integer Obj2){
        if(Obj1>Obj2)
            return -1; // default return 1
        if(Obj1<Obj2)
            return 1; // default return -1
        return 0;  // both equal
    }
}
