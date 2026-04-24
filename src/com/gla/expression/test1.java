package com.gla.expression;
public class test1 {
    public static void main(String[] args) {
        String username = "user_123";
        System.out.println(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
    }
}
