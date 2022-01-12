package accounts;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.Serializable;

class Data implements Serializable {

    String UserID;
    String Name;
    int Credit;

    Data(){}

    Data(String UserID, String Name, int Credit){
        this.UserID = UserID;
        this.Name = Name;
        this.Credit = Credit;
    }

    @Override
    public String toString() {
        return "Data{" +
                " UserID='" + UserID + '\'' +
                ", Name='" + Name + '\'' +
                ", Credit=" + Credit +
                '}';
    }
}

public class Main {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Data data = null;
        HashMap<String, Data> HM = new HashMap<>();
        try {
            FileInputStream FIS = new FileInputStream("C:\\MyJava\\UserDetails.txt");
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            int count = OIS.readInt();
            for(int i=0; i<count; i++){
                data = (Data) OIS.readObject();
                System.out.println(data);
                HM.put(data.UserID, data);
            }
            OIS.close();
            FIS.close();
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        try {
            FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\UserDetails.txt");
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);

            System.out.println("Menu Options: ");
            int choice;
            String UserID;
            String Name;
            int Credit;
            do {
                System.out.println("1. Create Account");
                System.out.println("2. Delete Account");
                System.out.println("3. View Account");
                System.out.println("4. View All Account");
                System.out.println("5. Save Account");
                System.out.println("6. Exit");
                System.out.println("Enter Choice: ");
                choice = Input.nextInt();
                Input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                // ignore new line
                switch (choice) {
                    case 1:
                        System.out.print("Enter UserID: ");
                        UserID = Input.nextLine();
                        System.out.print("Enter Name: ");
                        Name = Input.nextLine();
                        System.out.print("Enter Credit: ");
                        Credit = Input.nextInt();
                        data = new Data(UserID, Name, Credit);
                        HM.put(data.UserID, data);
                        System.out.println("Account Created for " + Name);
                        break;
                    case 2:
                        System.out.print("Enter UserID: ");
                        UserID = Input.nextLine();
                        if(HM.remove(UserID)==null){
                            System.out.println("No Account Available");break;}
                        HM.remove(UserID);
                        System.out.println("Account Delete for " + UserID);
                        break;
                    case 3:
                        System.out.print("Enter UserID: ");
                        UserID = Input.nextLine();
                        if(HM.get(UserID)==null){
                            System.out.println("No Account Available");break;}
                        System.out.println(HM.get(UserID));
                        break;
                    case 4:
                        if(HM.size()==0){
                            System.out.println("No Account Available");break;}
                        for (Data x : HM.values())
                            System.out.println(x);
                        break;
                    case 5:
                        OOS.writeInt(HM.size());
                        for (Data x : HM.values())
                            OOS.writeObject(x);
                        System.out.println("Account Detail Stored Successfully");
                        break;
                    case 6:
                        OOS.writeInt(HM.size());
                        for (Data x : HM.values())
                            OOS.writeObject(x);
                        System.out.println("Alright! Bye");
                        System.exit(0);
                }
            } while (choice != 6);
            OOS.flush();
            OOS.close();
            FOS.close();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
