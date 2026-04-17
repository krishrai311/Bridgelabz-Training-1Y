package src.com.gla.Streamapi;

import java.util.*;

public class welcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("John", "Alice", "Bob");

        attendees.forEach(name ->
                System.out.println("Welcome " + name + "!"));
    }
}
