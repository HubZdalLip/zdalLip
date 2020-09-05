package weekend5;

import java.util.*;

public class Zad2Mod3 {
    public static void main(String[] args) {
//    Napisz program, który będzie pobierał od użytkownika Stringi w pętli
//    aż do momentu gdy użytkownik wpisze koniec (wielkość liter jest nieistotna).
//    Następnie zwróć informacje o tym, które litery ile razy wystąpiły we wszystkich Stringach.

        Scanner scanner = new Scanner(System.in);
        List<String> textsFromUser = new ArrayList<>();

        while (true) {
            System.out.println("Podaj napis");
            String input = scanner.nextLine();
            //porownanie stala.equals(zmienna) poniewaz metoda equals w srodkus wojej implementacji oblsuguje nulle
            if ("exit".equals(input.toLowerCase())) {
                break;
            }
            textsFromUser.add(input);
        }
        System.out.println(textsFromUser);


        for (String element : textsFromUser) {
            //indywidualna mapa litera - liczba wystapien
            Map<Character, Integer> map;
            System.out.println(element);

            //iteracja po kazdej literce danego slowa
            map = calculateLetters(element);
            System.out.println("Mapa dla " + element + " to ");
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

        }

    }

    private static Map<Character, Integer> calculateLetters(String element) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char letter : element.toCharArray()) {
            if (map.containsKey(letter)) {
                map.put(letter,map.get(letter) + 1); // albo replace
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }
}
