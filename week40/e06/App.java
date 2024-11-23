
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome test, please enter some text: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String text) {
        //Remove non-alphanumeric characters and make lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }
}
