package com.zero4kevin;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class MyServer {
    public  static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(9527);
            Socket socket=ss.accept();
            DataInputStream din=new DataInputStream(socket.getInputStream());
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

            String str1="";
            String str2="";
            while(!str1.equals("stop")){
                str1 = din.readUTF();
                System.out.println("Client says: " + str1);
                str2 = buffer.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            socket.close();
            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}
