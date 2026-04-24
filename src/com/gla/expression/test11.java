package com.gla.expression;
public class test11 {
    public static void main(String[] args) {
        String visa = "4111111111111111";
        String master = "5111111111111111";

        System.out.println(visa.matches("^4\\d{15}$"));
        System.out.println(master.matches("^5\\d{15}$"));
    }
}
