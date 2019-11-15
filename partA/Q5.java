package com.company.partA;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class employee
{
    String  name;
    int salary;

    employee(String n,int sal)
    {
        name=n;
        salary=sal;
    }

    void getData()
    {
        System.out.println("Name : "+name+"   Salary : "+salary);

    }

    String getName()
    {
        return name;
    }

    int getSalary()
    {
        return salary;
    }

}

class name implements Comparator<employee>
{

    @Override
    public int compare(employee o1, employee o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}

class sala implements Comparator<employee>
{
    @Override
    public int compare(employee e1,employee e2)
    {
        if(e1.getSalary()>e2.getSalary())
            return 1;
        else
            return -1;
    }
}


public class Q5
{
    public static void main(String[] args)
    {
        TreeSet<employee> ts = new TreeSet<employee>(new name());
        ts.add(new employee("Chinthan",10));
        ts.add(new employee("Dhvaith",20));
        ts.add(new employee("Avrinda",30));

        for (employee e:ts)
        {
            e.getData();
        }

        TreeSet<employee> ts1 = new TreeSet<employee>(new sala());
        ts1.add(new employee("Chinthan",10));
        ts1.add(new employee("Dhvaith",20));
        ts1.add(new employee("vrinda",5));

        for (employee e:ts1)
        {
            e.getData();
        }
    }
}
