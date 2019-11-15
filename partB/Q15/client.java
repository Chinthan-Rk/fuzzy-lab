package com.company.partB.Q15;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class client
{
    public static void main(String[] args) throws IOException {

        DatagramSocket dg = new DatagramSocket();

        Scanner read = new Scanner(System.in);

        String clientMessage="";

        do
        {

            System.out.println("**CLIENT**");
            System.out.print("Enter your message : ");
            clientMessage = read.next();

            DatagramPacket outPacket = new DatagramPacket(clientMessage.getBytes(),clientMessage.length(),InetAddress.getLocalHost(),7777);
            dg.send(outPacket);

            byte[] buffer = new byte[256];
            DatagramPacket inPacket = new DatagramPacket(buffer,buffer.length);

            dg.receive(inPacket);

            String serverResponse = new String(inPacket.getData(),0,inPacket.getLength());
            System.out.println("**Server**");
            System.out.println(serverResponse);

        }while (!clientMessage.equals("close"));

        dg.close();
    }
}
