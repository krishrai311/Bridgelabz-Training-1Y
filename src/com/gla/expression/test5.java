package com.gla.expression;
import java.util.regex.*;

public class test5 {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris";

        Matcher m = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
