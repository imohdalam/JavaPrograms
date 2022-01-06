package generic;

class Apple{
    Apple(){
        System.out.println("I'm Apple");
    }
}
class Banana extends Apple{
    Banana(){
        System.out.println("I'm Banana extended from Apple");
    }
}
class Mango extends Banana{
    Mango(){
        System.out.println("I'm Mango extended from Banana");
    }
}

class ClassG<T>{
    T[] A = (T[]) new Object[10];
    int length = 0;
    void append(T Value){
        A[length++] = Value;
    }
    void display(){
        for(int i=0; i<length; i++){
            System.out.print(A[i]+" ");
        }
    }
}
public class GenericMethod {

    // Generic method
    static <E> void show(E[] list) {
        for (E x : list) {
            System.out.println(x);
        }

        // Bound type works here
       /* static <E extends Integer> void show(E... list){
            for(E x: list){
                System.out.println(x);
            }
            */
    }

          // WildCard<?> Unbounded
          static void fun1(ClassG<?> P){
              P.display();
          }

        // WildCard<?> bounded with extends i.e, Upper Bound
        static void fun2(ClassG<? extends Apple> P){
            P.display();
        }

    // WildCard<?> bounded with super i.e, Lower Bound
       static void fun3(ClassG<? super Mango> P){
           P.display();
         }

    public static void main(String[] args) {

        show(new String[]{"Java", "Machine Learning"});
        show(new Integer[]{12,34});

        ClassG<String> S = new ClassG<>();
        S.append("Java");
        S.append("ML");

        ClassG<Integer> I = new ClassG<>();
        I.append(45);
        I.append(73);

        fun1(S);
        fun1(I);

        ClassG<Apple> A = new ClassG<>();
        ClassG<Banana> B = new ClassG<>();
        ClassG<Mango> C = new ClassG<>();
        A.append(new Mango());
        fun2(A);
        fun2(B);
        fun3(C);
    }

}
