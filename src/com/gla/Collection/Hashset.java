package com.gla.Collection;
import java.util.*;
public class Hashset{
    public static void main(String[] args){
        HashSet<Integer> st = new HashSet<>();
        st.add(45);
        st.add(58);
        st.add(18);
        st.add(18);
        st.add(15);
        st.add(9);
        System.out.println(st);

        System.out.println(st.contains(15));

        System.out.println(st.isEmpty());

        System.out.println(st.size());


        System.out.println("Index");
        for(int val:st){
            System.out.println(val + " ");
        }


    }
}
