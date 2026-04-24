package com.gla.expression;
import java.util.regex.*;

public class test4 {
    public static void main(String[] args) {
        String text = "Contact support@example.com and info@company.org";

        Matcher m = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
