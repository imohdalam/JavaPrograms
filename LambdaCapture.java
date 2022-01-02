package Lambda;

import java.sql.SQLOutput;

@FunctionalInterface
interface LambdaCap{
    void display();
}

class UseLambda{
    void callLambda(LambdaCap L){
        L.display();
    }
}

class Demo{
    int temp = 0;
    void method(){
        int count = 0; // must not be modified later
        LambdaCap LE =()->{
            int value = 0;
            System.out.println("Lambda Capture");
            System.out.println("Yes, I can capture more than one statements");
            System.out.println("Value: "+(++value));
            System.out.println("Count: "+(count));
            System.out.println("Temp: "+(++temp));
        };
        LE.display();
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> System.out.println("Lambda Expression as Method Object"));
        // Passing method as an Object
    }
}

public class LambdaCapture {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method();
    }
}
