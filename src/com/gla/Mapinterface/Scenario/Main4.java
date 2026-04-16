package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        // Add books
        books.put("101", "Java Basics");
        books.put("102", "Data Structures");
        books.put("103", "Algorithms");

        // Search by ISBN
        String isbn = "102";
        if (books.containsKey(isbn)) {
            System.out.println("Book: " + books.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        // Remove book
        books.remove("103");

        // Sorted display
        System.out.println("\nSorted Books:");
        Map<String, String> sorted = new TreeMap<>(books);
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Search by title
        String titleSearch = "Java Basics";
        for (Map.Entry<String, String> e : books.entrySet()) {
            if (e.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("Found ISBN: " + e.getKey());
            }
        }
    }
}
