package weekend4;

public abstract class Factory {
    public static final String GUITARS = "guitars";
    public static final String MEDICINES = "medicines";
    public static final String UNDEFINED = "undefined";

    private String name;
    private int amountOfProducts;
    private String type;

    public Factory(String name, String type) {
        this.name = name;
        switch (type){
            case GUITARS:
            case MEDICINES:
                this.type = type;
                break;
            default:
                System.out.println("Coś poszło nie tak");
                type = UNDEFINED;

        }
        this.amountOfProducts = 0;
    }

    public abstract int produce();

    public String getName() {
        return name;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(int amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", amountOfProducts=" + amountOfProducts +
                '}';
    }
}
