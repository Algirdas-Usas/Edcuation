import java.util.HashMap;
import org.junit.jupiter.api.Test;


public class MorseLogic {

    private HashMap<String, String> textToMorse = new HashMap<>();
    private HashMap<String, String> morseToText = new HashMap<>();

    // Konstruktor = hashmap
    public MorseLogic() {

        // A-Z enligt internationell morsekod
        textToMorse.put("A", ".-");
        textToMorse.put("B", "-...");
        textToMorse.put("C", "-.-.");
        textToMorse.put("D", "-..");
        textToMorse.put("E", ".");
        textToMorse.put("F", "..-.");
        textToMorse.put("G", "--.");
        textToMorse.put("H", "....");
        textToMorse.put("I", "..");
        textToMorse.put("J", ".---");
        textToMorse.put("K", "-.-");
        textToMorse.put("L", ".-..");
        textToMorse.put("M", "--");
        textToMorse.put("N", "-.");
        textToMorse.put("O", "---");
        textToMorse.put("P", ".--.");
        textToMorse.put("Q", "--.-");
        textToMorse.put("R", ".-.");
        textToMorse.put("S", "...");
        textToMorse.put("T", "-");
        textToMorse.put("U", "..-");
        textToMorse.put("V", "...-");
        textToMorse.put("W", ".--");
        textToMorse.put("X", "-..-");
        textToMorse.put("Y", "-.--");
        textToMorse.put("Z", "--..");
        textToMorse.put("Å", ".--.-,");
        textToMorse.put("Ä", ".-.-,");
        textToMorse.put("Ö", "---.");
        textToMorse.put("0", "-----");
        textToMorse.put("1", ".----");
        textToMorse.put("2", "..---");
        textToMorse.put("3", "...--");
        textToMorse.put("4", "....-");
        textToMorse.put("5", ".....");
        textToMorse.put("6", "-....");
        textToMorse.put("7", "--...");
        textToMorse.put("8", "---..");
        textToMorse.put("9", "----.");

        // morseToText auto
        for (String key : textToMorse.keySet()) {
            morseToText.put(textToMorse.get(key), key);
        }
    }

    // Metod 1: Text till morse
    public String toMorse(String text) {

        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Texten är tom!");
        }

        text = text.toUpperCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));

            if (!textToMorse.containsKey(letter)) {
                throw new IllegalArgumentException("Ogiltigt tecken: " + letter);
            }

            result.append(textToMorse.get(letter)).append(" ");
        }

        return result.toString().trim();
    }

    // Metod 2: Morse till text
    public String toText(String morse) {

        if (morse == null || morse.isEmpty()) {
            throw new IllegalArgumentException("Morsekoden är tom!");
        }

        String[] letters = morse.split(" ");
        StringBuilder result = new StringBuilder();

        for (String letter : letters) {

            if (!morseToText.containsKey(letter)) {
                throw new IllegalArgumentException("Ogiltig morsekod: " + letter);
            }

            result.append(morseToText.get(letter));
        }

        return result.toString();
    }
}
