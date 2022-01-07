package Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Integer> AL1 = new ArrayList<>();
        AL1.add(100);
        AL1.add(0,99);
        AL1.add(101);
        ArrayList<Integer> AL2 = new ArrayList<>(List.of(102,103,105,106,107));
        AL1.addAll(AL2);
        AL2.add(0,102);
        AL1.removeAll(AL2);
        AL1.addAll(AL2);
        AL1.add(5,104);
        AL1.remove(3);
        AL1.set(4,103);
        AL1.set(5,104);
        AL2.removeAll(AL2);
        System.out.println("ArrayList AL1 Size: "+AL1.size());
        System.out.println(AL1);
        System.out.println(AL2);
        //Loop
       /* for(int i=0; i<AL1.size(); i++){
            System.out.print(AL1.get(i)+" ");
        }
        System.out.println();
        for (Integer x: AL1) {
            System.out.print((++x)+" ");
        } */

        // Iterator
        Iterator<Integer> IL = AL1.iterator();
        while(IL.hasNext()){
            System.out.print(IL.next()+" ");
        }
        System.out.println();

        //ListIterator Class
        ListIterator<Integer> IL1 = AL1.listIterator();
        while(IL1.hasNext()){
            System.out.print(IL1.next()+" ");
        }
        System.out.println(IL1.previous());
        System.out.println(IL1.previousIndex());
        System.out.println(IL1.hasPrevious());

        for(Iterator<Integer> IL2 = AL1.iterator();IL2.hasNext();){
            System.out.print(IL2.next()+" ");
        }
        System.out.println();
       // AL1.forEach(System.out::println);
        AL1.forEach(n->show(n));
    }
    static void show(int n){
        if(n>103)
            System.out.print(n+" ");
    }
}
