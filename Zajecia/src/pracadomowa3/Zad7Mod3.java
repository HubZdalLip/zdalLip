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
//    Napisz enuma, który będzie nawiązywał do mebli domowych.
//        a) enum musi posiadać co najmniej 5 pozycji. Każdy element ma posiadać w sobie atrybuty będące wiekiem przedmiotu oraz krajem pochodzenia.
//        b) dodaj atrybut ID oraz stwórz statyczną metodę wewnątrz enuma pozwalająca wyszukać danego enuma po ID
//        c) przetestuj działanie enuma próbując dowiedzieć się o wieku mebla i kraju pochodzenia na podstawie jego ID ( nie jest potrzebne tworzenie żadnych dodatkowych metod !)



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


    // ten spsoob wyszukiwania elementow to wyszukiwanie liniowe

    // metoda pozwalajaca znalezc po ID
    public static Furniture findById(long id) {
        // id = 3
        for (Furniture furniture : Furniture.values()) {
            //gdy pierwszy mebel (CHAIR) to jego id = 1 => 1=/3
            //gdy drugi mebel (DESK) to jego id = 2 => 2=/3
            //gdy trzeci mebel (LAMP) to jego id = 3 => 3=3
            if (furniture.getId() == id) {
                return furniture;
            }
        }
        return null;
    }

}
