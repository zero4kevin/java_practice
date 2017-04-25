package com.zero4kevin;

import java.net.URL;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class URLExample {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.baidu.com:7788");
            System.out.println("Protocol: "+ url.getProtocol());
            System.out.println("Host Name: "+ url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name :" + url.getFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
