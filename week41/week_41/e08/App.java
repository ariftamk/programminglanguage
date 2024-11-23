
import java.util.Arrays;

class App {
    public static void main(String[] args) {
        // Check if the user provided a guess
        if (args.length != 1) {
            System.out.println("Please provide a number to guess.");
            return;
        }

        // Parse the user's guess from the command line argument
        int guess;
        try {
            guess = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
            return;
        }

        // Generate an array of 10 random integers between 1 and 100
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100) + 1;
        }

        // Display the generated array for debugging purposes (optional)
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        // Check if the guess is in the array
        boolean found = false;
        for (int number : randomNumbers) {
            if (number == guess) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
    }
}
