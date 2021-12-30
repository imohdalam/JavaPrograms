package JavaLangPackage;

enum Dept{
    CSA("Allen","Paris"),
    IT("Octave","USA"),
    EC("Bell","Sydney"),
    ME("Micheal","Manchester"),
    CE("linus","Ohio");
    //finals and In Caps
    String Name;
    String Address;

    Dept(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
        System.out.println(this.name()+"["+this.ordinal()+"]");
    }
    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
    }
}

public class Enum {
    public static void main(String[] args) {
        Dept d = Dept.CSA;
        System.out.println(d.name());
        System.out.println(d);
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("ME"));
        Dept[] List = Dept.values();
        for (Dept x: List) {
            x.display();
        }
        for (Dept x: List) {
            System.out.println(" " + x);
        }
    }
}
