package com.gla.Maininterface.Scenario;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // Add products
        stock.put("Rice", 10);
        stock.put("Milk", 5);
        stock.put("Sugar", 8);

        // Customer buys
        buyProduct(stock, "Milk", 5);

        // New shipment
        restock(stock, "Milk", 10);

        // Query product
        checkStock(stock, "Rice");
        checkStock(stock, "Oil");

        // Print out-of-stock
        System.out.println("\nOut of stock items:");
        for (Map.Entry<String, Integer> e : stock.entrySet()) {
            if (e.getValue() == 0) {
                System.out.println(e.getKey());
            }
        }
    }

    static void buyProduct(Map<String, Integer> stock, String item, int qty) {
        if (stock.containsKey(item)) {
            int newQty = stock.get(item) - qty;
            stock.put(item, Math.max(0, newQty));
        }
    }

    static void restock(Map<String, Integer> stock, String item, int qty) {
        stock.put(item, stock.getOrDefault(item, 0) + qty);
    }

    static void checkStock(Map<String, Integer> stock, String item) {
        if (stock.containsKey(item)) {
            System.out.println(item + " → " + stock.get(item));
        } else {
            System.out.println(item + " not stocked");
        }
    }
}
