package pracadomowa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2Mod4 {

    public static void main(String[] args) {
// lista typow String
        List<String> listOfStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            switch (text) {
// pętla forEach wyswietl wszystkie elementy z listy
                case "exit":
                    for (String element : listOfStrings) {
                        System.out.println(element);
                    }
                    return;
                case "show long strings":
// zwroc tylko te elementy gdzie metoda lenght() zwroci wartosc wieksza niz 5
                    for (String element : listOfStrings) {
                        if (element.length() > 5) {
                            System.out.println(element);
                        }
                    }
                    break;
                case "remove":
// remove to metoda sluzaca do usuwania elementow z listy o danym indeksie albo nazwie.Indeks w tym przypadku to ostatni element takze rozmiar - 1 (indeksujemy od zera)
                    listOfStrings.remove(listOfStrings.size() - 1);
                    break;
                case "remove all":
// metoda clear() sluzy do usuniecia wszystkich elementow, tak samo jak removeAll (lepiej do takich celów użyć clear())
                    listOfStrings.clear();
                    break;
                default:
                    listOfStrings.add(text);
// dopiero w tym miejscu mozliwe jest rozwiązanie podpunktu "find {}" poniewz wartosc case musi byc stala.
// Rozwiazanie:

                    if (text.startsWith("find ") &&
                            listOfStrings.contains(text.substring("find ".length()))) {
// wypisujemy na ekran ten element ktora jest wpisany przez uzytkownika omijajac czesc find
                        System.out.println(listOfStrings.indexOf(text.substring(5)));
// poniewaz nie zalezy nam by to zapytanie bylo w lsicie, od razu zostaje ono usuniete
                        listOfStrings.remove(listOfStrings.size() - 1);
                    }
            }
        }
    }
}

