package com.zero4kevin.collection;

import java.util.TreeSet;

/**
 * Created by xi1zhang on 2017/4/27.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Book> set = new TreeSet<Book>();
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        set.add(b2);
        set.add(b1);
        set.add(b3);
        for (Book book:set)
            System.out.println(book);
    }
}
