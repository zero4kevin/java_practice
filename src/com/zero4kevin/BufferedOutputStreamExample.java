package com.zero4kevin;
import java.io.*;
/**
 * Created by kevin on 4/22/17.
 */
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception{
        File file=new File("testout.txt");
        FileOutputStream fout= new FileOutputStream(file);
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        String s = "Seeking assessment for your engineering qualification " +
                "and competencies for migration purposes? " +
                "Start a Migration Skills Assessment application today!";
        byte[] b=s.getBytes();
        try{
            bout.write(b);
        } catch (IOException e){
            System.err.println("Writing file \"" + file +"\" failed.\n"+ e.getMessage());
        } finally {
            bout.flush();
            bout.close();
            fout.close();
        }
        System.out.println("success");
    }
}
