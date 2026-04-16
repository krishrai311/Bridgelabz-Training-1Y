package com.gla.Genericsproblem;
public class Vehicle {
    void show() {
        System.out.println("Vehicle");
    }
}

class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T v) {
        fleet.add(v);
    }

    public void showFleet() {
        for (T v : fleet) {
            v.show();
        }
    }
}
