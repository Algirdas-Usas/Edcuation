import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        // Skapar ett Logik-objekt som håller reda på statistik
        Logik logik = new Logik();

        System.out.println("Skriv nedan för att räkna rader och tecken (skriv 'stop' för att avsluta):");

        // Oändlig loop som fortsätter tills användaren skriver "stop"
        while (true) {
            String rad = sc1.nextLine();

            if (rad.equalsIgnoreCase("stop")) {
                break; // Avsluta programmet om användaren skriver "stop"
            }
            // Skickar den inlästa raden till Logik som uppdaterar räknarna
            logik.raknaRad(rad);
        }
        //skriver ut reslutaten
        System.out.println("Resultat:");
        System.out.println("Antal rader: " + logik.getAntalRader());
        System.out.println("Antal tecken: " + logik.getAntalTecken());
        //Stänger scanner
        sc1.close();
    }
}

