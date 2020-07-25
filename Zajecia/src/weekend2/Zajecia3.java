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


    }
}
