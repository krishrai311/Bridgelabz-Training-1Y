package com.gla.expression;
import java.util.regex.*;

public class test13 {
    public static void main(String[] args) {
        String text = "Price is $45.99 and 10.50";

        Matcher m = Pattern.compile("\\$\\d+(\\.\\d+)?|\\b\\d+\\.\\d+\\b")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
