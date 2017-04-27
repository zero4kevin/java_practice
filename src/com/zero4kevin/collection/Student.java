package com.zero4kevin.collection;

/**
 * Created by xi1zhang on 2017/4/26.
 */
public class Student {
    int no;
    String name;
    int age;
    Student(int no, String name, int age){
        this.age=age;
        this.name=name;
        this.no=no;
    }

    public String toString(){
        return "Name is "+ name +". Age is " + age +". Number is "+no;
    }
}
