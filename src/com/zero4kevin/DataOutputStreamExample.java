package com.zero4kevin;
import java.io.*;
/**
 * Created by kevin on 4/23/17.
 */
public class DataOutputStreamExample{
    public static void main(String[] args) throws IOException{
        FileOutputStream file= new FileOutputStream("testout.txt");
        DataOutputStream data= new DataOutputStream(file);
        data.write(66);
        data.writeLong(65);
        data.flush();
        data.close();
    }
}
