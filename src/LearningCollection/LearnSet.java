package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//duplicate items are not added.
public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(3);
        set.add(4);
        set.add(-1);

        System.out.println(set);

    }
}
/*
   *Hashset
   1.order is not specified.
   2. no duplicate.
   3.generating hashing of the element.
   4.add(value)
   5.remove(value)
   6.contains(value) -> return true or false;
   7.isEmpty() -> return true or false
   8. size() -> return the no. of element present in the set
   9. clear().
   10. O(1).

   *LinkedHashset
    1.prints in order


   *TreeSet
     1.behind the  seen it is implementing binary Search tree as well as property of tree.
     2.O(log(N))



 */
