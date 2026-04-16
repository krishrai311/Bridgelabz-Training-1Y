package com.gla.Maininterface.Scenario;
import java.util.*;

class Main7 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("UK", "London");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("China", "Beijing");
        map.put("Italy", "Rome");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country: ");
        String country = sc.nextLine();

        if (map.containsKey(country)) {
            System.out.println("Capital: " + map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("\nAll countries:");
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
