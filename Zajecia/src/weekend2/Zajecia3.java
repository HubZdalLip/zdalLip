package weekend2;

import java.util.Arrays;
import java.util.Scanner;

public class Zajecia3 {
    public static void main(String[] args) {
        // operator trojargumentowy - uproszoczony if....

//        String text = (5 < 4) ? "Prawda" : "Falsz";
//        System.out.println(text);
//
////         skladnia
////         warunek ? wartosc_gdy_warunek_prawda : gdy_falsz.....
//
////         Zad.
////        a) zadeklarowac i zainicjowac dwie zmienne typu int...
////        b) okreslic zaleznosc miedzy nimi (>,<,=) i wyswietlic to na erkanie....
//
//        int a = 10;
//        int b = 18;
//
//        String relation = (a > b && a < 20) ? "a>b" : (a < b ? "a<b" : "a=b");      // ify w tej postaci mozna zagniezdzac....
//        System.out.println(relation);
//
//        // String ciag dalszy....
//        String text1 = "Hubert";
//
//        if (text == "Hubert") {          // porownanie == generuje bledy.... dla typow obiektowych (!)
//
//        }
//
//        if (text.equals("Hubert")) {
//
//        }
//
//        String name = "a" + "b" + 'c';
//        String name1 = "ab" + "c";
//
//        if (name.equals(name1)) {               // bardzo wazne...
//            System.out.println("Referencje sa rowne....");
//        }
//
//        if (name == name1) {
//            System.out.println("Obiekty sa rowne....");
//        }
//
//        // string to typ obiektowy, == porownuje w tym przypadku (obiektowym) obiekty - czy text1 pokazuje w to samo wmiejsce w pamieci jak "Hubert"
//        // trzeba uzyc metody equals wywolana na stringu - proownuje ona referencje czyli nazwy (pseudonimy)
//
//        //endsWith
//
//        if ("Hubert".endsWith("ert")) {
//            System.out.println("Prawda...");
//        }
//
//        //substring, toLowerCase,toUpperCase
//
//        //substring - dwie postaci - ucinanie stringow... zwraca nowego stringa....
////       a) postac z jednym arg - ucina od podanego indeksu do konca stringa....
////       b) postac z dwoma arg - ucina od podanego indeksu do podanego indeksu NIEwlacznie
//        String text2 = "JakasNazwa";
//        String text2Sub = text2.substring(5);           // postac a)
//        System.out.println(text2Sub);
//        text2Sub = text2.substring(5, 9);                // postac b)
//        System.out.println(text2Sub);
//
//        // toLowerCase i toUpperCase
////        a) toLowerCase wyswietla caly napis w małych literach
////        b) toUpperCase wyswietla caly napis w postaci wielkich liter
//
//        String text2LowerCase = text2.toLowerCase();
//        System.out.println(text2LowerCase);
//
//        System.out.println(text2.toUpperCase());

//         Zadanie
//         a) stworz Stringa ktorego wartosc zostanie pobrana od uzytkownika
//         b) jesli string bedzie rowny "upper" to wyswietl stringa w postaci wielkich liter
//         c) jesli String bedzie rowny "lower" to wyswietl stringa w postaci malych liter
//         d) jesli String bedzie zawieral wyrazenie "ok" ale nie bedzie się na nie konczyl to wyswietl napis: Zawieram wyrazenie ok ale nie na koncu. Zmodyfkijuj program tak aby mogl wyswietlic:
//            Zawieram wyrazenie ale na poczatku
//         e) jesli String bedzie rowny "find" to wtedy pozwol uzytkownikowi na wprowadzenie innego stringa, sprawdz czy on wystepuje w 1 stringu i od jakiego indeksu
//         f) jesli String bedzie inny niz powyzsze przypadki to wtedy wyswietl go od polowy, bez dwoch ostatnich znakow

//        String str1 = "one";
//        String str2 = "two";
//        if ((str1 + str2) == "onetwo") {
//            System.out.println("Obiekty sa rowne");
//        } else if ((str1 + str2).equals("onetwo")) {
//            System.out.println("Obiekty nie sa rowne, ale nazwy tak");
//        }
//
//        Scanner input = new Scanner(System.in);                         //a)
//        String stringFromUser = input.nextLine();
//        stringFromUser = stringFromUser.toLowerCase();
//        if (stringFromUser.equals("upper")) {                           //b)
//            System.out.println(stringFromUser.toUpperCase());           // metoda toUpperCase srpawia ze wynik jest w psotaci wielkoich liter
//        } else if (stringFromUser.equals("lower")) {                    //c)
//            System.out.println(stringFromUser.toLowerCase());           // metoda toLowerCase srpawia ze wynik jest w psotaci malych liter
//        } else if (stringFromUser.equals("find")) {                     //e)
//            String anotherString = input.nextLine();
//            int index = stringFromUser.indexOf(anotherString);          //e)    pobranie indeksu od ktorego zaczyna sie wyraczenie anotherString
//            System.out.println("Indeks wystepowania " + index);
//        } else {
//            if (stringFromUser.contains("ok") && !stringFromUser.endsWith("ok") && !stringFromUser.startsWith("ok")) {          // d) jesli zaiwera ale nie konczy sie i nie zaczyna na "ok"
//                System.out.println("Zawieram wyrazenie ok ale nie na koncu");
//            } else if (stringFromUser.startsWith("ok")) {                       // d) (2) jesli zaczyna sie na "ok"
//                System.out.println("Zawieram wyrazenie ok na poczatku");
//            } else {
//                System.out.println(stringFromUser.substring(stringFromUser.length() / 2, stringFromUser.length() - 2));
//                // f) jesli inny przypadek to utnij pierwotnego stringa od indeksu bedacego polowa ( dlugosc / 2 ) do konca bez 2 ost znakow (czyli dlguosc stringa - 2)
//            }
//        }


//        switch (stringFromUser) {                 //rekomentdowana wersja
//            case "upper":                            //b)
//                System.out.println(stringFromUser.toUpperCase());
//                break;
//            case "lower":                     //c)
//                System.out.println(stringFromUser.toLowerCase());
//                break;
//            case "find":
//                String anotherString = input.nextLine();
//                int index = stringFromUser.indexOf(anotherString);
//                System.out.println("Indeks wystepowania" + index);
//                break;
//            default:
//                if (stringFromUser.contains("ok") && !stringFromUser.endsWith("ok") && !stringFromUser.startsWith("ok")) {
//                    System.out.println("Zawieram wyrazenie ok ale nie na koncu");
//                } else if (stringFromUser.startsWith("ok")) {
//                    System.out.println("Zawieram wyrazenie ok na poczatku");
//                } else {
//                    System.out.println(stringFromUser.substring(stringFromUser.length() / 2, stringFromUser.length() - 2));
//                }
//                break;
//        }

        // tablice.... typy
        //pierwszy sposob deklaracji - pdoajemy na sztywno ilosc elementow
        int[] arrayOfInts = new int[5];     // 5 elementow
        arrayOfInts[0] = 5;
        arrayOfInts[1] = 4;
        arrayOfInts[2] = 6;
        arrayOfInts[3] = 9;
        arrayOfInts[4] = 11;

        // skladnia
//        typ [] nazwa_tablicy = new typ[ilosc elementow];

        //II sposob         // kompilator liczy elementy wewnatrz nawiasow klmarowych i tak naprawde korzsyta z postaci nr 1 - NIEJAWNIE
        String[] arrayOfStrings = {"element0", "element1", "element2"}; // TO SAMO CO arrayOfString[0] = "element0", arrayOfString[1] = "element1", arrayOfString[2] = "element2"

//        III sposob - nie podajemy liczby elementow
        double[] arrayOfDoubles = new double[]{4.123, 4.1};
        System.out.println(arrayOfInts);

        // [I@1b6d3586
//        [ - oznacza ze ejst to tablica
//        I - integer
//        - @... ADRES PAMIECI w komputerze w postaci heksadecymalnej

        System.out.println(arrayOfInts[0]);
        System.out.println(arrayOfInts[1]);
        System.out.println(arrayOfInts[2]);
        System.out.println(arrayOfInts[3]);
        System.out.println(arrayOfInts[4]);

        System.out.println(arrayOfStrings[2]);

//        System.out.println(arrayOfDoubles[100]); // wyszlismy poza zakres - dostajemy wyjatek ArrayIndexOutOfBoundsException

        String textCommon = "text";
        System.out.println(textCommon);
        char[] textAsArray = {'t', 'e', 'x', 't'};             // tablica charow.... 4 elementowa bo kompilator to policzyl
        System.out.print(textAsArray[0]);
        System.out.print(textAsArray[1]);
        System.out.print(textAsArray[2]);
        System.out.println(textAsArray[3]);

        System.out.println(Arrays.toString(arrayOfInts));   // instrukcja ktora pozwala wyswietlic dane na raz

        int numberOfElementInIntsArray = arrayOfInts.length;        //instrukcja ktora pozwala na uzyskanie ifnoramcji o dlugosci tablicy
        System.out.println(numberOfElementInIntsArray);

//        zadania
//        a) Stworzyc tablice intow (3 elementowa),
//        b) wyswietlic na ekranie elementy
//        c) wprowadz indeks od uzytkownika i wyswietl element o tym indeksie na ekranie. Uwazaj by nie przekroczyc zakresu....

//  a)
        int[] array = new int[]{1, 2, 3};
//  b)
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
//        II -lepsza metoda
        System.out.println(Arrays.toString(array));

//        int intToReplace = 5;             // tablica intow to tak naprawde trzy inty w postaci jednej "zmiennej"
//        array[0] = intToReplace;          //dlatego mozna na jej elmementach operowac dokladnie tak jak na zmiennych tego typu

        //tablice maja statyczny rozmiar
//        aby rozmiar byl dynamiczny nalezy uzyc kolekcji (o tym pozniej (duzo))

//        rozmiar tablicy MUSI byc okreslony

        //tablicy multiwymiarowe, moga one zawierac iles elementow wewnatrz jednego elementu
//        rozmiar MUSI byc podany dla lewego indeksu, prawy nie musi byc znany
        int[][] twoDimensionalArray = new int[3][5];
        twoDimensionalArray[0][0] = 5;
        twoDimensionalArray[0][1] = 6;
        twoDimensionalArray[1][0] = 56;
        twoDimensionalArray[1][1] = 63;
        twoDimensionalArray[2][0] = 21;
        twoDimensionalArray[2][1] = 0;

//        [[5,6],[56,63],[21,0]]

//        c) wprowadz indeks od uzytkownika i wyswietl element o tym indeksie na ekranie. Uwazaj by nie przekroczyc zakresu....

//        Scanner input = new Scanner(System.in);
//        int index = input.nextInt();
//        if (index < array.length) {
//            System.out.println(array[index]);
//        }

        // petla - moze wykonywac jakas instrukcje n razy

        // for ( licznik petli ; warunek ; zwiekszsenie licznika){
        //
        // }

        for (int i = 0; i < 10; i++) {          // deklaracja petli, licznik z wartoscia poczatkowa 0, dopoki licznik bedzie spelnial warunek to wykonaj, po wykonaniu zwikesz go
            System.out.println("Iteracja: " + i + " .  Wartosc: " + i);
        }
//        i = 0 System.out.println("Iteracja: "+ 0+ " .  Wartosc: "+ 0);
//        i = 1 System.out.println("Iteracja: "+ 1+ " .  Wartosc: "+ 1);
//        ...
//        i = 9 System.out.println("Iteracja: "+ 9+ " .  Wartosc: "+ 9);
//        i = 10 ale 10<10 dlatego KONIEC petli

//        Zadanie:
//        wyswietlic liczby parzyste od 0 do 50 (uzycie petli)

    }
}
