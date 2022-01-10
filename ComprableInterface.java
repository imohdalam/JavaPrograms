package Framework;

import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;
    Point(int x, int y){
     this.x = x;
     this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else {
            if (this.y > p.y)
                return 1;
        }
        return -1;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        TreeSet<Point> P1 = new TreeSet<>();
        P1.add(new Point(5,2));
        P1.add(new Point(4,3));
        P1.add(new Point(0,0));
        P1.add(new Point(1,2));
        P1.add(new Point(2,3));
        P1.add(new Point(2,4));
       // System.out.println(P1);
        P1.pollLast(); // (5,2) deleted
        P1.pollFirst(); // (0,0) deleted
        P1.forEach((x)-> System.out.println(x));
    }
}
