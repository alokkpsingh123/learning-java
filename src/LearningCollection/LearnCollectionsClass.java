package com.company;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(15);
        System.out.println("min ele"+ Collections.min(list)) ;

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
/*
1.Collections.min(list)
2.Collections.max(list)
3.Collections.frequency(list, value)
4.Collections.sort(list,Comparator.reverseOrder())
 */
