
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many names to enter: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[count];

        // Prompt the user to enter each name
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
        }

        // Find the longest name
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        // Display the longest name
        System.out.println("Longest name entered was " + longestName);

        scanner.close();
    }
}
