package Scenraio;
import java.util.*;

class Riderequest {
    String name;
    int priority;

    RideRequest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

public class RideSystem {
    public static void main(String[] args) {

        PriorityQueue<RideRequest> pq = new PriorityQueue<>(
                (a, b) -> b.priority - a.priority
        );

        pq.add(new RideRequest("R1", 2));
        pq.add(new RideRequest("R2", 5));

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));

        List<String> completed = new ArrayList<>();

        while (!pq.isEmpty() && !drivers.isEmpty()) {
            RideRequest r = pq.remove();
            Driver d = drivers.iterator().next();
            drivers.remove(d);

            System.out.println("Assigned " + r.name + " to " + d.name);
            completed.add(r.name);
        }
    }
}