package com.zero4kevin.collection;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

/**
 * Created by xi1zhang on 2017/4/27.
 */
public class MapExample {
    private void HashMapExample() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "second");
        map.put(1, "first");
        map.put(3, "third");
        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        map.remove(2);
        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }

    private void LinkedHashMap() {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(103, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(102, "Operating System", "Galvin", "Wiley", 6);
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);
        for (Map.Entry<Integer, Book> entry : map.entrySet())
            System.out.println("key is " + entry.getKey() + ", book is " + entry.getValue());
    }

    private void TreeMap() {
        TreeMap<Integer, Book> map = new TreeMap<Integer, Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(103, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(102, "Operating System", "Galvin", "Wiley", 6);
        map.put(3, b3);
        map.put(2, b2);
        map.put(1, b1);
        for (Map.Entry<Integer, Book> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
    }

    private void HashTable() {
        Map<Integer, Book> map = new Hashtable<Integer,Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(103, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(102, "Operating System", "Galvin", "Wiley", 6);
        map.put(1, b1);
        map.put(3, b3);
        map.put(2, b2);
        for(Map.Entry<Integer,Book> set:map.entrySet())
            System.out.println(set.getKey()+" "+set.getValue());
    }


    public static void main(String[] args) {
        MapExample example = new MapExample();
//        example.HashMapExample();
//        example.LinkedHashMap();
//        example.TreeMap();
        example.HashTable();

    }
}
