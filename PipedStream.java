package stream;

import java.io.*;
import java.io.InputStream;

class Producer extends Thread{
    OutputStream OS;
    Producer(OutputStream O){
        OS = O;
    }
    @Override
    public void run(){
        int count = 0;
        while(true){
            try{
                OS.write(count);
                OS.flush();
                System.out.println("Produces: "+(count++));
                System.out.flush();
                Thread.sleep(10);
            }
           catch(IOException | InterruptedException e){
             System.out.println(e);
           }

        }
    }
}

class Consumer extends Thread{
    InputStream IS;
    Consumer(InputStream O){
        IS = O;
    }
    @Override
    public void run(){
        int x;
        while(true){
            try{
                x = IS.read();
                System.out.println("Consumes: "+(x));
                System.out.flush();
                Thread.sleep(10);
            } catch(IOException | InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class PipedStream {
    public static void main(String[] args) {
        PipedInputStream PIS = new PipedInputStream();
        PipedOutputStream POS = new PipedOutputStream();
        try {
            PIS.connect(POS);
        }catch (IOException exception){System.out.println(exception);}
        Producer P = new Producer(POS);
        Consumer C = new Consumer(PIS);
        P.start();
        C.start();
    }
}
