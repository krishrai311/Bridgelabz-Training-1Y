interface SecurityUtils {

    static boolean checkPasswordStrength(String password) {

        if(password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*")) {

            return true;
        }
        return false;
    }
}