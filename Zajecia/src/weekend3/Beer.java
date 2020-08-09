package weekend3;

public class Beer {
    public static final String LAGER = "lager"; // stale do danego rodzaju piwa....
    public static final String PILS = "pils";
    public static final String FREE = "free";

    public static final int LAGER_ALCOHOL = 6;  // stale do alkoholu dla danego piwa
    public static final int PILS_ALCOHOL = 5;
    public static final int FREE_ALCOHOL = 0;

    public String kind; // indywidualny stan piwa
    public int alcohol;

    public Beer() {
        kind = "NIE WIADOMO";
        alcohol = -100;
    }

    public Beer(String kind, int alcohol) {
        switch (kind) {         // walidacje czy rodzaj jest poprwany
            case LAGER:
            case PILS:
            case FREE:
                this.kind = kind;
                break;
            default:
                this.kind = "Nie wiadomo";      // jesli nie to nie sprawdzaj nawet zawartosci alkoholu.... po prostu daj zla wartosc i wyjdz
                this.alcohol = -100;
                return;
        }

        switch (alcohol) {
            case LAGER_ALCOHOL:
            case PILS_ALCOHOL:
            case FREE_ALCOHOL:
                this.alcohol = alcohol;
                break;
            default:
                this.alcohol = -100;
        }
    }

}
