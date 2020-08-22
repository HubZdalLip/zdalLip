package weekend4;


// instrument sam w sobie jest bytem abstrakcyjnych.
// nie ma insturmentu jako instrument fizycznie poneiważ zasze instrument jest czymś konkretnym, np gitarą, pianiniem
// nie mozna utworzyc instancji klasy abstarkcyjnej....
public abstract class Instrument {
    private double price;
    private double age;
    private int howCool;
    private String name;

    public Instrument(double price, double age, int howCool, String name) {
        this.price = price;
        this.age = age;
        this.howCool = howCool;
        this.name = name;
    }

    // wystarczy by isniala jedna metoda abstrakcyjna a juz cala klasa musi byc abstrakcyjna...
//    natomiast klasa oznacza jako abstact wcale nie musi posiadac metod abstrakcyjnych
    public abstract void play();


    public double getPrice() {
        return price;
    }

    public double getAge() {
        return age;
    }

    public int getHowCool() {
        return howCool;
    }
}
