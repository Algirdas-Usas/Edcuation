public class Logik {
    //skapar variabler som håller antal rader och tecken
    private int antalRader;
    private int antalTecken;
    //konstruktor som anger talet 0 i början
    public Logik() {
        this.antalRader = 0;
        this.antalTecken = 0;
    }

    // Tar emot en rad text och uppdaterar statistik
    public void raknaRad(String rad) {
        antalRader++;
        antalTecken += rad.length();
    }
    //hämtar värderna och returnerar
    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }
}
