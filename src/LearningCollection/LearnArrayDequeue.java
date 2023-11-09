package com.company;

import java.util.ArrayDeque;

//doubly ended queue.
public class LearnArrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(13);
        adq.offer(14);

    }
}

/*
 1.offer()
 2.offerFirst(value);
 3.offerLast(value);
 4.peek()
 5.peekFirst()
 6.peekLast()
 7.poll()
 8.pollFirst()
 9.pollLast()

 */
