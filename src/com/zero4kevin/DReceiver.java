package com.zero4kevin;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * Created by xi1zhang on 2017/4/26.
 */
public class DReceiver {
    public static void main(String[] args) throws Exception{
        DatagramSocket dsocket=new DatagramSocket();
        dsocket.bind(new InetSocketAddress(9527));
        DatagramPacket dpacket=new DatagramPacket(new byte[1024],1024);
        dsocket.receive(dpacket);
        String str= new String(dpacket.getData(),0,dpacket.getLength());
        System.out.println(str);
        dsocket.close();
    }
}
