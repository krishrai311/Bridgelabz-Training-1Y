package com.gla.expression;
public class test9 {
    public static void main(String[] args) {
        String text = "This is a damn stupid test";

        String result = text.replaceAll("(?i)\\b(damn|stupid)\\b", "****");

        System.out.println(result);
    }
}
