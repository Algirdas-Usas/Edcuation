import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogikTest {

    @Test
    void testEnLangRad() {
        Logik logik = new Logik();
        logik.raknaRad("Hej på dig, fint väder idag");
        assertEquals(1, logik.getAntalRader(), "Antal rader ska vara 1");
        assertEquals(3, logik.getAntalTecken(), "Antal tecken ska vara 27");
    }

    @Test
    void testFleraRader() {
        Logik logik = new Logik();
        logik.raknaRad("Hej");
        logik.raknaRad("på");
        logik.raknaRad("dig");
        assertEquals(3, logik.getAntalRader(), "Antal rader ska vara 3");
        assertEquals(3 + 2 + 3, logik.getAntalTecken(), "Antal tecken ska vara summan av alla rader");
    }

    @Test
    void testTomRad() {
        Logik logik = new Logik();
        logik.raknaRad("");
        assertEquals(1, logik.getAntalRader(), "Tom rad räknas som en rad");
        assertEquals(0, logik.getAntalTecken(), "Tom rad ska inte lägga till tecken");
    }
}
