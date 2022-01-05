package generic;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        o = "Do some exercise in between your lectures.";
        System.out.println(o);
        Object[] ob = new Object[3];
        // Capable of storing any type of Object
        ob[0] = "Hi";
        ob[1] = 'A';
        ob[2] = 6;
        for(Object x: ob){
          //  x = (String)x;
            // Not Type Safe
            System.out.println(x);
        }
    }
}
