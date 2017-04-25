package com.zero4kevin;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;

/**
 * Created by kevin on 4/23/17.
 */
class FilterOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout= new FileOutputStream("testout.txt");
        FilterOutputStream filterOut= new FilterOutputStream(fout);
        String s="Process finished with exit code 0 \n";
        byte[] b=s.getBytes();
        filterOut.write(b);
        filterOut.flush();
        filterOut.close();
        fout.close();
    }
}
