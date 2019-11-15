package com.company.partB;

import com.sun.org.apache.regexp.internal.RE;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import java.io.IOException;
import java.util.Scanner;


public class Q11
{
    private static final int RECORD_SIZE = 48;
    private static final int SURNAME_SIZE=15;
    private static final int INI_SIZE = 3;
    private static long accountNumber=0;
    private static String surname,initial;
    private static float balance;

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        String choice="y";

        RandomAccessFile file = new RandomAccessFile("test.bat","rw");

        while(choice.equals("y"))
        {
            accountNumber++;

            System.out.println("Account Number : "+accountNumber);

            System.out.println("Enter the surname : ");
            surname = read.next();
            System.out.println("Enter the initial : ");
            initial = read.next();
            System.out.println("Enter the balance : ");
            balance = read.nextFloat();

            writeRecord(file);

            System.out.println("Enter the choice : ");
            choice = read.next();
        }

        System.out.println();
        showRecords(file);
    }

    public static void writeRecord(RandomAccessFile file) throws IOException {
        long filePos = (accountNumber-1)*RECORD_SIZE;

        file.seek(filePos);
        file.writeLong(accountNumber);
        writeString(file,surname,SURNAME_SIZE);
        writeString(file,initial,INI_SIZE);
        file.writeFloat(balance);

    }

    public static void writeString(RandomAccessFile file,String text,int size) throws IOException {
        int len = text.length();
        if(len<=size)
        {
            file.writeChars(text);
            for(int i=len;i<size;i++)
            {
                file.writeChar(' ');
            }
        }
        else
            file.writeChars(text.substring(0,size));
    }

    public static void showRecords(RandomAccessFile file) throws IOException
    {
        long n = file.length()/RECORD_SIZE;
        file.seek(0);


        for(int i=0;i<n;i++)
        {
            long acNum = file.readLong();
            String surname = readString(file,SURNAME_SIZE);
            String ini = readString(file,INI_SIZE);
            float bal = file.readFloat();

            System.out.println("Account Number : "+acNum);
            System.out.println("Surname : "+surname);
            System.out.println("Initials : "+ini);
            System.out.println("Balance : "+bal);
        }

    }

    public static String readString(RandomAccessFile file , int size) throws IOException {
        String val="";

        for(int i=0;i<size;i++)
            val+=file.readChar();

        return val;
    }

}