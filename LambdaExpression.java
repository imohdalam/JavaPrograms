/*
package Lambda;

//Writing in Normal Format

interface MyLambda{
    public void display();
}

class MyClass implements MyLambda{
    @Override
    public void display(){
        System.out.println("Overriding the MyLambda interface");
    }
}
public class Main {

    public static void main(String[] args) {
	  MyLambda L = new MyClass();
      L.display();
    }
}
 */

// Now, converting it into Lambda Expression

package Lamda;

//Writing in Normal Format

@FunctionalInterface
interface MyLambda{
    void display();
}

public class Main {

    public static void main(String[] args) {
        MyLambda L = ()->{
            System.out.println("Converted in Lambda Expression");
        };
        L.display();
    }
}


