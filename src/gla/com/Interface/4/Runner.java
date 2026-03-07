public class PasswordValidator {

    public static void main(String[] args) {

        String password = "Secure123";

        boolean result = SecurityUtils.checkPasswordStrength(password);

        if(result)
            System.out.println("Password is strong");
        else
            System.out.println("Password is weak");
    }
}