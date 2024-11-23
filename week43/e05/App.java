
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1 = scanner.nextInt();

        System.out.println("Give a number:");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);

        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

