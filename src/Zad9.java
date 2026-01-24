import java.util.Scanner;

class Zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczby ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Podaj operator (+, -, *, /, %): ");
        sc.nextLine();
        String operator = sc.nextLine();
        double calculateResult = calculate(num1, num2, operator);
        System.out.println(calculateResult);

    }
    public static double calculate(double a, double b, String operator) {
        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
            default:
                System.out.println("Podany operator nie istnieje");
        }
        return result;
    }
}
