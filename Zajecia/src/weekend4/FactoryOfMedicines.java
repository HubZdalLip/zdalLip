package weekend4;

public class FactoryOfMedicines extends Factory {


    public FactoryOfMedicines(String name, String type) {
        super(name, type);
    }

    @Override
    public int produce() {
        return 1000;
    }
}
