package src.com.gla.Streamapi;
public class Customernames{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john", "alice", "bob");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
