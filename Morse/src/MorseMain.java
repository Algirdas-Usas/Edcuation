import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MorseLogic logic = new MorseLogic();

        System.out.println("Skriv 1 för text till morse");
        System.out.println("Skriv 2 för morse till text");

        int choice = scanner.nextInt();
        scanner.nextLine(); // rensar rad

        try {

            if (choice == 1) {
                System.out.println("Skriv text (A-Ö) och (1-9):");
                String input = scanner.nextLine();
                System.out.println("Morse: " + logic.toMorse(input));

            } else if (choice == 2) {
                System.out.println("Skriv morsekod :");
                String input = scanner.nextLine();
                System.out.println("Text: " + logic.toText(input));

            } else {
                System.out.println("Fel val, testa igen!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

        scanner.close();
    }
}
