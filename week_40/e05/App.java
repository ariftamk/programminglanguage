
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder nameList = new StringBuilder();

        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if ("Quit".equalsIgnoreCase(name)) {
                break;
            }
            nameList.append(name);
            System.out.println(nameList.toString());
        }
        scanner.close();
    }
}
