package com.gla.Genericsproblem;
import java.util.*;
public class Animal{
    void sound() {
        System.out.println("Animal sound");
    }
    class Dog extends Animal {}
    class Cat extends Animal {}

    class Utils {
        public static void printAnimals(List<? extends Animal> animals) {
            for (Animal a : animals) {
                a.sound();
            }
        }
    }
}
