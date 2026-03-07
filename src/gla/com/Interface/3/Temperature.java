import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        Predicate<Double> alert = temp -> temp > 35.0;

        double temperature = 38.5;

        if (alert.test(temperature)) {
            System.out.println("Alert! Temperature is too high: " + temperature);
        } else {
            System.out.println("Temperature is normal: " + temperature);
        }
    }
}