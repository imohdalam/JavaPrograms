package Framework;

import java.util.Arrays;
import java.util.Comparator;

class Comp implements Comparator<Integer>{
    @Override
    public int compare(Integer i, Integer j){
        if(i<j)
            return 1;
        else if(i>j)
            return -1;
        return 0;
    }
}

public class ArrayComparator {
    public static void main(String[] args) {
        int[] A = {1,2,2,3,-6,9,7,4,5,-4,0};
        int[] B = {1,2,2,3,-6,9,7,4,5,-4,0};
        // Compare element by element
        // if A > B -> 1
        // if A = B -> 0
        // if A < B -> -1
        System.out.println(Arrays.compare(A,B));
        int[] C = {1,2,2,3,-6,9,7,4,5,-4,4,3,0};
        int[] D = {1,2,2,3,-6,9,7,4,5,-4,5};
        System.out.println(Arrays.compare(C,D));
        int[] E = {1,2,2,3,-6,9,7,4,5,-4,6,9,23};
        int[] F = {1,2,2,3,-6,9,7,4,5,-4,5};
        System.out.println(Arrays.compare(E,F));
        int[] G = Arrays.copyOf(E,E.length);
        System.out.print("Array G: ");
        for (int x:G) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(Arrays.equals(G,E));
        System.out.println(Arrays.compare(G,E));
        // Arrays.fill(G,0); // All filled with 0
       // Arrays.parallelSort(G); // will sort G
        Arrays.sort(G); // Same working
        // Pre defined class Comparable will be used
        System.out.print("Array G: ");
        for (int x:G) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Index of 9: "+Arrays.binarySearch(G,23));
        Integer[] H = {8,-6,5,658,-8,6,5,-5,65,50};
        Arrays.sort(H,new Comp());
        // User Defined Class Comp will be used for sorting
        System.out.print("Array H: ");
        for(int x: H){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
