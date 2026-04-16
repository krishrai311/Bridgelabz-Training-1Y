package com.gla.Maininterface.Scenario;
import java.util.*;
class Main {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();

        // Initialize students
        String[] students = {"A", "B", "C", "D", "E"};
        for (String s : students) {
            attendance.put(s, 0);
        }

        // Simulate 15 days
        String[][] days = {
                {"A","B"}, {"A","C"}, {"B","C","D"},
                {"A","D"}, {"A","B","E"}, {"C","D"},
                {"A","B"}, {"E"}, {"A","C"},
                {"B","C"}, {"A","D"}, {"A","B"},
                {"C","D"}, {"A","E"}, {"B","C"}
        };

        for (String[] day : days) {
            for (String s : day) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        // Students < 10 days
        System.out.println("Low attendance:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }
}
