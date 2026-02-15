import java.util.Scanner;
public class Check1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = NumberChecker.countDigits(number);
        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Count of digits: " + digitCount);

        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sum = NumberChecker.sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        double squareSum = NumberChecker.sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + squareSum);

        System.out.println("Is Harshad Number: " +
                NumberChecker.isHarshad(number, digits));

        int[][] frequency = NumberChecker.digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] +
                                   " occurs " + frequency[i][1] + " times");
            }
        }

        sc.close();
    }
}