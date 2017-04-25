package com.zero4kevin;
import java.io.*;
/**
 * Created by kevin on 4/22/17.
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        File file=new File("testout.txt");
        FileInputStream fin=new FileInputStream(file);
        BufferedInputStream bin=new BufferedInputStream(fin);
        int i=0;
        try{
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
        }finally {
            bin.close();
            fin.close();
        }
    }
}
