
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String userName = scanner.next();
        for (int i = userName.length(); i > 0; i--){
            System.out.println(userName.charAt(i-1));
        }
    }
}
