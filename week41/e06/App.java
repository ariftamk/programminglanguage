import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[] options = {"rock", "paper", "scissors"};
        int randomNumber = new Random().nextInt(3);
        System.out.println(options[randomNumber]);
    }
}
