package com.company;

import java.util.LinkedList;
import java.util.Queue;

//first in first out , can be implemented by array and linkedlist
public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        System.out.println(queue);
    }
}

/*
 1.offer() -> adding element to the queue,if task is successful, offer() return true else false;
 2.add() -> same as offer by on failure it throws the exception.
 3.poll() -> removing the element
 4.remove() -> same as poll but throws exception.
 5.peek() -> which element is to be removed next. returns null.
 6.element() -> same as peek, but when queue is empty throws exception.
 */
