package com.zero4kevin.collection;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by xi1zhang on 2017/4/27.
 */
public class MapExample {
    private void HashMapExample() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        map.remove(2);
        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }

    public static void main(String[] args) {

    }
}
