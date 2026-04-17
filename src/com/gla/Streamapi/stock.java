package src.com.gla.Streamapi;
import java.util.*;

public class stock{
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8);

        prices.forEach(price -> System.out.println("Price: " + price));
    }
}
