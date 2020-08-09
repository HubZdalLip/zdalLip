package weekend3;

public class Person {
    public double permills;

    public void drink(Beer beer) {
        System.out.println("Pije piwo o nazwie "+ beer.kind);
        permills += beer.alcohol / 10.0;
    }
}
