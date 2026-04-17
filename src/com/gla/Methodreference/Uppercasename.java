package src.com.gla.Methodreference;
import java.util.*;
        import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
