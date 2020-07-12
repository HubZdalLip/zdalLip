package weekend1;

import java.util.Locale;
import java.util.Scanner;

public class Zajecia2 {
    public static void main(String[] args) {
        System.out.println("Im in Zajecia2");

        // Jest możliwosc zmiany metody uruchomieniowej main poprzez nacisniecie przy niej zielonej strzalki i wybranie opcji Run. DO weryfikacji wystarczy spojrzec w prawym gownym rogu i zoabczyc aktualna kofniguracje (tutaj Zajecia2)


        // TYPY: proste (podstawowe), referencyjne (obiektowe)
//      1. Typy proste

//        a) int - (integer) pozwala przechowywac wartosc liczby calkowitej (najczesciej uzywany, zakres zmiennej podstawowy) 2^32 (domyslny)
//        b) short - zmienna pozwalajaca przechowywac wartosci liczb calkowitych o zmniejszonym zakresie, -32768; 32767
//        c) byte - zmienna pozwalajaca przechcowywac wartosci liczb calkowitych o malym zakresie -128 ; 127
//        d) boolean - zmienna pozwalajaca przechcowywac wartosc prawdy lub falszu , przyjmuje wartosci TYLKO true, false
//        e) long - zmienna do liczb calkowitych o zakresie dlugim (!) 2^64
//        f) double - zmienna przechowujaca liczby zmiennoprzecinkowe o duzej dokladnosci ( domyslny typ zmiennoprzecinkowy)
//        g) float - zmienna przechowujaca liczby zmiennoprzeicnkowe o mniejszej dokladnosci (raczej nieuzywany)
//        h) char - zmienna przechowujaca (!) pojedynczy (!) znak np c, z

        int intValue = 150; // TYP_ZMIENNEJ nazwa_zmiennej = wartosc_zmiennej
        System.out.println(intValue);
        short shortValue = (short) 120000;  // w nawiasie short oznacza ze za wszelka cene chcemy uzyskac typ short ze zmiennej innej typu
        short maxShortValue = (short) 32769; // max value = 32767 ////// 32768 - maxvalue = 1 //// przesuwamy wartosc o 1 miejsce nastepne mozliwe,
        System.out.println(maxShortValue);
        System.out.println(shortValue);
        short someVariableToSum = 100;
        short anotherVariableToSum = 50;
        short resultValue = (short) (someVariableToSum + anotherVariableToSum);   // PROGRAM PESYMISTYCZNIE zaklada ze przekroczymy dopuszczalna wartosc
        System.out.println(resultValue);
        byte verySmallValue = (byte) 128;       // ruztowanie na typ byte pozniewaz wartosc 128 nie meisci sie w zakresie
        System.out.println(verySmallValue);
        boolean condition = false;      // mozliwa TYLKO jeszcze jedna wartosc (true)
        System.out.println(condition);
        long someLongValue = 1000000000000L;    // aby wyswietlic na ekranie longa to przy przypisaniu wartosc do zmiennej nalezy dodac na koncu litere L
        System.out.println(someLongValue);
        double numberWithSthAfterComa = -5.123;
        System.out.println(numberWithSthAfterComa);
        float anotherValueFloat = 4.1f;         // aby wyswietlic na erkanie float to przy przypisaniu dodac literke f na koncu
        System.out.println(anotherValueFloat);
        char character = 'z';                   // UWAGA roznica miedzy string a char to char przechowuje jeden znak, jest typem prostym,  zapis w apostrofach
        System.out.println(character);

        //przyklad
        String nameOfProduct = "mleko";
        int priceOfProduct = 2;
        System.out.println("Kupilem wczoraj " + nameOfProduct + ". Zaplacilem " + priceOfProduct + " zl");
        // do metod wyswietlajacych mozna wrzucic kombinacje typow

        // Zadanko
//       Stworzyc zmienna okreslajaca imie i okreslajaca wiek oraz wyswietlic taka informacje na erkanie
//       Output: Mam na imie (imie). Mam (wiek) lat.

        String name = "Hubert";
        int age = 22;
        System.out.println("Mam na imie " + name);
        System.out.println("Mam " + age + " lata");

        // rzutowania TYP_ZMIENNEJ_1 nazwa_zmiennej = (TYP_ZMIENNEJ_1) wartosc_zmiennej_innego_typu

        // Zadanie, stworzyc zmienna typu double, wyswietlic na ekranie jej wartosc calkowita. Wskazowka: uzyc rzutowania

        double doubleVar = 5.123;
        int doubleResultAsInteger = (int) doubleVar;
        System.out.println(doubleResultAsInteger);

        // zadanie
        // stworzyc zmienna typu float, short, i byc moze inne jesli to konieczne oraz wyswietlic ich sume na ekranie.
        //
        float floatVar = 10.3f;
        short shortVar = 10;
        System.out.println(floatVar + shortVar);        // zachodzi niejawna konwersja, nie ma bledu poneiwaz nie ma ryzyka utraty informacji


        // Operatory matematyczne
        // + - * / %
        int resultOfSum = 10 + 40;
        int anotherResult = resultOfSum + 100;
        System.out.println(-1 + 4);
        int substract = 40 - 10;
        double doubleSub = 10.4 - 5.32;
        System.out.println(doubleSub);

        double doubleVar1 = ((5 + 10) / 4.0) * 2;
        System.out.println(doubleVar1);

        // operator modulo - operator reszty z dzielenia

        System.out.println(5 % 3);      // 5/2 = 2.5 reszta 1 //////  4/2 = 2 , reszta 0        // 5/3 =... reszta z dzielenia to 2


        // systemy matematyczne
//        a) domyslnie jest to system dziesietny
//        b) system osemkowy, przyklad int octalSystem = 010            // aby wywolac na poczatku zmiennej cyfra 0
//        c) system heksadecymalny, przyklad int hexSys = 0xA10;        // aby wywolac na poczatku zmiennej 0x

        int octalSy = 0130;      //     0 pomijane ... obliczamy 130 (osemkowo) 0 * 8^0 + 3 * 8^1 + 1 * 8^2 = 88
        System.out.println(octalSy);

        int hexSys = 0xA14; // 0x pomijane , to tylko info o danym systemie (hex)
//        A = 10  , A jest na trzecim miejscu od prawej, 0,1,2     A * 16^2
//        1 , drugie miejsce , wartosc wykaldnika 1,   1*16^1
//        4, pierwsez miejsce, wartosc wykaldnika 0    4*16^0
        System.out.println(hexSys);     // wartosc max to F ... 0-9 A-10, B-11, C- 12, D-13, E-14, F-15  ..............4* 16^0 + 1*16^1 + 10*16^2

        // 0xF - 15 ........ 0x10
        System.out.println(0xF + 10 + 010);     // 1* 8 ^1 bo miejsce jest drugie od prawej czyli wykladnik zmiejszony o 1 czyli 1 + 0* 8^0 bo ma miejsce pierwsze czyli wykladnik 0


        // String jest typem referencyjnym to posiada tzw metody.
        String text = "Hubert";
        int numberOfCharsInMyName = text.length();  // aby wywolac metode na typie (obiektowym, referencyjnym, zlozonym ), (na prostym sie nie da) nalezy po nazwie zmiennej napisac kropke a dalej nazwe metody zakonczona nawiasami (pustymi lub nie)
        System.out.println(numberOfCharsInMyName);
//        length zwraca faktyczna dlugosc stringa
//        litery w Stringu numerujemy od 0

        char charAtIndex = text.charAt(3);
        System.out.println(charAtIndex);
//        H - 0
//        u - 1
//        b - 2
//        e - 3
//        r - 4
//        t - 5

        int indexOfCharE = text.indexOf('e');
        System.out.println(indexOfCharE);

//        Zadanie
//        Napisz program w którym należy:
//        a) stworzyć zmienną typu int "z2i", zainicjalizować ją jakąś wartością
//        b) stworzyć zmienną typu String "z2str", zainicjalizować ją jakimś łańcuchem znaków (tekstem, literalem)
//        c) stworzyć zmienną typu short "z2s", przypisać do niej długość Stringa "z2str"
//        Uwaga, będzie trzeba użyć rzutowania (short)
//        d) stworzyć zmienną typu char "z2c", przypisać do niej znak znajdujący się w stringu
//        "z2str" stojący na pozycji o indeksie "z2i"
//        e) wyświetlić wartości zmiennych "z2i", "z2str", "z2s", "z2c"

        int z2i = 10;                           // a)
        String z2str = "Mam na imie Hubert";    // b)
        short z2s = (short) z2str.length();     // c)
        char z2c = z2str.charAt(z2i);           // d)
        System.out.println("Odpowiedzi:");
        System.out.println("a) " + z2i);
        System.out.println("b) " + z2str);
        System.out.println("c) " + z2s);
        System.out.println("d) " + z2c);

//       Zadanie 2
//       Napisz program w ktorym nalezy:
//        a) stworzyc zmienne typu int i String oraz je zainicjalizowac
//        b) stworzyc zmienna typu char i nadac jej jakis znak (jaki to zostanie wywnioskowane na podstawie pzoostalych pkt)
//        c) dowiedziec sie na ktorym indeksie jest znak zadany w b) w stringu z podpkt a)
//        d) przypisac ta wartosc ( c) ) do zmiennej typu int z pkt a)
//        e) wyswietlic wartosci na ekranie
//

        int var = 10;   //a)
        String text2 = "Jakis tam string "; //a)
        char charFromText2 = 'i';   //b)
        var = text2.indexOf(charFromText2); //c) i d)
        System.out.println(var);    //e)


        // Instrukcje warunkowe

//        if else
//        if (warunek (zmienna typu boolowskiego, prawda, lub falsz) ) { }

        if (true) {                                             // jesli prawda to sie wykona
            System.out.println("Prawda");
        }
        if (5 > 4) {                                            // jest 5 jest wieksze od 4 to niejawnie wartosc boolowska wynosic bedzie prawda
            System.out.println("Prawda");
        }

        int i = 10;
        boolean condition2 = i > 0 && i < 10; // == operator przyrownania                 // wartosc typu boolean to prawda lub falsz ale moze ona byc obliczana dynamicznie
        if (condition2) {                                                           // if (wartosc boolean jawna)
            System.out.println("i jest rowne 10 ");
        } else {                                                                    // else wywola sie tylko jak wartosci wszystkich if (razem z else if , wykonuja sie one po kolei) jest falsz
            System.out.println("i nie jest rowne 10 ");
        }


        if (i > 5) {                                                                // wartosc boolean niejawna
            System.out.println("i wieksze od 5");
        } else if (i > 0) {
            System.out.println("i jest chociaz wieksze od 0");
        } else {
            System.out.println("i nie jest nawet wieksze od 0 ");
        }

        // operatory logiczne && ( i ), || (albo) , ! (nie) , &, |

        if (i > 5 && i < 10) {   // koniunkcja czyli wszystkie warunki maja miec wartosc prawdziwa
            System.out.println("i jest wieksze od 5 i mniejsze od 10");
        }
        if (i > 5 || i < -100) {        // alternatynwa , jedno z wyrazen musi byc prawdziwe
            System.out.println("i jest wieksze od 5 lub mniejsze od -100");
        }

        i = 10;
        boolean cond3 = i > 5;
        if (!cond3) {           // negacja, czyli prawda -> falsz .... falsz -> prawda
            System.out.println("i nie jest wieksze od 5");
        } else {
            System.out.println("Blok else");
            System.out.println("i jeset wieksze od 5");
        }

        if (i != 10) {          // jesli NIE jest rowne
            System.out.println("i jest rozne od 10");
        } else {
            System.out.println("i jest rowne 10");
        }

        // koniunkcja ma wyzszy priorytet od alternatywy

        // Zadanie
        // a) stworzyc zmienna String zaweirajaca imie
        // b) jesli imie ma wiecej niz 5 znakow to wyswietl napis: Moje imie ma wiecej niz 5 znakow
        // c) jesli imie ma rowno 5 znakow to wyswietl napis: moje imie ma rowno 5 znakow
        // d) jesli imie ma mniej niz 15 i wiecej 3 znaki to wyswietl napis: Moje imie ma normalna dlugosc
        // e) jesli imie ma mniej niz 3 znaki albo wiecej niz 15 to wyswietl napis: Moje imie jest dziwne

        String myMutableName = "Hubert";
        int lengthOfName = myMutableName.length();


        System.out.println("\n\n\nZadanko iff");
        if (lengthOfName < 15 && lengthOfName > 3) {
            if (lengthOfName > 5) {
                System.out.println("Moje imie ma wiecej niz 5 znakow");
            } else if (lengthOfName == 5) {
                System.out.println("Moje imie ma dokladnie 5 znakow");
            } else {
                System.out.println("Moje imie ma normalna dlugosc");
            }
        } else {
            System.out.println("Moje imie jest dziwne");
        }

        // instrukcje warunkowe cz. 2
        // switch - troche jak if ale czasami skraca kod. UWAGA!!! swtich w swoich case przyjmuje tylko wartosci stale

        String surname = "Kowalski";

        switch (surname) {      // sprawdzaj przypadki w zalendzosci od zmiennej surname
            case "Nowak":
                System.out.println("Halo, jestem Nowak");
                break;
            // przrwij dzialanie danego bloku
            case "Kowalski":
                System.out.println("Jestem Kowalski");
                break;
            case "asd":
                System.out.println("asd");
            case "asdasdas":
                System.out.println("asdasd");
            default:
                System.out.println("Moje nazwisko jest tajemnicze");
        }

        int var1 = 2;

        switch (var1) {
            case 1:                 // jako case M U S I  byc stala
            case 2:                 // brak break co oznacza przejscie po nastepnych casach od miejsca wejscia w case np var =2 to case 2 , case 3 , case 4 az do break
            case 3:
            case 4:
                System.out.println("Liczba ma wartosc 1 lub 2 lub 3 lub 4. Nie wiem dokladnie co, tak dziala switch");
                break;              // zakocnzenie switcha
            case 5:
                System.out.println(" liczba wynosi 5");
                break;
            default:                        // zaden case nie pasuje
                System.out.println("Cos innego");
        }

        // Wpisanie tekstu z klawiatury
        Scanner dowolnaNazwa = new Scanner(System.in).useLocale(Locale.ENGLISH);       // linijka tworzaca "zmienna" odpowiedzialna za wyczytanie tesktu wpisanego z klawiatury

//        // wpis z klawy !!!
//        String inputFromKeyboard = dowolnaNazwa.nextLine();
//        System.out.println(inputFromKeyboard);

//        .nextLine() odpowiada za zczytanie wartosci linii i konwersja jej do wartosci String
//        .next() odpowiada za zczytanie wartosci linii ALE az do pierwszej spacji. Tez jeset to wartosc String
//        System.out.println("Prosze wpisac imie");
//        String name1111 = dowolnaNazwa.next();
//        System.out.println(name1111);
        // . nextInt(); odpowiada za zczytanie wartosci int i konwersje do typu int
        // . nextDouble()...........
//        System.out.println("Prosze wpisac imie!!");
//        String name1111 = dowolnaNazwa.next();
//        int lengthOfName1111 = name1111.length();
//
//        switch (lengthOfName1111) {
//            case 10:
//                System.out.println("Imie wpisane z klawiatury ma 10 znakow");
//                break;
//            case 4:
//                System.out.println(" -||- 4 znaki");
//                break;
//        }

        // zadanie
        // Stworzyc program ktory zczyta z kalwiwtury liczbe calkowita, przypisze ja, a nastepnie poprosi o zczytanie nastepnej liczby,
        // tez ja przyspisze (stworzy) a na ekranie zostanie wyswietlona suma tych liczb

//        System.out.println("Prosze wpisac liczbe 1");
//        int number1 = dowolnaNazwa.nextInt();
//        System.out.println("Prosze wpisac liczbe 2");
//        int number2 = dowolnaNazwa.nextInt();
//        int sum = number1 + number2;
//        System.out.println("Suma wynosi: " + sum);

        System.out.println(dowolnaNazwa.nextDouble() - 5.0);




    }

}
