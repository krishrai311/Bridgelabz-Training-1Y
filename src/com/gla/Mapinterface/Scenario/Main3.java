package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] voting = {
                "A", "B", "A", "C", "B",
                "A", "C", "B", "B", "A"
        };

        for (String v : voting) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        System.out.println("Vote Count: " + votes);

        // Find winner
        String winner = null;
        int max = 0;

        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Winner: " + winner);
    }
}
