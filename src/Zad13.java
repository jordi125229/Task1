import java.util.Random;
import java.util.Scanner;

class Zad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj swój ruch (k = kamień, p = papier, n = nożyce): ");
        char player = sc.next().toLowerCase().charAt(0);

        char[] moves = {'k', 'p', 'n'};
        char computer = moves[random.nextInt(3)];

        System.out.println("Ruch komputera: " + computer);
        if ((player == 'k' && computer == 'n') ||
                (player == 'p' && computer == 'k') ||
                (player == 'n' && computer == 'p')) {
            System.out.println("Wygrywa gracz");
        } else if (player == computer) {
                System.out.println("Remis");
        } else if (player == 'k' || player == 'p' || player == 'n') {
            System.out.println("Wygrywa komputer");
        } else {
            System.out.println("Niepoprawny ruch");
        }
    }
}
