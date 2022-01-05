package stream;

import java.io.*;

class MyStudent implements Serializable{
      private int Roll;
      private String Name;
      private String Branch;
      public static int data = 100;
      public transient int t = 200;
      MyStudent(){}
      MyStudent(int Roll, String Name, String Branch){
          this.Roll = Roll;
          this.Name = Name;
          this.Branch = Branch;
          data = 800;
          t = 300;
      }
      @Override
      public String toString(){
          return "\nStudent Details\n"+
                  "\nRoll No.: "+Roll+
                  "\nName: "+Name+
                  "\nBranch: "+Branch+
                  "\nData: "+data+
                  "\nTransient: "+t;
      }
}

public class Serialisable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\Data.txt");
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        MyStudent s = new MyStudent(5,"Alam","CSE");
        System.out.println("------Serializing--------");
        System.out.println(s);
        OOS.writeObject(s);
        OOS.close();
        FOS.close();
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\Data.txt");
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        MyStudent s1;
        s1 = (MyStudent) OIS.readObject(); // DeSerializing
        System.out.println("------DeSerializing---------");
        System.out.println(s1);
        OIS.close();
        FIS.close();
    }
}
