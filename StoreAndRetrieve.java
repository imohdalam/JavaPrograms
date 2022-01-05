package stream;

import java.io.*;

public class StoreAndRetrieve {
    public static void main(String[] args) throws IOException{
        FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\Store.txt");
        DataOutputStream DOS = new DataOutputStream(FOS);
        float[] list = {1.2f,1.5f,6.2f,5.8f,6.5f};
        DOS.writeInt(list.length); // length of list stored to file
        for(float x: list){
            DOS.writeFloat(x);
        }
        DOS.close();
        FOS.close();
        System.out.println("Data Store Successfully");
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\Store.txt");
        DataInputStream DIS = new DataInputStream(FIS);
        float f;
        int length = DIS.readInt(); // length of list read from file
        for(int i=0; i<length; i++){
            f = DIS.readFloat();
            System.out.print(f+" ");
        }
        DIS.close();
        FIS.close();
        System.out.println("\nData Printed on Console Successfully");
    }
}
