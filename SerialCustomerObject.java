package stream;

import java.io.*;
import java.util.Scanner;

class Customer implements Serializable{
    String ID;
    String Name;
    String Phone;
    static int count = 1;
    Customer(){}
    Customer(String Name, String Phone){
        ID = "C"+count;
        count++;
        this.Name = Name;
        this.Phone = Phone;
    }
    @Override
    public String toString(){
        return "\n------Customer Details------\n"+
                "\nID: "+ID+
                "\nName: "+Name+
                "\nPhone: "+Phone;
    }
}
public class SerialCustomerData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Customer c1 = new Customer("Alan","1234567890");
        Customer c2 = new Customer("Alam","9874563210");
        Customer c3 = new Customer("Karen","1597348620");
        Customer[] list = {c1, c2, c3};
        FileOutputStream FOS = new FileOutputStream("C:\\MyJava\\Customer.txt");
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        OOS.writeInt(list.length);
        for(Customer x: list){
            OOS.writeObject(x);
        }
        OOS.close();
        FOS.close();
        System.out.println("Objects are written in Customer file Successfully");
        FileInputStream FIS = new FileInputStream("C:\\MyJava\\Customer.txt");
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        int length = OIS.readInt();
        Customer[] lst = new Customer[length]; // making a list of all customers
        for(int i=0; i<length; i++){
            lst[i] = (Customer) OIS.readObject();
        }
        System.out.print("Enter Customer Name: ");
        String Name = input.nextLine();
        for(int i=0; i<length; i++){
           if(Name.equalsIgnoreCase(lst[i].Name)) {
               System.out.println(lst[i]);
               System.out.println("\nCustomer data retrieve from file Successfully");
               System.exit(0);
           }
        }
        System.out.println("\nCustomer NOT FOUND");
    }
}
