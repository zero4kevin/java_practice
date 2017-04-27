package com.zero4kevin.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/4/26.
 */
public class TestCollectionExample {
    public static void main(String[] args) {
       ArrayList<String> arrayList=new ArrayList<String>();
       arrayList.add("the first string");
       arrayList.add("kevin");
       arrayList.add("Ravi");

       for(String obj:arrayList)
           System.out.println(obj);

       ArrayList<String> arrayList2=new ArrayList<String>();
       arrayList2.add("the second array list");
       arrayList2.add("Kkkk");

       arrayList.addAll(arrayList2);
       Iterator iterator=arrayList.iterator();
       while(iterator.hasNext())
           System.out.println(iterator.next());

       Student s1=new Student(101,"kevin",19);
       Student s2=new Student(102,"Cissy",19);
       ArrayList<Student> students=new ArrayList<Student>();
       students.add(s1);
       students.add(s2);
       iterator=students.iterator();
       while(iterator.hasNext())
           System.out.println(iterator.next());


    }
}
