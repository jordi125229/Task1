import java.util.Scanner;

class Zad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dzień: ");
        int day = sc.nextInt();

        System.out.println("Podaj miesiąc: ");
        int month = sc.nextInt();

        System.out.println("Podaj rok: ");
        int year = sc.nextInt();
        int maxDay;

        if (year <= 0) {
            System.out.println("Data niepoprawna");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Data niepoprawna");
            return;
        }
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            if (leapYear) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Data niepoprawna");
            return;
        }
        System.out.println("Data poprawna");
    }
}
