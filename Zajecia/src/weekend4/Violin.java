package weekend4;

public class Violin extends Instrument {
    public Violin(double price, double age, int howCool, String name) {
        super(price, age, howCool, name);
    }

    @Override
    public void play() {
        System.out.println("I am plating the violin!");
    }
}
