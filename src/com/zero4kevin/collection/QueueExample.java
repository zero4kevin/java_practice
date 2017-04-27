package com.zero4kevin.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/4/27.
 */
public class QueueExample {
    private void PriorityQueueWithString() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
        System.out.println("remove an item from head: " + queue.remove());
        System.out.println("remove an item from head " + queue.poll());
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }

    private void QueueWithBook() {
        Queue<Book> queue = new PriorityQueue<Book>();
        //Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for (Book b : queue) {
            System.out.println(b);
        }
        System.out.println("Getting the head book from the queue " + queue.remove());
        System.out.println("After removing one book record:");
        for (Book b : queue) {
            System.out.println(b);
        }
    }

    public static void main(String args[]) {
        new QueueExample().PriorityQueueWithString();
        new QueueExample().QueueWithBook();
    }


}
