package pracadomowa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad5Mod3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// lista integerow. Implemetancja ArrayList do list jest tutaj mozliwa dzieki mechanizmowi poliformizmu
        List<Integer> integers = new ArrayList<>();
        System.out.println("Podaj liczbe");
// pierwsze przypisanie tutaj spowodowane obawa o mozliwosc wplyniecia 0 na poprawnosc rozwiazania
        int number = scanner.nextInt();
// gdy liczba rowna jest 0 to nie wejdz nawet do petli
        while (number != 0) {
// dodajemy liczbe do listy
            integers.add(number);
// %.4f oznacza miejsce w ktorym zostanie wpisany argument prinf z dokladnosc widoczna we fragmencie .4
// Alternatywne rozwiazanie: uzywanie println razem ze statyczna metoda z klasy String : String.format()
// Srednia liczona jest w oddzielnej metodzie
            System.out.printf("Srednia to %.4f", average(integers));
            System.out.println();
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
// w chwili gdy liczba rowna jest rowna 0 a w tutaj nie wplywa to na srednia - wyjdz z petli
        }
        System.out.println("Koniec");
    }

    // metoda sumujaca wszystkie elementy listy i zwracajaca sume dzielona przez rozmiar
    private static double average(List<Integer> integers) {
        double sum = 0;
        for (Integer number : integers) {
            sum += number;
        }
        return sum / integers.size();
    }
}

