package com.zero4kevin;

import java.net.*;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class HttpURLConnectionExample {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.baidu.com.com");
            SocketAddress address= new InetSocketAddress("10.144.1.10", 8080);
            Proxy proxy=new Proxy(Proxy.Type.HTTP, address);
            HttpURLConnection http=(HttpURLConnection) url.openConnection(proxy);
            for(int i=1;i<=8;i++){
                System.out.println(http.getHeaderFieldKey(i)+" = "+http.getHeaderField(i));
            }
            http.disconnect();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
