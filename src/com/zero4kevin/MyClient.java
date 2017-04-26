package com.zero4kevin;

import java.io.*;
import java.net.Socket;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class MyClient {
    public static void main(String[] args){
        try{
            Socket socket=new Socket("localhost", 9527);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            DataInputStream din=new DataInputStream(socket.getInputStream());
            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

            String str="", str2="";
            while(!str.equals("stop")){
                str=buffer.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server says: " + str2);
            }
            dout.close();
            socket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
