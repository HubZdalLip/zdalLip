package pracadomowa3;

public class Zad7Mod3 {
    public static void main(String[] args) {
        Furniture furniture = Furniture.findById(3);
        //może być null..
        if (furniture != null) {
            System.out.println(furniture.getAge());
            System.out.println(furniture.getOriginCountry());
        }else{
            System.out.println("Coś z ID jest nie tak....");
        }
    }


}

enum Furniture {
    //elementy enuma...
    CHAIR(1, 8, "Polska"),
    DESK(2, 3, "Niemcy"),
    LAMP(3, 20, "Japonia"),
    CABINET(4, 1, "Francja"),
    TABLE(5, 3, "Hiszpania");

    //id jest inkrementowane przez nas
    private long id;
    private int age;
    private String originCountry;

    Furniture(long id, int age, String originCountry) {
        this.id = id;
        this.age = age;
        this.originCountry = originCountry;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    // metoda pozwalajaca znalezc po ID
    public static Furniture findById(long id) {
        for (Furniture furniture : Furniture.values()) {
            if (furniture.getId() == id) {
                return furniture;
            }
        }
        return null;
    }

}
