package com.company.partB.Q15;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class server
{
    public static void main(String[] args) throws IOException {
        DatagramSocket dg = new DatagramSocket(7777);
        String clientMessage;
        do
        {
            byte[] buffer = new byte[256];
            DatagramPacket inPacket = new DatagramPacket(buffer,buffer.length);
            dg.receive(inPacket);
            clientMessage = new String (inPacket.getData(),0,inPacket.getLength());

            String response = "I GOT : "+clientMessage;

            DatagramPacket outPacket = new DatagramPacket(response.getBytes(),response.length(),inPacket.getAddress(),inPacket.getPort());
            dg.send(outPacket);

        }while(!clientMessage.equals("close"));

        dg.close();

    }
}
