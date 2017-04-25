package com.zero4kevin;

import java.io.Serializable;

/**
 * Created by xi1zhang on 2017/4/25.
 */
public class Student implements Serializable {
    int id;
    String name;
    transient int age;
    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
