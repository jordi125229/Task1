import java.util.Scanner;

class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");
        int age = scanner.nextInt();

        String result = (age  >= 18) ? "Pełnoletni" : "Niepełnoletni";
        System.out.println(result);
    }
}
