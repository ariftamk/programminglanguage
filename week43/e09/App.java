
class App {
    static int a;
    static int b;
    static int sum;

    public static void main(String[] args) {
        setA();
        setB();
        calculateSum();
        print();
    }

    public static void setA() {
        a = 5;
    }

    public static void setB() {
        b = 5;
    }

    public static void calculateSum() {
        sum = a + b;
    }

    public static void print() {
        System.out.println(sum);
    }
}

