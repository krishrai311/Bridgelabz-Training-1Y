public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);

    // Take input for how many OTPs to generate
    System.out.print("Enter how many OTPs to generate: ");
    int n = sc.nextInt();

    int[] otpArray = new int[n];

    // Generate OTPs
    for (int i = 0; i < n; i++) {
        otpArray[i] = (int)(Math.random() * 900000) + 100000;
    }

    // Display OTPs
    System.out.println("Generated OTPs:");
    for (int otp : otpArray) {
        System.out.println(otp);
    }

    // Check uniqueness
    boolean unique = true;

    for (int i = 0; i < otpArray.length; i++) {
        for (int j = i + 1; j < otpArray.length; j++) {
            if (otpArray[i] == otpArray[j]) {
                unique = false;
                break;
            }
        }
        if (!unique) break;
    }

    System.out.println("All OTPs Unique: " + unique);

    sc.close();
}