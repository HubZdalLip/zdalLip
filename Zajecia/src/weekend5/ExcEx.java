package weekend5;

import java.util.*;

public class ExcEx {
    public static void main(String[] args) {
        //    W pętli pobierać liczby od użytkownika i na ich podstawie stworzyć uporządkowany zbiór unikalnych liczb, oraz:
//    a) dodać obsługę wyjątków np. wpisanie znaku innego niż cyfra nie powinno przerywać wykonywania programu
//    b) gdy użytkownik poda liczbę 997 lub trzy razy poda napis to rzuć własne wyjątki
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Set<Double> uniqueNumbers = new HashSet<>();
        int counter = 0;
        while (true) {
            try {
                try {
                    System.out.println("Podaj liczbę. Podaj -1 by przerwac");
                    double number = scanner.nextDouble();

                    if (number == -1) {
                        break;
                    }

                    if (number == 997) {
                        throw new WrongNumberException("Podałeś liczbe 997");
                    }

                    uniqueNumbers.add(number);
                } catch (InputMismatchException e) {
                    counter++;
                    System.out.println("Nie podałeś liczby");
                    scanner.nextLine();

                    if (counter == 3) {
                        throw new NotNumber3TimesException("Podałeś 3 razy coś innego niż liczba!");
                    }
                } catch (WrongNumberException e) {
                    System.out.println(e.getMessage());
                }
            } catch (NotNumber3TimesException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(uniqueNumbers);
    }
}
