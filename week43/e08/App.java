
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a character:");
        String mark = scanner.nextLine();

        System.out.println("Give width:");
        int width = scanner.nextInt();

        System.out.println("Give height:");
        int height = scanner.nextInt();

        String result = generateMarks(mark, width);

        for (int i = 0; i < height; i++) {
            System.out.println(result);
        }
    }

    public static String generateMarks(String mark, int width) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < width; i++) {
            result.append(mark);
        }

        return result.toString();
    }
}

