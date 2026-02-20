import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseLogicTest {

    MorseLogic logic = new MorseLogic();

    @Test
    void testTextToMorseSingleLetter() {
        assertEquals("-.- ---. .-. -- ..... --. . -. --- -- ... - .- -. -... .-. .-. .-. .-. .-. .-.", logic.toMorse("KÖRM5GENOMSTANBRRRRRR"));
    }

    @Test
    void testTextToMorseWord() {
        assertEquals("- .- -.- . - -. . .-. . -... .-.. .--.-, ..-. .-.-, .-. --. ... -.- .. -. -. . .-.", logic.toMorse("TAKETNEREBLÅFÄRGSKINNER"));
    }

    @Test
    void testMorseToText() {
        assertEquals("BMWM550V12", logic.toText("-... -- .-- -- ..... ..... ----- ...- .---- ..---"));
    }

    @Test
    void testInvalidText() {
        assertThrows(IllegalArgumentException.class, () -> {
            logic.toMorse("-1");
        });
    }

    @Test
    void testInvalidMorse() {
        assertThrows(IllegalArgumentException.class, () -> {
            logic.toText(".... . .--- -.-.-");
        });
    }
}
