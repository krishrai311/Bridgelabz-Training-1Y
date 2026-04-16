package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // 1. Create Map
        Map<String, Double> grades = new HashMap<>();

        // 2. Add students
        grades.put("Amit", 85.5);
        grades.put("Riya", 90.0);
        grades.put("Karan", 72.5);
        grades.put("Neha", 88.0);

        System.out.println("After adding students:");
        System.out.println(grades);

        // 3. Update grade (re-test)
        grades.put("Amit", 92.0);  // overwrite old value

        System.out.println("\nAfter updating Amit's grade:");
        System.out.println(grades);

        // 4. Remove student
        grades.remove("Karan");

        System.out.println("\nAfter removing Karan:");
        System.out.println(grades);

        // 5. Sort and display (alphabetical order)
        System.out.println("\nStudents sorted by name:");

        Map<String, Double> sorted = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
