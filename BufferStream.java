package stream;

import java.io.*;

public class BufferStream {
    public static void main(String[] args) throws IOException {

      /*  FileInputStream file = new FileInputStream("C:\\MyJava\\Data.txt");
        BufferedInputStream bis = new BufferedInputStream(file); */

        FileReader file = new FileReader("C:\\MyJava\\Data.txt");
        BufferedReader bis = new BufferedReader(file);

        System.out.println("File MarkSupported: "+file.markSupported());
        System.out.println("Buffer MarkSupported: "+bis.markSupported());
        int x = 0;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println(bis.readLine()); // Already printed so null left
        file.close();
        FileInputStream file1 = new FileInputStream("C:\\MyJava\\Data.txt");
        BufferedInputStream bis1 = new BufferedInputStream(file1);
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        bis1.mark(5);
        // putting mark at index[5];
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        bis1.reset();
        // will go back to marked index[5];
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        file.close();
    }
}
