package com.gla.Collection;
import java.util.*;
public class Prioritymin {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(55);
        q.offer(53);
        q.offer(320);
        System.out.println(q);

        q.poll();   // removes smallest element

        System.out.println(q.element());
    }
}