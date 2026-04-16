package com.gla.Genericsproblem;

class Fruits {
    void show() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        fruit.show();
    }
}

// Test
class Main {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();

        // FruitBox<Car> ❌ ERROR (Car is not a Fruit)
    }
}
