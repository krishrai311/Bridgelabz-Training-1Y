package Scenraio;

import java.util.*;

class Order {
    int id;
    String item;

    Order(int id, String item) {
        this.id = id;
        this.item = item;
    }

    public String toString() {
        return id + " " + item;
    }

    // for duplicate removal
    public int hashCode() {
        return id;
    }

    public boolean equals(Object o) {
        Order o1 = (Order) o;
        return this.id == o1.id;
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        List<Order> list = new ArrayList<>();
        list.add(new Order(1, "Phone"));
        list.add(new Order(2, "Laptop"));
        list.add(new Order(1, "Phone")); // duplicate

        // remove duplicates
        Set<Order> set = new HashSet<>(list);

        Queue<Order> queue = new LinkedList<>(set);
        Stack<Order> failed = new Stack<>();

        while (!queue.isEmpty()) {
            Order o = queue.remove();

            if (o.id == 2) { // simulate failure
                failed.push(o);
            } else {
                System.out.println("Processed: " + o);
            }
        }

        // retry failed
        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}
