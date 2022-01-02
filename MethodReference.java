package Lambda;

interface LambdaMeth{
    void display(String s);
}

interface LambdaMeth2{
    int compare(String s1, String s2);
}

class DemoClass{

    DemoClass(){
        System.out.println("I'm Constructor");
    }
    static void reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Reverse: "+sb);
    }
    void getLength(String s){
        StringBuffer sb = new StringBuffer(s);
        System.out.println("Length: "+sb.length());
    }
}

public class MethodReference {
    public static void main(String[] args) {
        //Overwrites display method by println
        LambdaMeth lm = System.out::println;
        lm.display("Method Reference for static methods");
        //Overwrites display method by reverse
        lm = DemoClass::reverse;
        lm.display("ytrewq");
        //Overwrites display method by getLength
        DemoClass mr = new DemoClass();
        LambdaMeth lml = mr::getLength;
        lml.display("qwertyuiopasdfghjklzxcvbnm");
        //using pre-defined method for overwriting display method
        LambdaMeth2 jk = String::compareTo;
        System.out.println("Compare: "+jk.compare("a","A"));
    }
}

// It is much like polymorphism mechanism
