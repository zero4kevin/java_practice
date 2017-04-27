package com.zero4kevin.collection;
import java.util.Deque;
import java.util.ArrayDeque;
/**
 * Created by xi1zhang on 2017/4/27.
 */
public class DequeExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        if (deque.offerFirst("jai")){
            System.out.println("Insert jail successfully");
        }else{
            System.out.println("Insert failed");
        }
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
        System.out.println("Poll the first "+deque.pollFirst()+"\nAfter polling the first:");
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
