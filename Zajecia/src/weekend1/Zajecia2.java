package weekend1;

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











    }

}
