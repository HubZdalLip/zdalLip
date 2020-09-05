package weekend5;

public class FastMove implements Movable {
    @Override
    public void move() {
        System.out.println("Biegnę szybko");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję się wolno");
    }
}
