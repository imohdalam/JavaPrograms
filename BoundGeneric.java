package generic;


class A{}
class B extends A{}
class C extends B{}

class MyClass<T extends A>{
    T[] A = (T[]) new Object[10];
}

interface P{}
class Q implements P{}
class R implements P{}

class MyList<T extends P>{
    T[] A = (T[]) new Object[10];
}

public class BoundGeneric {

    public static void main(String[] args) {
        // class extends
        MyClass<A> data1 = new MyClass<>();
        MyClass<B> data2 = new MyClass<>();
        MyClass<C> data3 = new MyClass<>();
        // Interface also extends
        MyList<P> list1 = new MyList<>();
        MyList<Q> list2 = new MyList<>();
        MyList<R> list = new MyList<>();
    }
}
