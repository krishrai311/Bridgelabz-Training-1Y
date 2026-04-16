package com.gla.Collection;
import java.util.*;
public class Prioritymax {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.offer(55);
        q.offer(53);
        q.offer(320);
        System.out.println(q);

        q.poll();   // removes smallest element

        System.out.println(q.element());
    }
}
