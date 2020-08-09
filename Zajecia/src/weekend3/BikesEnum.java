package weekend3;

public enum BikesEnum {
    MIEJSKI("Miejski","Taki tam rower do jazdy miejskiej",1500),
    GORSKI("Gorski","Rower spoko na jazde po drodze pozamiastowej",2000),
    WYCZYNOWY("Wyczynowy","Rower idealny do robienia trikow",900);

    private String description;
    private int price;
    private String name;

    BikesEnum(String name,String description, int price) {
        this.name =name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
