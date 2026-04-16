package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        // Add accounts
        accounts.put("A101", 5000.0);
        accounts.put("A102", 8000.0);
        accounts.put("A103", 2000.0);
        accounts.put("A104", 10000.0);

        // Deposit
        deposit(accounts, "A101", 2000);

        // Withdraw
        withdraw(accounts, "A103", 3000);

        // Sort by balance descending
        List<Map.Entry<String, Double>> list =
                new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\nSorted by Balance:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e);
        }

        // Top 3 customers
        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }

    static void deposit(Map<String, Double> map, String acc, double amt) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amt);
    }

    static void withdraw(Map<String, Double> map, String acc, double amt) {
        if (map.containsKey(acc)) {
            if (map.get(acc) >= amt) {
                map.put(acc, map.get(acc) - amt);
            } else {
                System.out.println("Insufficient balance for " + acc);
            }
        }
    }
}
