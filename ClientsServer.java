package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(2000);
            Socket SK = SS.accept();
            BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader BR = new BufferedReader(new InputStreamReader(SK.getInputStream()));
            System.out.println("\nConnected to Client");
            System.out.println("Waiting for Message");
            PrintStream PS = new PrintStream(SK.getOutputStream());
            String MSG = "";
            StringBuilder SB;
            while (!MSG.equals("exit")){
                MSG = BR.readLine();
                System.out.println("From Client: "+MSG);
             //   SB = new StringBuilder(MSG);
              //  SB.reverse();
              //  MSG = SB.toString();
                if(MSG.equals("exit"))
                    System.exit(0);
                System.out.print("Reply to Client: ");
                MSG = KB.readLine();
                PS.println(MSG);
            }
            SK.close();
            SS.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


class Client {
    public static void main(String[] args) {
        try {
             Socket SK = new Socket("192.168.53.198",2000);
             BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader BR = new BufferedReader(new InputStreamReader(SK.getInputStream()));
            System.out.println("\nConnected to Server");
            PrintStream PS = new PrintStream(SK.getOutputStream());
            String MSG = "";
            while(!MSG.equals("exit")){
                System.out.print("Send Message to Server: ");
                MSG = KB.readLine();
                PS.println(MSG);
                 if(MSG.equals("exit"))
                     System.exit(0);
                MSG = BR.readLine();
                System.out.println("From Server: "+MSG);
            }
            SK.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
