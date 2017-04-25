package com.zero4kevin;

import java.io.*;

/**
 * Created by kevin on 4/22/17.
 */
public class InputStreamExample {
    public static void main(String[] args) throws Exception{
        File fout=new File("testout.txt");
        File fin=new File("testin.txt");
        FileInputStream input1=new FileInputStream(fout);
        FileInputStream input2=new FileInputStream(fin);
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        int i=0;
        try{
            while((i=inst.read())!=-1)
                System.out.print((char)i);
        }finally {
            input1.close();
            input2.close();
            inst.close();
        }
    }
}
