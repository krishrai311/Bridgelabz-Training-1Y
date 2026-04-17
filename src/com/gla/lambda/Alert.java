package src.com.gla.lambda;
import java.util.*;
        import java.util.function.Predicate;

public class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
}
class Alerts {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("INFO", "Routine checkup reminder"),
                new Alert("CRITICAL", "Blood pressure high")
        );

        // Show only critical alerts
        Predicate<Alert> isCritical = a -> a.type.equals("CRITICAL");

        alerts.stream()
                .filter(isCritical)
                .forEach(a -> System.out.println(a.message));
    }
}
