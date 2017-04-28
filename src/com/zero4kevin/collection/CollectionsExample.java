package com.zero4kevin.collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by xi1zhang on 2017/4/28.
 */
public class CollectionsExample {
    public static void main(String[] args){
        List<String> list= new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("J2EE");
        System.out.println("Initial collection value: "+ list);
        String[] strArr={".Net","C#"};
        Collections.addAll(list,"JSP","Servlet");
        Collections.addAll(list,strArr);
        System.out.println("After add all, the collection value is "+ list);
    }
}
