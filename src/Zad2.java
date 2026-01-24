import java.util.Scanner;

class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
