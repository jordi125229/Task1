import java.util.Scanner;

class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Hasło za krótkie");
        } else if (Character.isUpperCase(password.charAt(0))) {
            System.out.println("OK");
        } else {
            System.out.println("Hasło musi zaczynać się wielką literą");
        }
    }
}
