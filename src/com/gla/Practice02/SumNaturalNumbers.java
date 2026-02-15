import java.util.Scanner;

public class SumNaturalNumbers{

    // Method to calculate sum using loop
    public static int calculateSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int result = calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }
    }
}