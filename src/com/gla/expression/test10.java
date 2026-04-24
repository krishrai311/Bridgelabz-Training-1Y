package com.gla.expression;
public class test10 {
    public static void main(String[] args) {
        String ip = "192.168.1.1";

        boolean isValid = ip.matches(
                "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                        + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$"
        );

        System.out.println(isValid);
    }
}
