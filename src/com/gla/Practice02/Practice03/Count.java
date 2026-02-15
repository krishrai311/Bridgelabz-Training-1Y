import java.util.Scanner;
public class Count {
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

        int[] reversed = NumberChecker.reverseArray(digits);

        System.out.print("Reversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Arrays Equal: " +
                NumberChecker.areArraysEqual(digits, reversed));

        System.out.println("Is Palindrome: " +
                NumberChecker.isPalindrome(digits));

        System.out.println("Is Duck Number: " +
                NumberChecker.isDuckNumber(digits));

        sc.close();
    }
}