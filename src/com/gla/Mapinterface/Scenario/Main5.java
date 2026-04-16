package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful";

        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}
