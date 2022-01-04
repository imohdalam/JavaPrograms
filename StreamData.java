package stream;

import java.io.*;

class Student{
    int Roll;
    String Name;
    String Branch;
}

public class StreamData {
    public static void main(String[] args) throws IOException{
        FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\Student.txt");
        DataOutputStream DOS = new DataOutputStream(FOS);
        Student s1 = new Student();
        s1.Branch = "CSA";
        s1.Name = "IMOHDALAM";
        s1.Roll = 5;
        DOS.writeInt(s1.Roll);
        DOS.writeUTF(s1.Name);
        DOS.writeUTF(s1.Branch);
        DOS.close();
        FOS.close();
        System.out.println("Written Successfully in Student.txt File");
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\Student.txt");
        DataInputStream DIS = new DataInputStream(FIS);
        Student s2 = new Student();
        s2.Roll = DIS.readInt();
        s2.Name = DIS.readUTF();
        s2.Branch = DIS.readUTF();
        System.out.println("Roll No.: "+ s2.Roll);
        System.out.println("Name: "+ s2.Name);
        System.out.println("Branch: "+ s2.Branch);
        System.out.println("Read Successfully from Student.txt File");
        FIS.close();
        DIS.close();
    }
}
