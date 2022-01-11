package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenClass {
    public static void main(String[] args) throws IOException {
        String data = "Course=Machine Learning;Platform=Coursera;Instructor=Andrew NG;University=Stanford University";
        //Hard coded String data
        int c = 0;
        StringTokenizer ST = new StringTokenizer(data);
        while(ST.hasMoreTokens()) {
            System.out.println(ST.nextToken("=; "));
            c++;
        }
        System.out.println("Number of Words in data: "+c);
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\MyML.txt");
        byte[] b = new byte[FIS.available()];
        FIS.read(b);
        int count = 0;
        // Taking String data from a text file
        String fileData = new String(b);
        StringTokenizer STF = new StringTokenizer(fileData);
        while(STF.hasMoreTokens()) {
            System.out.println(STF.nextToken("\n"));
            count++;
        }
        System.out.println("Number of Lines in MyML.txt: "+count);
        FileInputStream FIS1= new FileInputStream("C:\\MyJava\\Number.txt");
        byte[] BA = new byte[FIS1.available()];
        FIS1.read(BA);
        // Taking String data from a text file
        ArrayList<Integer> AL = new ArrayList<>();
        String fileData1 = new String(BA);
        StringTokenizer STF1 = new StringTokenizer(fileData1);
        while(STF1.hasMoreTokens()) {
            String N = (STF1.nextToken(","));
            AL.add(Integer.valueOf(N));
        }
        System.out.println(AL);
    }
}
