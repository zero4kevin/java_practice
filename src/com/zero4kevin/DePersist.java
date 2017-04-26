package com.zero4kevin;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class DePersist {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("testout.txt"));
        Student s =(Student)in.readObject();
        System.out.println(s.id + " " + s.name + " "+ s.age);
        in.close();
    }
}
