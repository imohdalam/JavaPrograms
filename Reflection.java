package JavaLangPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class MyClass{
    private int a;
    protected int b;
    public int c;
    int d;

    public MyClass(){}
    public MyClass(int x, int y){}
    public void display(String m){}
    public boolean isTrue(int t, String s, boolean h){return true;}
}

public class Reflection {
    public static void main(String[] args) {
      Class c = MyClass.class;
        System.out.println(c.getName());

        Field[] f = c.getDeclaredFields();
        for (Field fa: f) {
            System.out.println(fa);
        }

        Constructor[] cons = c.getConstructors();
        for (Constructor ct:cons){
            System.out.println(ct);
        }

        Method[] meth = c.getMethods();
        for(Method met: meth){
            System.out.println(met);
        }

        Parameter[] param = meth[1].getParameters();
        for (Parameter p:param) {
            System.out.println(p);
        }
    }
}
