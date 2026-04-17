package src.com.gla.Methodreference;
import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101, 102, 103);

        // Method reference instead of lambda
        ids.forEach(System.out::println);
    }
}
