package com.gla.arrays;

public class Wrapper3 {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(30);   // Manual Unboxing
        int a = obj.intValue();

        System.out.println("Object value: " + obj);
        System.out.println("Unboxed primitive: " + a);
    }
}