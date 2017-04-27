package com.zero4kevin;

import sun.security.x509.IPAddressName;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by xi1zhang on 2017/4/26.
 */
public class DSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket dsocket=new DatagramSocket();
        String str="Welcome here";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dpacket= new DatagramPacket(str.getBytes(),str.length(),ip,9527);
        dsocket.send(dpacket);
        dsocket.close();
    }
}
