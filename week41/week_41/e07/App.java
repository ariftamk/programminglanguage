
class App {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three arguments: number operator number");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "x":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Unsupported operator. Use +, -, x, or /.");
        }

    }
}

