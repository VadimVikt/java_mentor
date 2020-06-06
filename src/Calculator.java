public class Calculator {

    public static int calculate(int a, int b, String c) {
        return switch (c) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
