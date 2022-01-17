import java.sql.*;

class Database{
  public static void main(String... arg) throws Exception{

  Class.forName("org.sqlite.JDBC");
  Connection Conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//SQLite//university.db");
  Statement STM = Conn.createStatement();
  ResultSet Result = STM.executeQuery("select * from Student");
  int RollNo;
  String SName;
  String City;
  int DeptNo;
  System.out.println("\n\n---------Student Data fetched from JDBC-----------");
  while(Result.next()){
  RollNo = Result.getInt("RollNo");
  SName = Result.getString("SName");
  City = Result.getString("City");
  DeptNo = Result.getInt("DeptNo");
  System.out.println(RollNo+" "+SName+" "+City+" "+DeptNo);
  }
  Result = STM.executeQuery("select * from Dept");
  String DName;
  System.out.println("\n\n----------Department Data fetched from JDBC-----------");
  while(Result.next()){
  DName = Result.getString("DName");
  DeptNo = Result.getInt("DeptNo");
  System.out.println(DName+" "+DeptNo);
  }
}
}
