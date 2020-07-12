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


    }

}
