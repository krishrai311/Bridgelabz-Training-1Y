package com.gla.Genericsproblem;

public class Genericspair {
    class Pair<T, U> {
        private T first;
        private U second;
    }

    public 10Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

// Test
class Main {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());
    }
}
