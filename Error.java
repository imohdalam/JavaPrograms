package error;

class X {
    private int a=100;
    int b=20;
    void check() {
        Y ob1 = new Y();
        ob1.show();
    }
    class Y {
        int b=10;
        int a=200;
        void show() {
            System.out.println("a = " + a);
            getb();
        }
    }
    void getb() {
        System.out.println(b);
        getb();
    }
}
class Main {
    public static void main (String args []){
        X ob = new X();
        ob.check();
    }
}

