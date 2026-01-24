import java.util.Scanner;

class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        double age = scanner.nextDouble();

        if (age < 12 && age >= 0) {
            System.out.println("Dziecko");
        } else if (age >= 12 && age < 18) {
            System.out.println("Nastolatek");
        } else if (age >= 18 && age < 65) {
            System.out.println("Dorosły");
        } else if (age >= 65){
            System.out.println("Senior");
        } else {
            System.out.println("Błędny wiek");
        }
    }
}
