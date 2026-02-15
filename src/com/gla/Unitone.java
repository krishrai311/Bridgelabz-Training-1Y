import java.util.Scanner;
public class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + UnitConvertor.convertFarhenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + UnitConvertor.convertCelsiusToFarhenheit(c));

        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms: " + UnitConvertor.convertPoundsToKilograms(p));

        System.out.print("Enter Kilograms: ");
        double k = sc.nextDouble();
        System.out.println("Pounds: " + UnitConvertor.convertKilogramsToPounds(k));

        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters: " + UnitConvertor.convertGallonsToLiters(g));

        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons: " + UnitConvertor.convertLitersToGallons(l));
    }
}