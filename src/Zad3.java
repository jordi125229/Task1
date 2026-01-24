import java.util.Scanner;

class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();

        if (age < 12) {
            System.out.println("Dziecko");
        } else if (age <= 17) {
            System.out.println("Nastolatek");
        } else if (age <= 64) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Senior");
        }
    }
}
