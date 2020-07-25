package weekend2;

public class Zajecia3 {
    public static void main(String[] args) {
        // operator trojargumentowy - uproszoczony if....

        String text = (5 < 4) ? "Prawda" : "Falsz";
        System.out.println(text);

//         skladnia
//         warunek ? wartosc_gdy_warunek_prawda : gdy_falsz.....

//         Zad.
//        a) zadeklarowac i zainicjowac dwie zmienne typu int...
//        b) okreslic zaleznosc miedzy nimi (>,<,=) i wyswietlic to na erkanie....

        int a = 10;
        int b = 18;

        String relation = (a > b && a < 20) ? "a>b" : (a < b ? "a<b" : "a=b");      // ify w tej postaci mozna zagniezdzac....
        System.out.println(relation);

        // String ciag dalszy....
        String text1 = "Hubert";

        if (text == "Hubert") {          // porownanie == generuje bledy.... dla typow obiektowych (!)

        }

        if (text.equals("Hubert")) {

        }

        String name = "a" + "b" + 'c';
        String name1 = "ab" + "c";

        if (name.equals(name1)) {               // bardzo wazne...
            System.out.println("Referencje sa rowne....");
        }

        if (name == name1) {
            System.out.println("Obiekty sa rowne....");
        }

        // string to typ obiektowy, == porownuje w tym przypadku (obiektowym) obiekty - czy text1 pokazuje w to samo wmiejsce w pamieci jak "Hubert"
        // trzeba uzyc metody equals wywolana na stringu - proownuje ona referencje czyli nazwy (pseudonimy)

        //endsWith

        if ("Hubert".endsWith("ert")) {
            System.out.println("Prawda...");
        }

        //substring, toLowerCase,toUpperCase

        //substring - dwie postaci - ucinanie stringow... zwraca nowego stringa....
//       a) postac z jednym arg - ucina od podanego indeksu do konca stringa....
//       b) postac z dwoma arg - ucina od podanego indeksu do podanego indeksu NIEwlacznie
        String text2 = "JakasNazwa";
        String text2Sub = text2.substring(5);           // postac a)
        System.out.println(text2Sub);
        text2Sub = text2.substring(5,9);                // postac b)
        System.out.println(text2Sub);

        // toLowerCase i toUpperCase
//        a) toLowerCase wyswietla caly napis w małych literach
//        b) toUpperCase wyswietla caly napis w postaci wielkich liter

        String text2LowerCase = text2.toLowerCase();
        System.out.println(text2LowerCase);

        System.out.println(text2.toUpperCase());

//         Zadanie
//         a) stworz Stringa ktorego wartosc zostanie pobrana od uzytkownika
//         b) jesli string bedzie rowny "upper" to wyswietl stringa w postaci wielkich liter
//         c) jesli String bedzie rowny "lower" to wyswietl stringa w postaci malych liter
//         d) jesli String bedzie zawieral wyrazenie "ok" ale nie bedzie się na nie konczyl to wyswietl napis: Zawieram wyrazenie ok ale nie na koncu. Zmodyfkijuj program tak aby mogl wyswietlic:
//        Zawieram wyrazenie ale na poczatku
//         e) jesli String bedzie rowny "find" to wtedy pozwol uzytkownikowi na wprowadzenie innego stringa, sprawdz czy on wystepuje w 1 stringu i od jakiego indeksu
//         f) jesli String bedzie inny niz powyzsze przypadki to wtedy wyswietl go od polowy, bez dwoch ostatnich znakow



    }
}
