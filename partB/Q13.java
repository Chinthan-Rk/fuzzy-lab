package com.company.partB;



import java.util.Scanner;
import java.sql.*;

class stud
{

    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;

    stud() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/stud?useSSL=false","root","");
        stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String query = "select * from student";
        rs = stm.executeQuery(query);

    }



    void insert() throws SQLException
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter usn : ");
        int usn = read.nextInt();
        System.out.print("Enter name : ");
        String name = read.next();



        rs.moveToInsertRow();
        rs.updateInt(1,usn);
        rs.updateString(2, name);
        rs.insertRow();


    }

    void update() throws SQLException
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter usn : ");
        int usn = read.nextInt();
        System.out.print("Enter name : ");
        String name = read.next();


        rs.absolute(1);

        while(rs.next())
        {
            if(rs.getInt(1)==usn)
            {
                rs.updateString(2, name);
                rs.updateRow();
                break;
            }
        }


    }

    void display() throws SQLException
    {
        Scanner read = new Scanner(System.in);
        rs.absolute(0);



        while(rs.next())
        {
            System.out.println("USN : "+rs.getInt(1)+"\t\tNAME : "+rs.getString(2));
        }


    }

    void close() throws SQLException
    {
        con.close();
        stm.close();
        rs.close();
    }
}

public class Q13 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        boolean flag = true;
        Scanner read = new Scanner(System.in);

        stud obj = new stud();

        while(flag)
        {

            System.out.println("1.Insert\n2.Update.\n3.Display\n4.Exit");
            int choice = read.nextInt();

            switch (choice)
            {
                case 1 : obj.insert();
                    break;

                case 2 : obj.update();
                    break;

                case 3 : obj.display();
                    break;

                default : flag =false;

            }

        }
        obj.close();

    }

}
