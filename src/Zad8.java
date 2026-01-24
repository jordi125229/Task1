import java.util.Scanner;

class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kategorię produktu:(`żywność`, `książki`, `usługi`, `ubrania`, `elektronika`, inne)");
        String category = scanner.nextLine();

        double vat = switch (category) {
            case "żywność" -> 0.05;
            case "książki" -> 0.05;
            case "usługi" -> 0.08;
            case "ubrania" -> 0.08;
            case "elektronika" -> 0.23;
            case "inne" -> 0.23;
            default -> 0.23;
        };

        System.out.println(vat);
    }
}
