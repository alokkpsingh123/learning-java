package com.company;
import java.util.*;

//Dynamically changes the size of the array.
public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(10);

        list.remove(Integer.valueOf(30));
        // if size is n, then when we want to increase the size is n+n/2+1.

        System.out.println(list);
        Collections.sort(list);

        list.size();

    }
}

/* 1.add()
   2.addAll()
   3.get(index)
   4.remove(index)
   5.remove(Integer.valueOf(30))  -> remove the element of type int having value 30 ,
      removes only the first occurrence of the element;
   6.clear();
   7.Time Complexity in adding and removing in O(n).
   8.set(index, value); O(1).
   9. contains(value) -> return true or false; O(n).
   10. iteration the array element;
       ->  for(int i =0; i<list.size();i++){}
       ->  for(Integer ele:list){}
       -> Iterator<Integer> it = list.iterator();
          - while(it.hasNext()){
             sout("iterator" + it.next());
            }
 */

