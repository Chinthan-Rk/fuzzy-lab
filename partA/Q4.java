package com.company.partA;

import java.util.Scanner;

class Employee
{
    String firstName,lastName,location;
    int  id;

    void setDetails(String firstName,String lastName,String location,int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.id = id;
    }

    void getDetails()
    {
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name :"+lastName);
        System.out.println("Location :"+location);
        System.out.println("Id : "+id);
    }
}


class q4
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();

        Scanner read = new Scanner(System.in);

        System.out.println("Enter first name :");
        String f = read.next();

        System.out.println("Enter last name : ");
        String l = read.next();

        System.out.println("Enter id : ");
        int id= read.nextInt();

        System.out.println("Enter location :");
        String location  = read.next();

        emp.setDetails(f,l,location,id);

        System.out.println("Employee details are : \n");
        emp.getDetails();
    }
}
