package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

//implementing the queue on the bases of priority.
public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq  = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);

        // priority is given to the smallest number; implementing the "minHeap"
        // using the Comparator.reverseOrder() , implementing the "maxHeap".
        pq.poll();
        System.out.println(pq);

    }
}

/*
    1. offer()
    2. poll()
    3. peek() -> return the head().
    4. changing the priority.
 */
