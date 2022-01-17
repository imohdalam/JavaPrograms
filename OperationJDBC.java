package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;

public class OperationJDBC {
    public static void main(String... arg) throws Exception {

        Class.forName("org.sqlite.JDBC");
        Connection Conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//SQLite//university.db");
        PreparedStatement PSTM = Conn.prepareStatement("insert into Student values(?,?,?,?)");
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Dept No.: ");
        int DeptNo = Input.nextInt();
        System.out.println("Enter Roll No.: ");
        int RollNo = Input.nextInt();
        System.out.print("Enter Name: ");
        String SName = Input.next();
        System.out.print("Enter City: ");
        String City = Input.next();
        PSTM.setInt(1,RollNo);
        PSTM.setString(2,SName);
        PSTM.setString(3,City);
        PSTM.setInt(4,DeptNo);
        PSTM.executeUpdate();
        PSTM = Conn.prepareStatement("select * from Student");
        ResultSet Result = PSTM.executeQuery();
        System.out.println("\n\n---------Student Data fetched from JDBC-----------");
        Statement DSTM = Conn.createStatement();
        DSTM.executeUpdate("update Student set DeptNo = '102' where RollNo=12");
        DSTM.executeUpdate("update Student set DeptNo = '103' where RollNo=13");
        DSTM.executeUpdate("update Student set RollNo = '8' where RollNo=15");
//        DSTM.executeUpdate("create table Temp(ID integer,Name text, Amount float)");
//        DSTM.executeUpdate("drop table Temp");
        DSTM.close();
        while (Result.next()) {
            RollNo = Result.getInt(1);
            SName = Result.getString("SName");
            City = Result.getString(3);
            DeptNo = Result.getInt("DeptNo");
            System.out.println(RollNo + " " + SName + " " + City + " " + DeptNo);
        }
        PSTM.close();
        Conn.close();
    }
}
