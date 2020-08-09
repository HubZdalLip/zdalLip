package weekend2;

import weekend3.Computer;

import java.util.Arrays;
import java.util.Scanner;


public class Zajecia4 {
    public static void main(String[] args) {


        //petle cd.
//
//        for (int i = 50; i > 0; i = i - 3) {
//            System.out.println(i);
//        }
//
//        //i-- , i++                         //rownoznaczne
//        // i=i-1,  i=i+1
//        //10 = 10 -1      10=10+1
////        i=9              i=11
//
//        //zadanie wyswietlic na ekranie liczby od 100 do 0 z krokiem rownym 20
//
//        for (int i = 100; i >= 0; i = i - 20) {                 // konwencja, nazwa moze byc teoretycznie dowolna ale w malych petlach zaleca sie uzywac indeksow
//            // i, j, k , l, index
//            System.out.println(i);
//        }
//
//        //zakres danych
//
//        int x;                  // zmienna stworzona w danym bloku istnieje tylko w tym bloku i w blokach bardziej zagniezdzonych
//        if (true) {
//            x = 0;
//        }
//
//        System.out.println(x);
//
//        // petla II rodzaj
////        while(){
////
////        }
//        //skladnia
////        while(warunek){}
//        System.out.println();
//        System.out.println("To jest petla while");
//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);          // i = 10; i = 9
//            i--;                // tutaj UWAGA (do wyjasnienia) i = 10, i = 9
//            // i = 9;   , i = 8;
//        }
//
//        // zadanie wyswietlic liczby od 30 do 20 z krokiem 2 za pomoca petli while
//
//        i = 30; //nadpisanie
//        while (i >= 20) {
//            System.out.println(i);
//            i = i - 2;
//        }
//        //jesli chodzi o petle while to warunek sprawdzany jest NA POCZATKU
//
//        //roznica miedzy do-while a while jest taka ze sa one IDENTYCZNE oprocz tego ze do while wykona sie MINIMUM RAZ
//        // roznica druga - po napisaniu while musi byc srednik!!!!
//
//
//        do {
//            // operacje jakies
//            // jesli chcesz kontynuowac to nacisnij 1
//        } while (i > 0); // <- srednik
//
//
////        zadanie napisac program ktory bedzie wyswietlal na ekranie napis "Hello" do chwili gdy uzytkownik wpisze 1, jesli wpisze co innego kontynuowac
//
//        Scanner input = new Scanner(System.in);
//        int x1;
//        do {
//            System.out.println("Hello");
//            System.out.println("Czy chcesz kontynuowac??");
//            x1 = input.nextInt();   // tutaj uzytkownik wpisuje swoja wartosc... jesli 1 to w while 1!=1, jesli 2 != 1
//        } while (x1 != 1);  // czy 1 rozne od 1 ??? falsz...
//        System.out.println("Wyszedlem z petli");

//
//        // zadanie napisac program ktory bedzie wyswietlal kolejne liczby naturalne do chwili gdy uzytkownik wpisze koniec lub exit....
//        Scanner input = new Scanner(System.in);
//        int i = 0;
//        String text;                // nadrzednie tworze i oraz text poniewaz z koncem klamry niewidoczny bylby text(tyczy sie to zakresu)
//        do {
//            System.out.println(i);  //wyswietlamy liczbe natualrana
//            i = i + 1;              //zwiekszamy ja o 1
//            System.out.println("Czy chcesz zakonczyc");     //pytamy czy zakocnzycy
//            text = input.next();        //sciagamy od uzytkwonika wartosc
//        } while (!text.equals("koniec") && !text.equals("exit"));       //sprawdzamy czy nie rowna jest ona koniec i czy nierowna jest ona exit


        // zadanie napisac program ktory bedzie wyswietlal liczby w odpwoeidnim trybie:
        // a) jesli uzytkownik wpisze liczbe 1 to wyswietla mu sie liczby od 1 do 10        - (uzyc for) wewnatrz jednej iteracji nalezy wywolac petle ktora wyswietli liczby....
        // b) jesli wpisze 2 to od 1 do 50 ale tylko podzielne przez 10
        // c) jesli wpisze 3 to koniec programu....

//        for (int j = 0; j < 10; j++) {
//            for (int k = 0; k < 10; k++) {
//                System.out.println("Nadrzedny licznik j " + j);
//                System.out.println("    Podrzedny licznik k " + k);
//            }
//        }


//        Scanner input = new Scanner(System.in);
//        int numberFromUser;                 // liczba od usera
//        do {
//            System.out.println("Jaki wybrac tryb: 1 , 2 , 3");
//            numberFromUser = input.nextInt();               //wybranie trybu
//            if (numberFromUser == 1) {                      //podpunkt a)
//                for (int i = 1; i <= 10; i++) {             // petla wyswietlajaca liczby od 1 do 10
//                    System.out.println(i);
//                }
//            } else if (numberFromUser == 2) {               //podpunkt b)
////                for (int i = 10; i <= 50; i = i + 10) {       //alternatywa...
////
////                }
//                for (int i = 1; i <= 50; i++) {
//                    if (i % 10 == 0) {
//                        System.out.println(i);
//                    }
//                }
//            }
//
//        } while (numberFromUser != 3);                  // jesli liczba od usera rowna 3 to falsz bo 3 nie jest rozne od 3


//        zadanie napisasc program ktory w petli bedzie pytal uzytkownika o tryb:
//        a) jesli bedzie rowny "parzyste" to spyta o zakres gorny petli , np parzyste, 10 => 0,2,4,6,8,10
//        b) jesli bedzie rowny "nieparzyste" to spyta o zakres gorny petli , np nieparzyste, 8 => 1,3,5,7
//        c) jesli bedzie rowny exit/wyjdz/koniec to zakonczy dzialanie programu.... UWAGA! podpunkt c) powinien dzialac dla wyrazow takze z rozna wielkoscia znakow
//                  ExiT, WYJDZ,kONiEc .... WSKAZOWKA: cofnac sie do zajec nr 3 i sprawdzic metody ktore wykorzsytywalismy ze stringami....
//
//        jesli wynik (tryb) jest inny, nie rob nic
//
//        algorytm

//        1. pytaj o tryb
//        2. jesli tryb jest przypisany do jakiejs akcji to spytaj o gorny zakres petli, wywloaj inna petle
//        3. spraw aby wybrany tryb zostal na poczatku zmodyfikowany tak, aby pasowal... jesli tryb bedzie rowny warunkom z c) to wyjdz....
//        4. do innego trybu nie przypisuj nic, powrot do 1)
//

//        Scanner inputFromUser = new Scanner(System.in);
//        String selectedMode = "";       // poczatkowo wartosc domyslna....
//        int upperLimit = 0;
//        do {
//            System.out.println("Podaj tryb");
//            selectedMode = inputFromUser.next();    // wystarczy do znaku bialego zczytac....
//            switch (selectedMode) {
//                case "parzyste":
//                    System.out.println("Podaj gorny limit");
//                    upperLimit = inputFromUser.nextInt();
//                    inputFromUser.nextLine();
//                    for (int i = 0; i <= upperLimit; i++) {
//                        if (i % 2 == 0) {
//                            System.out.println(i);
//                        }
//                    }
//                    break;
//                case "nieparzyste":
//                    System.out.println("Podaj gorny limit");
//                    upperLimit = inputFromUser.nextInt();
//                    inputFromUser.nextLine();
//                    for (int i = 0; i <= upperLimit; i++) {
//                        if (i % 2 != 0) {
//                            System.out.println(i);
//                        }
//                    }
//            }
//            selectedMode = selectedMode.toLowerCase();
//
//        } while (!selectedMode.equals("exit") && !selectedMode.equals("wyjdz") && !selectedMode.equals("koniec"));


//        Zadanie napisz program ktory bedzie w zaleznosci od trybu (String) :
//        a) dodaj  => pytal o dwie liczby typu int i wyswietlil sume
//        b) odejmij => pytal o dwie liczby typu int i wyswietlil roznice
//        c) koniec => konczy dzialanie programu....

//        for (licznik; WARUNEK WYKONANIA PETLI => ile razy ma sie petla wykonac ??? nie implementowac logiki w tym miejscu; i++)

//        Scanner inputFromUser = new Scanner(System.in);
//        String selectedMode;
//        int number1, number2;
//        do {
//            System.out.println("Wybierz tryb");
//            selectedMode = inputFromUser.next();
//            switch (selectedMode) {
//                case "dodaj":
//                    System.out.println("Podaj liczbe 1");
//                    number1 = inputFromUser.nextInt();
//                    System.out.println("Podaj liczbe 2");
//                    number2 = inputFromUser.nextInt();
//                    inputFromUser.nextLine();
//                    System.out.println("Wynik to: " + (number1 + number2));
//                    break;
//                case "odejmij":
//                    System.out.println("Podaj liczbe 1");
//                    number1 = inputFromUser.nextInt();
//                    System.out.println("Podaj liczbe 2");
//                    number2 = inputFromUser.nextInt();
//                    inputFromUser.nextLine();
//                    System.out.println("Wynik to: " + (number1 - number2));
//            }
//        } while (!selectedMode.equals("koniec"));


//        Zadanie napisz program ktory wyswietli liczby podzielne przez 2 lub 3 poczawszy od 1 a konczywszy na 50
        // break - wychodzi z instrukcji.... tyczy sie to rowniez petli
        // continue - wychodzi z iteracji....

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) { // 0,1,2,3,4 nie wchodzi do ifa
//                break; // wymus zakonczenie petli
//            }
//            System.out.println(i);
//        }
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            if (i == 5 || i == 7) { // gdy i = 5 to continue (anulowanie OBECNEJ (T Y L K O) iteracji
//                continue;
//            }
//            System.out.println(i);
////            System.out.println();
////            System.out.println(
////                    ddfgdfgdf                     // JAKIS DLUGI KOD
////            );
////            dfgdf
////                    dgdfgdf
////
//        }

//        Zadanie napisz program ktory wyswietli liczby podzielne przez 2 lub 3 poczawszy od 1 a konczywszy na 50

//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                continue;                         //unikanie podwojnych wywolac dla liczb podzielnych przez 2 i 3, np 6, 12...
//            }
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        // zadanie napisz program gdzie zczytasz od uzytkownika liczbe w petli i ja wyswietlisz... Jesli bedzie rowna 5 to skoncz petle

//        Scanner input = new Scanner(System.in);
//
//        while (true) {
//            int number = input.nextInt();
//            if (number == 5) {
//                break;          // gdy wprowadzona liczba rowna 5 to anulujemy petle/isntrukcje....
//            }
//            System.out.println(number);
//        }

        //i++,i--
//        i++ - postinkrementacja....
//        i++ == i=i+1
//        int i = 0;
//        System.out.println(i);
//        System.out.println(i++);        // odwolaj sie do wartoscu aktualnej a NASTEPNIE ja zwieksz
//        System.out.println(i);
//
//        i = 0;
////        i--   postdekrementacja... => wywolaj/odwolaj a nastpenei zmneijsz....
//        System.out.println(i--);
//        System.out.println(i--);
//        System.out.println(i);
//
////       ++i preinkremetnacja  => zwieksz wartosc a nastepnie sie odwolaj
////       --i predekrementacja => zmniejsz wartosc => odwolaj sie
//
//        i = 0;
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(--i);
//
////       i = i+1;           NIE ISTNIEJE takie cos jak i+1=i    /=       ++i
////       i = i+2;
//        i = 0;
//        i = i + 2;  // mozna uproscic....
//        System.out.println(i);
//        i += 2;     // mozna uznac ze to to samo co i=i+2
//        System.out.println(i);
//
//        i -= 2; // to samo co i=i-2
//        System.out.println(i);
//
//        i *= 3; // to samo co i=i*2
//        System.out.println(i);
//
//        i /= 6; // to samo co i=i/6
//        System.out.println(i);
//
//        i = +1; // poniewaz wskazujemy (nie wiadomo po co tak naprawde...) ze liczba jest dodatnia... samo wskazania 1 juz kompilaotrowi wystarcza....
//        System.out.println(i);

        //metody - co to?
//      powiedzmy mamy sytuacje ze tworzymy skomplikowany algorytm wykonujacy jakas operacje.... zajmuje on 500 linii kodu....
//      poweidzmy mamy 3 ify gdzie z niego korzystami....
//        mozna wydzielic ten algorytm do metody.....
//        i = 1;
//        if (i==1){
//            doSthVeryComplexAlgorithm();
//        }else if(i==2){
//            doSthVeryComplexAlgorithm();
//        }else if(i==3){
//            doSthVeryComplexAlgorithm();
//        }

//        printHelloWorld5Times();
//        printHelloWorld5Times();
//        printHelloWorld5Times();
//        printHelloWorld5Times();
//        printHelloWorld5Times();

//        skladnia
//        nazwa metody => zawiera duzo czasownikow
//        modyfikator dostepu   static/NIC (poki co static zawszse)    typ_zwracany     nazwa_metody (zestaw_agrumentow => 1 argument, 2 arguemnt.... n argument){
//
//    return // opcjonalny....
//    }
//
//    void - typ ktory NIC nie zwraca.... po prostu wykonuje swoje....
//    typ zwracany to jest typ podstawowy/obiektowy....

//        przyklad.... napisz metode ktora zwroci liczbe 100
//        int number100 = getNumber100();  // ta metoda po zwroceniu bedzie tym co zwroci... => 100
//        System.out.println(number100);
//
//        int sum = addTwoNumbersInVeryComplexWay(6, 8);  // wysylamy do metody parametry nieformalne == aktualne
//        System.out.println(sum);
//        System.out.println(addTwoNumbersInVeryComplexWay(10, 50));
//        addTwoNumbersInVeryComplexWay(10, 0);
//        System.out.println(addTwoNumbersInVeryComplexWay(1, 10));
//
////        przyklad... podaj imie do metody... zwroc napis Witaj (imie)
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Podaj imie");
//            String name = scanner.next();   //czytamy imie
//            if (name.equals("Koniec")) {
//                break;
//            }
//            System.out.println(getWelcomeInformation(name));    // parametr aktualny... //wysylamy do metody imie , TERAZ BEDZIEMY W METODZIE.... znowu jestemy w metodzie main... teraz ta metoda sie staje tym co zwrocilismy....
//        }

        // zadanie
        // a) stworz metode getInfoAboutUser
        // b) ma ona przyjmowac parametr typu int okreslajacy wiek oraz String okreslajacy imie
        // c) ma ona zwracac napis: Mam (wiek) lat. Moje imie to (imie).
        // d) wywolac metode dla 3 zestawow parametrow..

//
//        String takenInfo1 = getInfoAboutUser(10, "Marek");
//        String takenInfo2 = getInfoAboutUser(15, "Piotrek");
//        String takenInfo3 = getInfoAboutUser(25, "Natalia");
//        System.out.println(takenInfo1);
//        System.out.println(takenInfo2);
//        System.out.println(takenInfo3);
//
//        // zadanie
        // a) stworz metode getCharsInSpecificWay
        // b) metoda musi przyjac 4 argumenty... pierwsze trzy arguemnty do znaki, ostatni argument to zmienna typu boolean
        // c) zwroc i przypisz do Stringa wynik metody => wynik ma byc scaleniem trzech znakow, typ boolean okresli kolejnosc
        //  true to kolejnosc znak1+znak2+znak3
        //  false to kolejnosc ODWROTNA
        //  wskazowka automatyczne castowanie charow ( i nie tylko ) na stringa odbywa sie gdy doda sie pusty cudzyslow....
//        input: z,a,t,true
//        output: zat
//        input: a,b,c,false
//        output: cba
//        String text = getCharsInSpecificWay('z', 'a', 't', true);   // nazwa metody staje sie tym co zwrocila czyli scalownym tekstem
//        System.out.println(text);
//        text = getCharsInSpecificWay('a', 'b', 'c', false);
//        System.out.println(text);

        // zadanie
        // a) napisz metode o nazwie showNTimes
        // b) metoda przyjmie parametr ilosci wywolac
        // c) metoda wyswietli napis "I am in method." tyle razy ile wynosi parametr
        // wskazowka - uwazaj na typ zwracany => void
        // input: 3
        // Output:
        // I am in method.
        // I am in method.
        // I am in method.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj liczbe wywolan");
//        int howManyTimes = input.nextInt();
//        showNTimes(howManyTimes);

//        int[] array = {4, 3, 3, 10, -5};
//        System.out.println(showAverage(array));
//
//        int[] takenArr = getArray(4, 6, 3);
//        System.out.println(takenArr[1]);
//
//        // typ... (np. int... ) moze wystapic TYLKO w definicji metody jako arg formalny, oznacza on NIEOKRESLONA liczbe elementow (np. int). Autoamtycznie staje to tablica.....
//        int[] array1 = getArray2(4);
//        int[] array2 = getArray2(5,4,6,8);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

        //wywolania do pracy domowej....

//        zad5Mod1();
//        zad2Mod2();
//        zad4Mod2();
//        zad5Mod2();
//        zad2Mod3();
//        zad5Mod3();
//        zad1Mod4();
//        zad2Mod4(); // malejaco....

//        Computer computer = new Computer("","",0);
//        computer.ip; // nie moglbym bo dostep prywatny/defaultowy.... uzpelnienie do zajecia6
//

    }

    private static void zad2Mod4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");       //  a)
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj element o " + i + " indeksie...");
            array[i] = scanner.nextInt();
        }
        int[] sortedArray = sortArray(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
            // [1,4,6,2,8] => [4,6,1,8,2] => [6,4,8,2,1] => [6,8,4,2,1] => [8,6,4,2,1]
        }
        return array;
    }

    private static void zad1Mod4() {
//        Napisz metodę, która przyjmie argument będący ilością elementów w tablicy.
//        Następnie zwróci tablicę typu int wypełnioną wybranymi przez Ciebie różnymi od siebie wartościami.
//        Następnie napisz kolejną metodę pozwalającą wypisać najmniejszy i największy element tablicy


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");       //  a)
        int n = scanner.nextInt();

        int[] array = createArray(n);
        System.out.println(Arrays.toString(array));


    }

    private static int[] createArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj element o " + i + " indeksie...");
            array[i] = scanner.nextInt();
        }
        System.out.println("Element max to " + max(array));
        System.out.println("Element min to " + min(array));
        return array;
    }

    private static int min(int[] array) {
        int min = Integer.MAX_VALUE; //stala....
        //array={1,2,5,2,7}
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    private static int max(int[] array) {
        int max = Integer.MIN_VALUE; //stala....
        //array={1,2,5,2,7}
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static void zad5Mod3() {
//        Napisz metodę, która pobiera n i wyświetla tablicę o n elementach. Elementy w tablicy powinny spełniać równanie tab[i] = iEi
//        np. n = 5
//        Output: [0, 10, 200, 3000, 40000]

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");       //  a)
        int n = scanner.nextInt();
        int[] array = new int[n];
        int temp = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                temp *= 10; // 1 , 10, 100, 1000, 10000
            }
            temp *= i; // 0,1,2,3,4,
            // =>  0, 10, 200, 3000, 40000
            array[i] = temp; // zamaist temp mozna dac tutaj temp*i i wtedy linijka wyzej temp*=1 jest zbedna....
            //wartosc tymczasowa musi byc zresetowana..... by wewnetrzna petla mogla wykonac sie prawdilowa ilosc razy.....
            temp = 1;
        }
        System.out.println(Arrays.toString(array));
    }


//
//    int temp = 1;
//    int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//        for (int j = 0; j < i; j++) {
//            temp *= 10;
//        }
//        array[i] = temp * i;
//        temp = 1;
//    }
//        System.out.println(Arrays.toString(array));

    private static void zad2Mod3() {
//        Napisz program który wyświetli na ekranie kwadrat o zadanym boku n
//        Output: n=4
//                *  *  *  *
//                *        *
//                *        *
//                *  *  *  *

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");       //  a)
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*  ");
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*  ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("   ");
            }
            System.out.print("*  ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*  ");
        }

    }

    private static void zad5Mod2() {
//        5. Napisz program, w którym:
//        a) stworzysz zmienną int i nadasz jej wartość pobraną od użytkownika
//        b) narysujesz tabliczkę mnożenia od 1 do wartości z a).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");       //  a)
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j * i + " \t");
            }
            System.out.println();
        }

    }

    private static void zad4Mod2() {
        //    Napisz program liczący silnię dla n wskazanego przez użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");
        int n = scanner.nextInt();
        int factorial = 1;
        // 4! = 1*2*3*4
        // n! = 1*2*...*(n-1)*n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Wartosc silni to " + factorial);

    }


    private static void zad2Mod2() {
        //    Napisz program który:
//    a) za pomocą pętli wyświetli na ekranie kolejne liczby naturalne od 1 do 10
//    b) dla liczb podzielnych przez 2 wyświetli stosowny komunikat
//    c) wyświetli na ekranie sumę liczb podzielnych przez 3

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 2!!");
            }
            if (i % 3 == 0) {
                sum += i; // sum = sum + i
            }
        }
        System.out.println("Suma to: " + sum);

    }

    private static void zad5Mod1() {
        //    5.  Napisz program wypisujący elementy tablicy arr={1,5,2,7,3} począwszy od końca za pomocą pętli
        int[] arr = {1, 5, 2, 7, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - 1 - i]);            //to podejscie jest zalecane.... poniewaz zdecydowanie czesciej petle sa inkrementowane
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static int[] getArray2(int... arr) {
        // w tym miejscu java patrzy na ilosc argumnetow wyslanych do metody...
        // nastepnie tworzy tablice stworzona z tych elementow
        // teraz arr oznacza to samo wlasciwie co int[]
        return arr; // zwracamy tablice (!)
    }

    private static int[] getArray(int n1, int n2, int n3) {
        int[] array = new int[3];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        return array;// tablice zwracamy odwolujac sie jedynie do jej nazwy...
    }

    private static double showAverage(int[] array) {
        System.out.println(Arrays.toString(array)); // tablica tutaj jest!
        int sum = 0;
        double averageValue;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("Teraz suma wynosi : " + sum);
            // sum =sum +array[0] (4) => 0 = 0 +4  => sum =4
            // 4 = 4 + array[1] => 4=4+3  => sum = 7
            // 7 = 7 +array[2] => sum = 9
        }

        double numberOfElements = array.length;
        averageValue = sum / numberOfElements;      // liczmy srednia : suma/ilosc elementow
        return averageValue;
    }

    private static void showNTimes(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("I am in method");
        }
    }

    private static String getCharsInSpecificWay(char z1, char z2, char z3, boolean order) {
        String text;    // deklaracja wynika, wartosc poczatkowa null
        if (order) {    // jesli order == true to kolejnosc rosnaca
            text = "" + z1 + z2 + z3;
        } else {        // jesli order == false to kolejnosc odwrotna
            text = "" + z3 + z2 + z1;
        }
        return text;    // zwracanie...
    }

    private static String getInfoAboutUser(int age, String name) {
        return "Mam " + age + " lat. Moje imie to " + name;
    }

    private static String getWelcomeInformation(String formalName) {  //parametr formalny...    //PRZJEMUJEMY PARAMETR...

        return "Hello " + formalName;                           //zwracamy co chcemy
    }

    private static int addTwoNumbersInVeryComplexWay(int number1, int number2) {        // arguemnty formalne
        System.out.println(number1);
        System.out.println(number2);
        return number1 + number2;
    }

    private static int getNumber100() {
        return 100;
    }

    public static void doSthVeryComplexAlgorithm() {
        System.out.println("Bardzo dlugie obliczenia");
    }

    public static void printHelloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
//    public static void indexOf(){
//
//    }
//    public static void equals(){
//
//    }


}
