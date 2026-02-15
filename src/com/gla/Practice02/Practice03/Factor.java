 public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    int number = sc.nextInt();

    // Sum of proper divisors
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) {
            sum += i;
        }
    }

    // Perfect
    System.out.println("Perfect: " + (sum == number));

    // Abundant
    System.out.println("Abundant: " + (sum > number));

    // Deficient
    System.out.println("Deficient: " + (sum < number));

    // Strong
    int temp = number;
    int strongSum = 0;

    while (temp != 0) {
        int digit = temp % 10;
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }

        strongSum += fact;
        temp /= 10;
    }

    System.out.println("Strong: " + (strongSum == number));

    sc.close();
}