package weekend3;

public class User {
    String name;
    int age;
    String originCity;

    public User(String name1, int age1, String originCity1) {
        name = name1;
        age = age1;
        originCity = originCity1;
    }

    public User() {
        name = "Nie podano";
        age = -1;
        originCity = "Nie podano";
    }

    public void showInfoAboutUser() {
        System.out.println("Imie: " + name);
        System.out.println("Wiek: " + age);
        System.out.println("Miasto pochodzenia: " + originCity);
    }

    public static String staticMethod() {
        return "Jestem metoda statyczna, nci jesscze nie robie";
    }
}
