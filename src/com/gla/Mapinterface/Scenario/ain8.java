package com.gla.Maininterface.Scenario;
import java.util.*;
class ain8 {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        // Add courses
        courses.put("CS101", 45);
        courses.put("CS102", 3);
        courses.put("CS103", 60);
        courses.put("CS104", 2);
        courses.put("CS105", 50);

        // Add student
        courses.put("CS101", courses.get("CS101") + 1);

        // Drop student
        courses.put("CS102", Math.max(0, courses.get("CS102") - 1));

        // Near full and under-subscribed
        System.out.println("Near Full Courses:");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50) {
                System.out.println(e);
            }
        }

        System.out.println("\nUnder-subscribed Courses:");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5) {
                System.out.println(e);
            }
        }
    }
}
