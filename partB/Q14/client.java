package com.company.partB.Q14;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class client
{
    public static void main(String[] args) throws IOException {

        String serverAddress = "192.168.2.4";
        Socket link = new Socket(serverAddress,8090);

        Scanner input = new Scanner(link.getInputStream());
        PrintWriter output = new PrintWriter(link.getOutputStream(),true);

        Scanner read = new Scanner(System.in);
        String clientmsg=read.next();

        while(!clientmsg.equals("close")) {
            output.println(clientmsg);
            String ans = input.nextLine();
            System.out.println("SERVER RESPONSE : "+ans);
            clientmsg = read.next();

        }


        link.close();

    }
}
