package com.gla.Genericsproblem;
import java.util.*;
public class Items {
    abstract class WarehouseItem {}

    class Electronics extends WarehouseItem {}
    class Groceries extends WarehouseItem {}
    class Furniture extends WarehouseItem {}

    class Storage<T extends WarehouseItem> {
        private List<T> items = new ArrayList<>();

        public void add(T item) {
            items.add(item);
        }

        public List<T> getItems() {
            return items;
        }
    }

    class Utils {
        public static void display(List<? extends WarehouseItem> list) {
            for (WarehouseItem item : list) {
                System.out.println(item);
            }
        }
    }
}
