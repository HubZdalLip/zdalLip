package pracadomowa3;

import java.util.Random;

public class Zad2Mod3 {
    public static void main(String[] args) {
        System.out.println(Klasa.generateRandomPassword());
    }
}
class Klasa {

// Metoda zwraca String. Na poczatku tworzone sa instancje klas Random oraz StringBuilder.
    // Petla moze miec dlugosc z zakresu 5-10 poniewaz do minimalnej wartosci dodajemy wylosowana liczbe z przedzialu <0,6)
// Jesli reszta z dzielenia losowej liczby z zakresu <0,2> przez 3 wynosi 0 to czyli dla liczby 0 to do istniejacego ciagu znakow
    // przypisujemy znakową reprezentacje liczby z tabeli ASCII z zakresu 97-122
// Jesli wynik w warunku if wynosi 1 to do ciagu znakow przypisuejmy z kolei znakową reprezentacje liczby z tabeli ASCII z zakresu 65-90
    // Jesli wynik z warunku if wynosi 2 to do przypisujemy losowa liczbe z zakresu 0-9
    public static String generateRandomPassword() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5 + random.nextInt(6); i++) {
            if (random.nextInt(3) % 3 == 0) {
                stringBuilder.append((char) (97 + random.nextInt(26)));
            } else if (random.nextInt(3) % 3 == 1) {
                stringBuilder.append((char) (65 + random.nextInt(26)));
            } else {
                stringBuilder.append(random.nextInt(10));
            }
        }
        return stringBuilder.toString();
    }
}

