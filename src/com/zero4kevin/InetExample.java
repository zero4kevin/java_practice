package com.zero4kevin;

import java.net.InetAddress;

/**
 * Created by xi1zhang on 2017/4/26.
 */
public class InetExample {
    public static void main(String[] args){
        try{
            InetAddress inetAddress=InetAddress.getByName("www.baidu.com");
            System.out.println("Hostname is "+ inetAddress.getHostName());
            System.out.println("IP Address is "+ inetAddress.getHostAddress());
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
