package com.zero4kevin;
import java.io.*;
/**
 * Created by kevin on 4/23/17.
 */
public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws Exception {
        byte[] buf={35,36,37,38};
        ByteArrayInputStream byin=new ByteArrayInputStream(buf);
        int i=0;
        while((i=byin.read())!=-1)
            System.out.println("ASCII value of Char "+ i + " Special character is "+ (char)i);
    }
}
