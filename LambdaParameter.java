package Lamda;

// Single Parameter Lambda Expression
//@FunctionalInterface
//interface LambdaInterface{
//    public void show(String str);
//}
//
//public class LambdaParameter {
//    public static void main(String[] args) {
//        LambdaInterface l = (s)->{System.out.println(s);};
//        l.show("JAVA Programming");
//    }
//}

// Multiple Parameter Lambda Expression
@FunctionalInterface
interface LambdaInterface{
    int Multiply(int a, int b, int c);
}

public class LambdaParameter {
    public static void main(String[] args) {
//        LambdaInterface l = (a,b,c)->{return a*b*c;};
        LambdaInterface l = (a,b,c)->a*b*c; // will return method int return type;
        System.out.println(l.Multiply(7,1,3));
    }
}


