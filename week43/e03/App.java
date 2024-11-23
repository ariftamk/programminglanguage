
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a name:");
        String name = scanner.nextLine();

        printName(name);
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}
