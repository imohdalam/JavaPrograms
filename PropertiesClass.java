package Framework;

import java.io.*;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties P = new Properties();
        P.setProperty("562", "Regression");
        P.setProperty("230", "Classification");
        P.setProperty("795", "CocktailParty");
        System.out.println(P);

       // FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\ML.txt");
      //  P.store(FOS, "Algo of ML in text");

      /*  FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\ML.xml");
        P.storeToXML(FOS, "Algo of ML in XML"); */

       // P.forEach((k,v)-> System.out.println(k+" -> "+v));

        FileInputStream FIS = new FileInputStream("C:\\MyJava\\ML.xml");
        P.loadFromXML(FIS);
        P.forEach((k,v)-> System.out.println(k+" -> "+v));
        System.out.println(P.getProperty("720"));
        P.load(new FileInputStream("C:\\MyJava\\MyML.txt"));
        System.out.println(P.getProperty("Platform"));
    }
}
