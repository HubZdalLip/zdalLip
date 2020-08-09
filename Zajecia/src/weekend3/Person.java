package weekend3;

public class Person {
    public double permills; //indywidualna dla obiektu ilosc promili

    public void drink(Beer beer) {
        System.out.println("Pije piwo o nazwie "+ beer.kind);          //dane piwo - wyswietlam rodzaj
        permills += beer.alcohol / 10.0;                                //zwiekszam obecna ilosc promili o wartosc alkoholu w danym piwie/10
    }
}
