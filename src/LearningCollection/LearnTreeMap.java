package com.company;

import java.util.Map;
import java.util.TreeMap;

//behind the scene is implement the binary search , so it does sorting.
public class LearnTreeMap {
    public static void main(String[] args) {

        Map<String,Integer> n = new TreeMap<>();

        n.put("one",1);
        n.put("One",2);
        n.put("three",3);
        n.put("four",4);
        System.out.println(n);
    }
}
/*
 1.it is sort on the bases of keys.
 2.remove(key)
 */
