import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogikTest {

    @Test
    void testEnLangRad() {
        Logik logik = new Logik();
        logik.raknaRad("Jag vill köpa en ny bmw, 550M 5 liter, 560hk"); // 35 tecken (mellanslag ignoreras)
        assertEquals(1, logik.getAntalRader(), "Antal rader ska vara 1");
        assertEquals(35, logik.getAntalTecken(), "Antal tecken ska vara 22");
    }

    @Test
    void testutanmellanrum() {
        Logik logik = new Logik();
        logik.raknaRad("BMW, ska vara fullutrustad  ");          // 23 tecken (mellanslag ignoreras)
        logik.raknaRad("Helst mattsvart färg!");        // 19 tecken (mellanslag ignoreras)
        logik.raknaRad("  *)*  ");        // 3 tecken (mellanslag ignoreras)
        logik.raknaRad("");               // 0 tecken

        assertEquals(4, logik.getAntalRader(), "Ska vara 4 rader totalt");
        assertEquals(4 + 3 + 4 + 12 + 5 + 9 + 5 + 3, logik.getAntalTecken(), "Tecken räknas utan mellanslag");
    }

    @Test
    void testTomRad() {
        Logik logik = new Logik();
        logik.raknaRad(""); //0 tecken
        assertEquals(1, logik.getAntalRader(), "Tom rad räknas som en rad");
        assertEquals(0, logik.getAntalTecken(), "Tom rad ska inte lägga till tecken");
    }
}
