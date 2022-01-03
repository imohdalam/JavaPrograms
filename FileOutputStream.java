package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("C:\\MyJava\\Data.txt");
            String s = "Creating and writing into the text file.";
            byte b[] = s.getBytes();
            try {
                 file.write(s.getBytes());
                // All bytes written at a time

           /*     for (byte x:b)
                    file.write(x);  */
                // One byte at a time by using loop

            /*    file.write(b, 5, s.length()-5);  */
                // writing some part of byte array

                file.close();
            }
            catch (IOException exception){
                System.err.println(exception);
            }
        }
        catch (FileNotFoundException exception){
            System.err.println(exception);
        }
    }
}
