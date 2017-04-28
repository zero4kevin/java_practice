package com.zero4kevin.collection;

import java.util.*;

/**
 * Created by xi1zhang on 2017/4/28.
 */
public class EnumCollectionExample {
    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private void EnumSetExample() {
        Set<days> set = EnumSet.of(days.FRIDAY, days.SATURDAY);
        Iterator<days> it = set.iterator();
        printIterator(it);

        set = EnumSet.allOf(days.class);
        it = set.iterator();
        printIterator(it);

        Set<days> set2 = EnumSet.copyOf(set);
        it = set2.iterator();
        printIterator(it);
    }

    private void EnumMapExample() {
        EnumMap<days, String> map = new EnumMap<days, String>(days.class);
        map.put(days.MONDAY, "the first working day");
        map.put(days.FRIDAY, "the last working day");
        map.put(days.TUESDAY, "the second working day");
        for (Map.Entry<days, String> set:map.entrySet())
            System.out.println(set.getKey() + " "+set.getValue());
    }

    private void printIterator(Iterator<days> it) {
        while (it.hasNext())
            System.out.println(it.next());
    }

    public static void main(String[] args){
        EnumCollectionExample enumCollector= new EnumCollectionExample();
//        enumCollector.EnumSetExample();
        enumCollector.EnumMapExample();
    }
}