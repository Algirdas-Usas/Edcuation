import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogikTest {

    @Test
    void testEnLangRad() {
        Logik logik = new Logik();
        logik.raknaRad("Hej på dig, fint väder idag"); // 22 tecken (mellanslag ignoreras)
        assertEquals(1, logik.getAntalRader(), "Antal rader ska vara 1");
        assertEquals(22, logik.getAntalTecken(), "Antal tecken ska vara 22");
    }

    @Test
    void testutanmellanrum() {
        Logik logik = new Logik();
        logik.raknaRad("Hej  ");          // 3 tecken (mellanslag ignoreras)
        logik.raknaRad("på dig!");        // 6 tecken (”på” 2 + ”dig!” 4)
        logik.raknaRad("  :)  ");        // 2 tecken (":)" är två, mellanslag ignoreras)
        logik.raknaRad("");               // 0 tecken

        assertEquals(4, logik.getAntalRader(), "Ska vara 4 rader totalt");
        assertEquals(3 + 6 + 2 + 0, logik.getAntalTecken(), "Tecken räknas utan mellanslag");
    }

    @Test
    void testTomRad() {
        Logik logik = new Logik();
        logik.raknaRad(""); //0 tecken
        assertEquals(1, logik.getAntalRader(), "Tom rad räknas som en rad");
        assertEquals(0, logik.getAntalTecken(), "Tom rad ska inte lägga till tecken");
    }
}

