
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a character:");
        String mark = scanner.nextLine();

        System.out.println("Give an amount:");
        int count = scanner.nextInt();

        String result = generateMarks(mark, count);
        System.out.println(result);
    }

    public static String generateMarks(String mark, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(mark);
        }

        return result.toString();
    }
}

