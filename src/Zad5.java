import java.util.Scanner;

class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer dnia tygodnia (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieznany dzień");
        }
    }
}
