package weekend4;

import java.util.Random;

public class FactoryOfGuitars extends Factory {
    private static Random random = new Random();

    public FactoryOfGuitars(String name, String type) {
        super(name, type);
    }

    @Override
    public int produce() {
        return random.nextInt(25) + 75;
    }
}
