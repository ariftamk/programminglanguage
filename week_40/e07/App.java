
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password;
        boolean isValid;

        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();

            isValid = validatePassword(password);

            if (isValid) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid. It must:");
                System.out.println("- Be at least 8 characters long");
                System.out.println("- Contain at least one uppercase letter (A-Z)");
                System.out.println("- Contain at least one lowercase letter (a-z)");
                System.out.println("- Contain at least one digit (0-9)");
            }
        } while (!isValid);

        scanner.close();
    }

    private static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            if (Character.isLowerCase(ch)) hasLowercase = true;
            if (Character.isDigit(ch)) hasDigit = true;

            // If all conditions are met, no need to check further
            if (hasUppercase && hasLowercase && hasDigit) return true;
        }

        // If any condition is not met, return false
        return false;
    }
}
