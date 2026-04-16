package com.gla.Collection;

import java.util.*;
public class Queuecode{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(55);
        q.offer(108);
        q.offer(320);
        System.out.println(q.element());
        q.remove(108);  //nothing add in remove so take 55 remove;
        q.poll();
        System.out.println(q);
    }
}