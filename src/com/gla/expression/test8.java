package com.gla.expression;
public class test8 {
    public static void main(String[] args) {
        String text = "This   is   a   test";
        String result = text.replaceAll("\\s+", " ").trim();

        System.out.println(result);
    }
}
