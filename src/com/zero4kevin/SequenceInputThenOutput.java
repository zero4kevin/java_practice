package com.zero4kevin;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by kevin on 4/22/17.
 */
public class SequenceInputThenOutput {
    public static void main(String[] args) throws Exception{
        File fout=new File("testout.txt");
        File fin=new File("testin.txt");
        FileInputStream input1=new FileInputStream(fout);
        FileInputStream input2=new FileInputStream(fin);
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("testout2.txt"));
        int i=0;
        try{
            while ((i=inst.read())!=-1){
                System.out.print((char)i);
                bout.write(i);
            }
            Vector<FileInputStream> v=new Vector();
            v.add(new FileInputStream(fout));
            v.add(new FileInputStream(fin));
            v.add(new FileInputStream("testout3.txt"));
            Enumeration<FileInputStream> e=v.elements();
            SequenceInputStream inst2= new SequenceInputStream(e);
            i=0;
            while((i=inst2.read())!=-1)
                System.out.print((char)i);
        }finally {
            input1.close();
            input2.close();
            inst.close();
            bout.close();
        }
    }
}
