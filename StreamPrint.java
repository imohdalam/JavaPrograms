package stream;

import java.io.*;

class Student{
    int Roll;
    String Name;
    String Branch;
}

public class StreamPrint {
    public static void main(String[] args) throws IOException {
        FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\Student.txt");
        PrintStream PS = new PrintStream(FOS);
        Student s1 = new Student();
        s1.Branch = "CSA";
        s1.Name = "Alam";
        s1.Roll = 5;
        PS.println(s1.Roll);
        PS.println(s1.Name);
        PS.println(s1.Branch);
        PS.close();
        FOS.close();
        System.out.println("Written Successfully in Student.txt File");
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\Student.txt");
        BufferedReader BR = new BufferedReader(new InputStreamReader(FIS));
        Student s2 = new Student();
        s2.Roll = Integer.parseInt(BR.readLine());
        s2.Name = BR.readLine();
        s2.Branch = BR.readLine();
        System.out.println("Roll No.: "+ s2.Roll);
        System.out.println("Name: "+ s2.Name);
        System.out.println("Branch: "+ s2.Branch);
        System.out.println("Read Successfully from Student.txt File");
        FIS.close();
        BR.close();
    }
}
