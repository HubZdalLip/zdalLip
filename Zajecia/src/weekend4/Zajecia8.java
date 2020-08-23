package weekend4;

import java.util.*;

public class Zajecia8 {
    public static final Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
    public static final Random random = new Random();


    public static void main(String[] args) {
//        exWithShape();
//        collections();
        exceptions();


    }

    private static void exceptions() {
//        try {
//        exceptionsTheory();
//        } catch (InputMismatchException e) {
//            System.out.println("Podales litere");
//        }

//        exWithException1();
        exWithException2();

    }

    private static void exWithException2() {

        //zadanie: napisac program ktory poprosi uzytkwonika o podanie godziny (bez minut).
//        Jesli bedzie ona niepoprawna pod katem wpisanych znakow to przechwyc wyjatek
//        Jesli bedzie ona nieporpawna pod katem godziny tj godzina -3 itp to przechwyc wlasny wyjatek
//        Dodaj blok ktory tak czy inaczej pozegna Cie komunikatem: Do zobaczenia jutro!
//        Stworz wlasne komunikaty!

        System.out.println("Podaj godzine ");

        int hour;
        try {
            hour = scanner.nextInt();

            if (hour < 0 || hour > 24) {
                throw new InvalidHourException("Podales zla godzine!");
            }
            System.out.println("Podana godzina to " + hour);

        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Zla godzina!!");
        } finally {
            System.out.println("Do zoabczenia jutro!");
        }
    }

    private static void exWithException1() {
//        a)Stwórz tablice tylu elementow ile chce uzytkownik
//        b)Zainicjalizuj je wartosciami int (w petli)
//        c)wylosuj kilka wartosci, losuj zawsze w zakresie od 1 do 50
//        d)losuj do chwili az wylosujesz 3 elementy, ktore zwrocisz w nowej strukturze.

        System.out.println("Ile ma być elem w tablicy");
        int numberOfElements;
        try {
            //niebezpiczena operacja - uzytwkonik moze dac np litere
            numberOfElements = scanner.nextInt();       // mozna dac ale trzeba miec na uwadze ze try zajmuje troche czasu wykonania daltego w miejscach gdzie nei jest on koneiczny (moze byc obslizony ifami), niech go tam nie bedzie
        } catch (InputMismatchException e) {
            System.out.println("Rozmiar niepoprawny!");
            scanner.nextLine();
            return;
        }
        Integer[] array = new Integer[numberOfElements];        // integer a nie int poniewaz w moim rozwiazaniu nadajmey wartosci az nie bedzie zadnych nullow
        int indexOfArray = 0;
        while (true) {
            System.out.println("Podaj wartosc!");
            int value;
            try {
                value = scanner.nextInt();  //niebezpiczena operacja, uzytkownik moze wpisac litere... po rzuceniu wyjatku nie dochodzimy do insturkcji zwiekszania indeksu
                array[indexOfArray++] = value;
                if (!checkIfContainsNull(array)) {
                    break;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();         //czytamy entera gdy to bedzie jakis tam string, char....
                System.out.println("Zla wartosc!");
            }
        }
        int numberOfValidElements = 0;                  //ile elementow jest poprawnych
        List<Integer> list = new ArrayList<>();         // nowa struktura
        while (numberOfValidElements < 3) {
            int randomNumber = random.nextInt(50);          //lsoowanie od 0 do 49
            try {
                int element = array[randomNumber];      //niebezpiczena operacja, mozna wyjsc poza indeks tablicy.....
                numberOfValidElements++;            //gdy sie uda to zwieksz liczbe poprawnych elementow
                list.add(element);                  // i dodaj do listy
            } catch (ArrayIndexOutOfBoundsException e) {            //w przypadku gdy np indeks jest 20, 40, 35....
                System.out.println("Indeks byl poza tablica....");
            }
        }
        System.out.println(list);           // wyswietlamy porpawne elementy
    }

    private static boolean checkIfContainsNull(Integer[] array) {       //sprawdzamy czy tablica juz nie posiada nullow....
        for (Integer i : array) {
            if (i == null) {
                return true;
            }
        }
        return false;
    }


    private static void exceptionsTheory() throws InputMismatchException {
        //przyklad bez wyjatku...
//        List<Integer> integerList = new ArrayList<>();
//        int counter = 0;
//        while (true) {
//            //w przypadku nieprzechwycenia wyjatku, zostanie on rzucony dalej w bardziej zewnetrzna warstwe. Gdy nigdzie nei zostanie zlapany: blad
//            System.out.println("Podaj liczbę. Wpisz -1 by zakonczyc");
//            try {
//                // w bloku try umieszczamy niebezpieczne instrukcje,
//                // try jest bardiej kosztowny niz if
//                int number = scanner.nextInt();         // w bloku try jesli wyjatek zostanie rzucony to reszta bloku sie nie wykonuje
//                if (number == -1) {
//                    break;
//                }
//                System.out.println("Dodano liczbę " + number);
//                integerList.add(number);
//
//            } catch (InputMismatchException e) { // e od exception
//                scanner.nextLine();
//                //wyjatek zostal zlapany i obsluzony, program uznaje ze mozna pracowac dalej poniewaz blad zostal "wyjasniony"
//                System.out.println("Blad! Podaj liczbę!");
//            } catch (Exception e) {
//                System.out.println("Niezdefiniowany błąd");
//            } finally {
//                // ten blok jest wywolany bez wzgledu na to czy wyjatek zostal rzucony czy tez nie....
//                System.out.println("Próbowałeś już: " + (++counter) + " razy");
//            }
//        }
//        System.out.println(integerList);


//        1.bardzo zla praktyka (chyba ze koneicznie jest taki przypadek) jest lapanie wyjaktu NullPointerException
//        powod: moze byc obsluszony za pomoca ifa i od razu wiadomo w ktorym jest to meijscu....
//        2. bloki try-catch powinny byc raczej zwiezle tj jesli caly program jest w try catch to jest to zly program....
//        3. blok try moze byc tylko jeden natomaist blokow catch moze byc kilka....

//        int[] array = new int[]{1, 2, 3};
//
//        try {
//            System.out.println("Podaj liczbe");
//            int number = scanner.nextInt();     //gdy wpiszmey k to rzucamy wyjatek....
//            System.out.println("Podaj indeks tablicy a zwroce wartosc...");
//            int index = scanner.nextInt();
//
//            System.out.println("Liczba to " + number);
//            System.out.println("Element o indeksie " + index + " to " + takeElement(array, index));
//        }
////        } catch (InputMismatchException e) {        //wyjatek z k zostal zlaapny tutaj....
////            System.out.println("Zla liczba");       // nie jest to wyjatek arrayindex takze jest on omijany
////        } catch (ArrayIndexOutOfBoundsException e) {    // arrayIndexOut.... zlapany wyjatek....
////            System.out.println("Zly index");
////        }
//        catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {      // pojedyczny znak (dwa to alternatywa) oznacza ze wykonaja sie oba sprawdzenia...
//            System.out.println("Blad");
//        }

        //dobra praktyka.... unikac bardziej ogolnych wyjatkow....
//        jesli wiemy jaki wyjatek moze byc rzuczony (mozna dowiedziec sie o tym usuwajac blok try-catch) to przechwcycmy ten wyjatek a nie np Exception aklbo RuntimeException

        // oprocz try-catch mozna uzyc wyrazu kluczowego throws
        // rzucamy wyjatek recznie za pomoca wyrazu kluczowego throw
//
//        System.out.println("Podaj liczbe! Uwazaj na liczbe 10");
//        //obsluga mozliwa....
//        try {
//            int someNumber = scanner.nextInt();
//            if (someNumber == 10) {
//                throw new IllegalArgumentException("Mówiłem byś nie dawał liczby 10!!!"); //rzucamy recznie dowolny wyjatek.... w kosntruktorze dajemy napis kroy ukaze sie przy stacktrace
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Przechwycilem wyjatek!");
//        }

//        tworzenie wlasnych wyjatkow...
//        customowe wyjatki tworzymy jak klase.... jedyny warunek aby stala sie ona wyjatkiem jest to aby dziedziczyla po Exception, RunTimeException albo implementaowala Throwable

        System.out.println("Podaj kwote ktora chcesz wyplacic");
        int limit = 1000;
        try {
            int money = scanner.nextInt();
            if (money < 0) {
                throw new NagativeMoneyException("Podales ujemna kwote!!!");
            } else if (money > limit) {
                throw new BankLimitAccountException("Podaj liczbe ponad limit ktory sam przeciez ustaliles!!!");
            }
        } catch (BankLimitAccountException | NagativeMoneyException e) {
            System.out.println(e.getMessage());
        }


    }

    private static int takeElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        // sa niektore wyjatki tkore trzeba obsluzyc np IOException albo SqlException - wtedy musi byc try-catch albo throws
        return array[index];        // rzucamy wyjatek dalej.....
    }

    private static void collections() {
//        exWithList1();
//        exWithList2();
//        exWithSet1();
//        exWithSet2();
//        exWithSet3();
//        mapTheory();
//        exWithMaps1();
        exWithMaps2();


    }

    private static void exWithMaps2() {
        // stworz mape zachowuajca kolejnosc
//        a) dodaj do niej miasta w petli i informacje czy bylo ono przez Ciebie zwiedzono berlin =true
//        b) po wpisaniu exit wychodzimy z petli
//        c) podmien co drugi element na odwrotna wartosc
//        d) wyswietl elementy
    }

    private static void mapTheory() {

        //mapa jest to struktura danych o postaci klucz-wartosc
        // wyswtepuja trzy najpopularniejsze postaci map gdzie KLUCZ musi byc unikalny
//        - HashMap        => kolejnosc losowa,
//        - LinkedHashMap  => kolejnosc zachowana
//        - TreeMap        => kolejnosc wg komparatora

        Map<String, String> map = new HashMap<>();
        //aby dodac element do mapy nalezy uzyc metody put()
        map.put("Java Podstawy", "Calkiem niezla ksiazka dla poczatkujacych!");
        map.put("Dziady", "Nudna lektura ktorej bardzo nei lubilem kiedys w liceum");
        map.put("Dziady", "Nudna lektura ktorej bardzo nei lubilem kiedys w liceum");
        map.put("Spring w akcji", "Ksiazka do frameworka spring, którego będizecie chcieli poznać przy dalszej nauce javy");

        //aby wyswietlic element nalezy podac klucz - wyswietlamy elementy podajac klucz a nie wartosc
        System.out.println(map.get("Java Podstawy"));
        String valueOfKeyDziady = map.get("Dziady");
        System.out.println(valueOfKeyDziady);

        //rozmiar
        System.out.println(map.size());

        //zbior kluczy
        Set<String> keys = map.keySet();

        //iteracja po kluczach
        for (String key : keys) {
            System.out.println(key);
        }

        // iteracja po parach klucz-wartosc
        //Entry to klasa statyczna wewnatrz Mapy dlatego aby sie do neij odwolac nalezy Wywolac ja po kropce Map.Entry<K,V>
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Wartosc klucza: " + entry.getKey() + " to " + entry.getValue());
        }

        // klasyczne wyswietlenie
        System.out.println(map);

        //postac
//        element 1: klucz = wartosc
//        element 2: klucz = wartosc
//        .
//        .
//        element 3: klucz = wartosc


        //replace
        Map<String, Integer> anotherMap = new HashMap<>();

        anotherMap.put("mleko", 2);
        System.out.println(anotherMap);
        anotherMap.replace("mleko", 3);
        System.out.println(anotherMap);

        anotherMap.replace("mleko", 10, 4);  // nie dostalismy potwierdzenia o starej wartosci....
        System.out.println(anotherMap);

        System.out.println(anotherMap.get("ser"));
        System.out.println(anotherMap.getOrDefault("ser", 0));


//        List<Map<String, String>> mapList = new ArrayList<>();

//        <img src="dog.jpg" alt="Pies" th:src="@{}"/>
//        <img src="" alt="" th:src="@{}"/>
//        <img src="" alt="" th:src="@{}"/>
//        <img src="" alt="" th:src="@{}"/>
//        <img src="" alt="" th:src="@{}"/>
    }

    private static void exWithMaps1() {
        // zadanie
//        a)Dodaj kilka elementów do mapy - produkty.
//          Przestan dodawac gdy uzytkownik wpisze exit
//          Kazdy produkt powinien miec swoja wartosc => mleko - 2zł
//        b) Wyswietl elementy mapy
//        c) Zwroc informacje ile mapa elementow
//        d) Zwroc informacje w postaci: Mleko jest warte 2zl

        // kluczem jest nazwa produktu czyli, np: mleko, chleb, platki
//        warrtoscia jest cena produktu, np 2,3,4 zl daltego musi byc to integer
        Map<String, Double> mapOfProducts = new LinkedHashMap<>();
        while (true) {
            System.out.println("Podaj nazwę produktu");
            String nameOfProduct = scanner.nextLine();
            //jak uzytownik wpisze exit to juz nie martwimy sie o cene, po prostu opuszczamy petle
            if (nameOfProduct.equals("exit")) {
                System.out.println("Koniec pętli...");
                break;
            }
            System.out.println("Podaj cenę");
            double price = scanner.nextDouble();

            //uwaga! enter musi byc zczytany!
            scanner.nextLine();

            //dodajemy zmienne do mapy
            mapOfProducts.put(nameOfProduct, price);
        }
        System.out.println(mapOfProducts);
        System.out.println("Rozmiar tej mapy to: " + mapOfProducts.size());

        for (Map.Entry<String, Double> pair : mapOfProducts.entrySet()) {
            System.out.println(pair.getKey() + " jest warte " + pair.getValue() + " zl");
        }


    }

    private static void exWithSet3() {
        //treeSet moze w konstruktorze przyjac comparator

        //przydatna rzecz przy wlasnych klasach!!!!

        Comparator<String> ownComp = new ComparatorByNameLength();
        Set<String> names = new TreeSet<>(ownComp);
        names.add("Hubert");
        names.add("Wojciech");
        names.add("Magda");
        names.add("Anna");

        System.out.println(names);

    }

    private static void exWithSet2() {
        //zad wlosowac do seta 5 wartosci i usunac element srodkowy
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size() < 5) {
            integerSet.add(random.nextInt(10) + 1);
        }

        System.out.println(integerSet);
//        integerSet.remove()
        Iterator<Integer> iterator = integerSet.iterator();     // iterator sluzy do przechodzenia po strukturze danych w zadanych warunkach, usuwania elementow itd

        int index = 0;
        while (iterator.hasNext()) {            // dopoki posiada nastepny element....
            System.out.println("Element o indeksie " + index + " to " + iterator.next());       // pokaz element nastepny
            if (index == 2) {
                iterator.remove();              //usun obecny element
            }
            index++;
        }
        System.out.println(integerSet);


    }

    private static void exWithSet1() {
        //zadanie
        // a) dodaj do seta 5 elementow typu double
        // b) oblicz srednia z tych elem
        // c) zwroc rozmiar seta
        // d) jesli set zawiera element bedacy srednia ze wszsytkich elementow to zwroc komunikat: jest ok!
        // e) wlosuj do seta 3 wartości i sprawdz czy rozmiar bedzie rowny 8: jesli tak to zwroc komunikat, jesli nie to tez

        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.0);
        doubleSet.add(1.1);
        doubleSet.add(1.2);                         //a)
        doubleSet.add(1.3);
        doubleSet.add(1.4);

        double sum = 0;
        for (double elem : doubleSet) {
            sum += elem;                            //b)
        }
        double average = sum / doubleSet.size();
        System.out.println("Srednai to: " + average);

        System.out.println(doubleSet.size());       //c)

        if (doubleSet.contains(average)) {
            System.out.println("Jest ok!");         //d)
        }

        for (int i = 0; i < 3; i++) {
            int randomNum = random.nextInt(2);
            // powyzsze losowanie jest wazne poniewaz nextDouble losuje wartosc od 0 do 1
            // String.format zwroci wylosowanego double z dwoma miejscami po przecinku ale w postaci String, nastepnei zparsujemy to na double
            doubleSet.add(randomNum + Double.parseDouble(String.format("%.1f", random.nextDouble()).replace(",", ".")));
        }

        if (doubleSet.size() == 8) {
            System.out.println("Wlosowane liczby były unikatowe");
        } else {
            System.out.println("WLosowane liczby nie byly unikatowe");
        }

        for (double elem : doubleSet) {
            System.out.println(elem);
        }


    }

    private static void exWithList1() {
        // zadanie
        // a) stworz liste String a nastepnie dodaj do niej 3 elementy
        // b) wyswietl tylko te ktore maja wiecej niz 3 znaki
        // c) dodaj jeszcze 4 elementy
        // d) usun co drugi element
        // e) wyswietl wyniki....
        // f) stworz kolejna liste String zawierajaca 3 stringi
        // g) dodaj cala liste do pierwszej listy
        // h) dla indeksow parzystych wyswietl elementy
        // i) pokaz rozmiar

        System.out.println();
        System.out.println();
        List<String> stringList = new ArrayList<>();
        stringList.add("element1");
        stringList.add("element2");             //a)
        stringList.add("element3");
        for (String elem : stringList) {
            if (elem.length() > 3) {
                System.out.println(elem);       //b)
            }
        }
        stringList.add("element4");
        stringList.add("element5");             //c)
        stringList.add("element6");
        stringList.add("element7");

        //uzycie tzw iteratora....
        stringList.remove("element1");
        stringList.remove("element3");
        stringList.remove("element5");       //d)
        stringList.remove("element7");

        System.out.println(stringList);         //e)

        List<String> anotherList = new ArrayList<>(Arrays.asList(
                "anotherElem1",
                "anotherElem2",                 //f)
                "anotherElem3"
        ));

        stringList.addAll(anotherList);         //g)

        System.out.println(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(stringList.get(i));      //h)
            }
        }
        System.out.println(stringList.size());          //i)


    }

    private static void exWithList2() {
        // zadanie
//        a) stworz liste integerow
//        b) dodawaj liczby od uzytkownika w petli az wpisze -1 - ta liczba nie powinna sie znalezc w liscie
//        c) gdy uzytkownik wpisze replace to elementy ktorych wartosc jest wieksza niz 4 bedą podmienione na polowe swojej obecnej wartosci
//        d) gdy uzytkownik wpisze insert to dodaj trzy losowe liczby na poczatku listy
//        e) gdy uzytkownik wpisze remove to spytaj sie o indeks do usuniecia i usun ten element
//        f) gdy uzytkownik wpisze average to zwroc srednia arytmetyczna dla drugiej polowy listy

//        gdy exit to wyjdzie

        List<Integer> integerList = new ArrayList<>();      //a)

        getElements(integerList);                   //b)

        scanner.nextLine();
        while (true) {
            System.out.println("Podaj operacje");

            switch (scanner.nextLine()) {
                case "replace":
                    replaceElements(integerList);
                    System.out.println(integerList);
                    break;
                case "insert":
                    insertOnBeg(integerList);
                    System.out.println(integerList);
                    break;
                case "remove":
                    removeAtIndex(integerList);
                    System.out.println(integerList);
                    break;
                case "average":
                    averageForHalf(integerList);
                    break;
                case "exit":
                default:
                    return;
            }
        }

    }

    private static void averageForHalf(List<Integer> integerList) {
        List<Integer> half = new ArrayList<>();
        for (int i = integerList.size() / 2; i < integerList.size(); i++) {
            half.add(integerList.get(i));
        }
        double average = calculateAverage(half);
        System.out.println("Oto średnia dla elementow " + half + " : " + average);

    }

    private static double calculateAverage(List<Integer> half) {
        double sum = 0;
        for (int elem : half) {
            sum += elem;
        }
        return sum / half.size();
    }

    private static void removeAtIndex(List<Integer> integerList) {
        System.out.println("Podaj indeks do usuniecia!");
        int index = scanner.nextInt();
        if (index <= integerList.size()) {
            integerList.remove(index);
        } else {
            System.out.println("Index jest poza lista!");
        }
        scanner.nextLine();
    }

    private static void insertOnBeg(List<Integer> integerList) {
        for (int i = 0; i < 3; i++) {
            integerList.add(0, random.nextInt(20));
        }
    }

    private static void replaceElements(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 4) {
                integerList.set(i, integerList.get(i) / 2);
            }
        }
    }

    private static void getElements(List<Integer> integerList) {
//        List<Integer> integerList = new ArrayList<>();
        while (true) {
            System.out.println("Podaj liczbę! Wpisz -1 jeśli chcesz zakończyć!");
            int number = scanner.nextInt(); // w javie wystepuje mechanizm autoboxingu i autounboxingu....
            if (number == -1) {                             //b)
                break;
            }
            integerList.add(number);
        }
    }

    private static void exWithShape() {
        //      Stworz interfejs Shape z metoda getArea i getPerimeter
//        a) stworz dodatkowo klasy Rectangle, Square ktory bedzie dziedziczyc po Rectangle, Triangle oraz Circle
//           ktore beda odppwiednio implementowac ten interfejs
//        b) stworz tablice ksztaltow i wyswietl wyniki!

        Shape[] shapes = new Shape[]{
                new Rectangle(4, 3),
                new Square(3),
                new Triangle(2, 3, 4),
                new Circle(5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}
