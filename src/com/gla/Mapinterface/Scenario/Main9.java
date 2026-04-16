package com.gla.Maininterface.Scenario;
import java.util.*;

class Main9 {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home"
        };

        // Count visits
        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        // Sort by descending visits
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(visits.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Page Visit Report:");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Most visited page
        System.out.println("\nMost Visited: " + list.get(0).getKey());
    }
}
