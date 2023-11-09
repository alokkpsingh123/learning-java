package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",1);
        numbers.put("three",1);

        System.out.println(numbers);

        for (Map.Entry<String,Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()){

        }

        for(Integer n : numbers.values()){

        }

        numbers.containsValue(3); //--> return true or false
        numbers.isEmpty();
        numbers.clear();
        System.out.println(numbers.size());


    }
}
/*
 1.put(key,value)
 2.key are always unique.
 3.while adding the same value twice it overrides the old value by new one.
 4.for this situation not to occur tru
    if(!numbers.containKey("two"){
      numbers.put("two", 23);
      }
 5.putIfAbsent("two",23);
 6.iterate:
     --->  for (Map.Entry<String,I  nteger> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    --->    for(String key: numbers.keySet()){

        }

     --->   for(Integer n : numbers.values()){

        }
 7.remove(key);
 */
