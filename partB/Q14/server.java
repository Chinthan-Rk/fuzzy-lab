package com.company.partB.Q14;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws IOException {

        ServerSocket sLink = new ServerSocket(8090);
        try {
            while (true) {
                Socket link = sLink.accept();
                try {
                    Scanner in = new Scanner(link.getInputStream());
                    PrintWriter output = new PrintWriter(link.getOutputStream(), true);

                    String message = in.nextLine();


                    while(!message.equals("close"))
                    {
                        output.println("I GOT : "+message);
                        message = in.nextLine();
                    }


                } finally {
                    link.close();
                }

            }
        } finally {
            sLink.close();
        }

    }
}
