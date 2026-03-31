package com.gla.arrays;

public class Wrapper4 {
    public static void main(String[] args) {
        Integer obj = 40;

        // Auto-unboxing
        int a = obj;

        System.out.println("Object value: " + obj);
        System.out.println("Auto-unboxed primitive: " + a);
    }
}