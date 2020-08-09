package weekend3;

public enum Liczby {
    ZERO(0, "zero"),            // jesli enum nie ma postaci STALA,STALA,STALA czyli ma postac STALA(wartosc,wartosc2...) nalezy stworzyc pola w enumie ktore beda przechowywac te wartosc....
    JEDEN(1, "one"),           // taki enum musi byc zakonczony srednikiem....
    DWA(2, "two"),             // w tym momencie jest to pewna symulacja tworzenia obiektu....
    TRZY(3, "three");

    private int value;
    private String textInEnglish;

    Liczby(int value, String textInEnglish) {
        this.value = value;
        this.textInEnglish = textInEnglish;
    }

    public int getValue() {
        return this.value;
    }

    public String getTextInEnglish() {
        return this.textInEnglish;
    }


}

enum Kolory {
    ZIELONY("kolor zdrowy na oczy"),
    CZERWONY("kolor moze sie wydawac agresywny"),
    NIEBIESKI("kolor nieba");
    //zielony - 0
    //czerwony - 1
    //niebieski - 2

    private String description;

    Kolory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
