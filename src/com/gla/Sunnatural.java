import java.util.Scanner;

public class  Sunnatural{

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Method using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if number is natural (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using Recursion: " + sumRecursive);
            System.out.println("Sum using Formula (n*(n+1)/2): " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("Both results are equal. The computations are correct.");
            } else {
                System.out.println("Results are not equal. There is an error.");
            }
        }
    }
}