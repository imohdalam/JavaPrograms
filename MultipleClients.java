package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer extends Thread{
    Socket SK;
    public MultiServer(Socket SK){
        this.SK = SK;
    }
    public void run() {
        try {
            BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader BR = new BufferedReader(new InputStreamReader(SK.getInputStream()));
            PrintStream PS = new PrintStream(SK.getOutputStream());
            String MSG = "";
            int count = 1;
            StringBuilder SB;
            do {
                MSG = BR.readLine();
                SB = new StringBuilder(MSG);
                SB.reverse();
                MSG = SB.toString();
                PS.println(MSG);
            } while (!MSG.equals("tixe"));
            SK.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(2000);
            int count = 1;
            Socket SK;
            do {
                SK = SS.accept();
                MultiServer MS;
                MS = new MultiServer((SK));
                MS.start();
                System.out.println("Client Connected: "+count++);
            }while (true);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}

class Clients {
    public static void main(String[] args) {
        try {
            Socket SK = new Socket("192.168.53.198",2000);
            BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader BR = new BufferedReader(new InputStreamReader(SK.getInputStream()));
            System.out.println("\nConnected to Server");
            PrintStream PS = new PrintStream(SK.getOutputStream());
            String MSG = "";
            do {
                MSG = KB.readLine();
                PS.println(MSG);
                MSG = BR.readLine();
                System.out.println("From Server: "+MSG);
            }while(!MSG.equals("tixe"));
            SK.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
