package stream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("C:\\MyJava\\Access.txt","rw");
        //byte b[]={'A','B','C','D','E','F','G','H','I','J'};
        System.out.println((char) rf.read());// After printing pointer moves to next index
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        rf.write('e');
        rf.seek(4); // got any index[]
        System.out.println((char) rf.read());
        System.out.println(rf.getFilePointer());
        // get the location of pointer
        System.out.println((char) rf.read());
    }
}
