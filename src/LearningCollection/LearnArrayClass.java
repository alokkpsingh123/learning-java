package com.company;

import java.util.Arrays;

//works on primitive Array.
public class LearnArrayClass {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7};
        int i = Arrays.binarySearch(num,4);
        System.out.println(i);



    }
}
/*
 1.Arrays.binarySearch(array,key) -> O(log(n))
 2.Arrays.sort(array) -> quick sort
 3.Arrays.parallelSort(array)
 4.Arrays.fill(array,value);
 */
