package com.zero4kevin;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class PersistExample {
    public  static void main(String[] args) throws Exception{
        Student s1= new Student(211,"ravi",22);
        FileOutputStream fout=new FileOutputStream("testout.txt");
        ObjectOutputStream Oout=new ObjectOutputStream(fout);
        Oout.writeObject(s1);
        Oout.flush();
        Oout.close();
    }
}
