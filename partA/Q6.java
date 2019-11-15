package com.company.partA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q6
{
    
    public static void main(String[] args) throws FileNotFoundException 
    {
        PrintWriter write = new PrintWriter(new File("c.txt"));
        Scanner file1Read = new Scanner(new File("a.txt"));
        Scanner file2Read = new Scanner(new File("b.txt"));
        
        while (file1Read.hasNext())
        {
            String s = file1Read.nextLine();
            write.println(s);
        }

        while (file2Read.hasNext())
        {
            String s = file2Read.nextLine();
            write.println(s);
        }

        write.close();
        file1Read.close();
        file2Read.close();
        
        
    }
    
}
