package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = new FileInputStream("C:\\MyJava\\Data.txt");
        FileOutputStream fileOutput = new FileOutputStream("C:\\MyJava\\Text.txt");
        int ch = 0;
        while((ch=fileInput.read())!=-1) {
            if (ch >= 91 && ch <= 123)
                fileOutput.write(ch - 32);
            else
                fileOutput.write(ch);
        }
        fileInput.close();
        fileOutput.close();
        FileInputStream file1 = new FileInputStream("C:\\MyJava\\Data.txt");
        FileInputStream file2 = new FileInputStream("C:\\MyJava\\Text.txt");
        FileOutputStream both = new FileOutputStream("C:\\MyJava\\Both.txt");
        
        // By using SequenceInputStream, need single loop
        ch = 0;
        SequenceInputStream write = new SequenceInputStream(file1, file2);
        while((ch=write.read())!=-1){
            both.write(ch);
        }
        
        // By using two loop
        ch = 0;
      /*  while((ch= file1.read())!=-1) {both.write(ch);}
        both.write(10); // for the next line
        file1.close();
        ch = 0;
        while((ch= file2.read())!=-1) {
            both.write(ch);
        }
        file2.close(); */
    }
}
