
public class Main {
    public static void main(String[] args) {

        Znayka Znay = new Znayka();
        Neznayka Nez = new Neznayka();
        Neznayka NUZZ = new Neznayka();
        Toropizhka Tor = new Toropizhka();

        Tor.TakeItEasy();
        NUZZ.TakeItEasy();
        Nez.TakeItEasy();
        Znay.TakeItEasy();
        Znay.podoshol();
        Nez.jump();
        Znay.jump();
        Tor.jump();

    }
}
