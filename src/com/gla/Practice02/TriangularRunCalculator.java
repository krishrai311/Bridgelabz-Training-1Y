import java.util.Scanner;

public class TriangularRunCalculator {

   
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;  
        double totalDistance = 5000;               
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive values.");
        } else {

            double rounds = calculateRounds(side1, side2, side3);

            System.out.println("\nPerimeter of the triangular park: " + (side1 + side2 + side3) + " meters");
            System.out.println("Number of rounds needed to complete 5 km run: " + rounds);
        }
    }
}