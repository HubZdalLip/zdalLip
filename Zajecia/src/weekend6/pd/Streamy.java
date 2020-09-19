package weekend6.pd;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamy {
    public static void main(String[] args) {
        zad11();
        zad16();
        zad23();

    }

    private static void zad23() {
//        Napisz metodę, która rzuci milion razy kostką sześcienną i zwróci informację o tym, które rzuty ile razy wystąpiły

        throwCube(1_000_000);
        throwCube(50_000_000);
        throwCube(2000);
    }

    private static void throwCube(int max) {
        Random random = new Random();
        Map<Integer, Long> integerLongMap = IntStream.generate(() -> random.nextInt(6) + 1)
                .limit(max)     //elementy int
                .boxed()        //konwersja
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//elementy Integer

        integerLongMap.forEach((k, v) -> System.out.println(k + " zostało rzucone " + v + " razy"));
        System.out.println();

        // grupujemy po tym co wylosowalismy np 3, 1, 5. Potrzebujemy metody ktora zwroci nam to co weszlo do aktualnej iteracji streama
        //boxed - opakowuje w typ opakowujacy
        //groupingBy (po czym grupowane) ew drugi parametr - oczekiwany wynik, tutaj po ilosci wystapien

    }

    private static void zad11() {
//        Stwórz listę 5 liczb całkowitych a następnie zwróć silnie za pomocą strumieni.
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int factorial = integerList.stream()
                .reduce(1, (i1, i2) -> i1 * i2);            // przeciazenie przyjmujace 2 parametry
        System.out.println(factorial);
        // 1 parametr - wartosc poczatkowa
        // 2 parametr - total i kolejny int oraz co sie bedzie z nimi dzialo
//        i1 - total
//        i2 - kolejny int
//        1*1->1 czyli i1=1
//        1*2-> 2 czyli i1 = 2
//        2*3 -> 6 czyli i1= 6
//        6*4-> 24 czyli i1= 24
//        24*5 -> 120 czyli i1= 120
//        120 i brak nast elem czyli jest on zwracany
    }

    private static void zad16() {
//        Napisz metodę, która przyjmie listę stringów oraz drugiego stringa i sprawdzi mieści się on w tej liście.
        List<String> list = new ArrayList<>(Arrays.asList("pierwszy", "krzeslo", "okno", "mleko", "gitara"));
        String text = "posciel";
        String text2 = "okno";
        System.out.println(checkIfExists(list, text));
        System.out.println(checkIfExists(list, text2));
    }

    private static boolean checkIfExists(List<String> list, String text) {
        return list.stream()            // tworzymy strumien
                .anyMatch(s -> s.equals(text));     // badamy czy ktorykolwiek element listy rowna sie zmiennej text wyslanej jako drugi parametr
    }

}
