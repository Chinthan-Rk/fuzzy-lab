package com.company.partA;

import java.util.*;

class student {
    String name, usn;

    public void read() {
        Scanner read = new Scanner(System.in);
        System.out.println("Name : ");
        name = read.nextLine();
        System.out.println("USN : ");
        usn = read.nextLine();
    }

    public void display() {
        System.out.println("Studentname" + name);
        System.out.println("Studentrollno" + usn);
    }
}

public class Q2 {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        n = read.nextInt();
        student obj[] = new student[5];
        try {
            for (int i = 0; i < n; i++) {
                obj[i] = new student();
                obj[i].read();
                obj[i].display();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:\n" + e);
        }
        read.close();
    }
}
