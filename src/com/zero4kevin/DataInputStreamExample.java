package com.zero4kevin;

import java.io.*;

/**
 * Created by kevin on 4/23/17.
 */
public class DataInputStreamExample {
    public static void main(String[] args) throws Exception{
        InputStream input=new FileInputStream("testout.txt");
        DataInputStream datainput=new DataInputStream(input);
        byte[] byteArray=new byte[input.available()];
        datainput.read(byteArray);
        for(byte item: byteArray){
            System.out.print((char)item);
        }
    }
}
