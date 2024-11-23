
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a character:");
        String mark = scanner.nextLine();

        System.out.println("Give an amount:");
        int count = scanner.nextInt();

        displayMark(mark, count);
    }

    public static void displayMark(String mark, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(mark);
        }
        System.out.println();
    }
}

