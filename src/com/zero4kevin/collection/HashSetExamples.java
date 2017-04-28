package com.zero4kevin.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/4/27.
 */
public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        HashSet<Book> books = new HashSet<Book>();
        Book b1 = new Book(1, "Thinking in Java", "Kevin", "BBC", 9);
        Book b2 = new Book(2, "Thinking in C", "Kevin", "BBC", 9);
        books.add(b2);
        books.add(b1);
        for (Book book : books)
            System.out.println(book);
    }
}
