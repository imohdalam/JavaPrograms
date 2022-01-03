package stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args) {
        try{
            // Using file FileInputStream Class
            FileInputStream file = new FileInputStream("C:\\MyJava\\Data.txt");

            // By reading a character at a time
            int x = 0;
            while((x=file.read())!=-1){
                System.out.print((char)x);
            }
            System.out.println();
            file.close();
            FileInputStream fileOpen = new FileInputStream("C:\\MyJava\\Data.txt");
            //By converting bytes into String
            byte b[] = new byte[fileOpen.available()];
            fileOpen.read(b);
            String s = new String(b);
            System.out.println(s);

            // Using file FileReader  Class
            FileReader fileRead = new FileReader("C:\\MyJava\\Data.txt");
            int y = 0;
            while((y= fileRead.read())!=-1){
                System.out.print((char)y);
            }
        }
        catch(IOException exception)
        {
            System.out.println(exception);
        }
    }
}
