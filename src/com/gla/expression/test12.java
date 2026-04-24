package com.gla.expression;
import java.util.regex.*;

public class test12 {
    public static void main(String[] args) {
        String text = "I love Java Python Go JavaScript";

        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
