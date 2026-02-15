import java.util.Scanner;
public class Check{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = NumberChecker.countDigits(number);
        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Count of digits: " + digitCount);

        System.out.print("Digits stored: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + 
                           NumberChecker.isArmstrong(number, digits));

        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);

        sc.close();
    }
}