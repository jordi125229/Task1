import java.util.Scanner;

class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("Mróz");
        } else if (temperature <= 15) {
            System.out.println("Chłodno");
        } else if (temperature <= 25) {
            System.out.println("Ciepło");
        } else {
            System.out.println("Gorąco");
        }
    }
}
