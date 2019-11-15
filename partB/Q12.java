package com.company.partB;


import java.sql.*;
import java.util.Scanner;

class Bank
{
    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;

    Bank() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useSSL=false","root","");
        stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }


  public void insert() throws SQLException {
      Scanner read = new Scanner(System.in);

      System.out.println("Enter account number : ");
      int accNumber = read.nextInt();

      System.out.println("Enter name : ");
      String name = read.next();

      System.out.println("Enter balance : ");
      int bal = read.nextInt();

      String query = "insert into account value ("+accNumber+","+name+","+bal+");";
      stm.executeUpdate(query);

  }

  public void delete() throws SQLException
  {
      Scanner read = new Scanner(System.in);

      System.out.println("Enter the account number : ");
      int accNumber = read.nextInt();

      String query = "delete from account where num="+accNumber;
      stm.executeUpdate(query);


  }
  public void display() throws SQLException
  {
      Scanner read = new Scanner(System.in);

      String query = "select * from account";
      rs = stm.executeQuery(query);
      while (rs.next())
      {
          System.out.println("Account Number : "+rs.getInt(1));
          System.out.println("Name : "+rs.getString(2));
          System.out.println("Balance : "+rs.getInt(3));
      }
  }

  public void close() throws SQLException {
      con.close();
      stm.close();
      rs.close();
  }

}

public class Q12
{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        boolean flag = true;
        Scanner read = new Scanner(System.in);

        Bank obj = new Bank();

        while(flag)
        {

            System.out.println("1.Insert\n2.Delete.\n3.Display\n4.Exit");
            int choice = read.nextInt();

            switch (choice)
            {
                case 1 : obj.insert();
                break;

                case 2 : obj.delete();
                break;

                case 3 : obj.display();
                break;

                default : flag =false;

            }

        }
        obj.close();
    }

}
