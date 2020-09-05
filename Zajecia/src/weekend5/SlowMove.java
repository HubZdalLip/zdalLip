package weekend5;

public class SlowMove implements Movable{
    @Override
    public void move() {
        System.out.println("Biegnę wolno!");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję się szybko!");
    }
}
