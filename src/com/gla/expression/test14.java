package com.gla.expression;
import java.util.*;

public class test14 {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test";

        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.println(k);
            }
        }
    }
}
