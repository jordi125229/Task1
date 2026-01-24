import java.util.Scanner;

class Zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj rok: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("jest rokiem przestępnym");
        } else {
            System.out.println("nie jest rokiem przestępnym");
        }
    }
}

