package weekend3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zajecia6 {
    public static void main(String[] args) {
//        finalExamplesWithOneBiggerEx();
//        solid();
//        thisAsAnotherConstrucotr();
//        privateVsPublicVsDefault();
//        classExercise();
//        enumTheory();
        introToCollection();

    }

    private static void introToCollection() {
        //                               Kolekcje                                             Mapy
        //         Set                    Listy                 Kolejki                       - HashMap
        //        -HashSet               - ArrayList           - priorytetowe                 - TreeMap
        //        -LinkedHashSet         - LinkedList          - stosy                        - LinkedHashMap

        // Listy - tablice na sterydach
        // lista to taka jakby tablica (tak naprawed to klasa) ktora przechowuje elementy, nie msui byc miec okreslonej liczby elementow... zwieksza pojemnosc na biiezaco....

        // kazdy typ podstawowy posiada odpowiednik obiektowy....
//        Integer - int
//        Double - double
//        Character - char
//        itd....

//        do kolekcji mozemy wysylac TYLKO obiekty..... przykald listy
        List<Integer> listOfIntegers = new ArrayList<>(); //mechanizm poliformizmu.... omowimy za 2 tyg

//        skladnia
//        typ <typ ktory bedzie przechowywany wewnatrz listy... > nazwa = konstruktor<>();

        listOfIntegers.add(5);
        listOfIntegers.add(10);
        listOfIntegers.add(0);
        System.out.println(listOfIntegers);
        for (Integer listOfInteger : listOfIntegers) {
            System.out.println(listOfInteger);
        }

//        add(element) - dodawnai elementu ktory MUSI sie zgadzac z typem okreslonym przy deklarcji wenwatrz <>
//        add(index,element) - dodaje element na indeksie o wartosci element... nastepne wszystkie elementy sie przesuwaja....
//        size() - rozmiar listy            // array.length
//        get(index) - element listy o indeksie....         array[index]
//        constains - sprawdza czy lista zawiera....        nie ma... nalezy uzyc petli do iteracji (liniowej lub binarnej(wydajna))
//        remove - usuwa element listy - uwaga! metoda jest przeciazona, moze przyjac element lub indeks... // nie posiada tablica... mozna ustawic element na null

        listOfIntegers.set(2, 100); // listOfIntegers[2] = 100
        System.out.println(listOfIntegers);

        // zadanie
//        Stworz liste Stringow...
//        a) dodaj do niej trzy napisy
//        b) pokaz liste
//        c) pokaz element o indeksie 2
//        d) podaj rozmiar listy
//        e) sprawdz czy lista zawiera element "lista"
//        f) usun ostatni element
//        g) dodaj trzy inne elementy
//        h) wyswietl liste z uzyciem petli foreach....
//        i) wyswietl lsite o indeskach parzystych - dla nieparzystych ustaw ciag znakow "NIEPARZYSTY"
//        j) wyswietl liste

        List<String> stringList = new ArrayList<>();  // deklracja listy z jej definicja
        stringList.add("Pierwszy napis");               //podpunkt a)
        stringList.add("lista");
        stringList.add("Trzeci napis");
        System.out.println(stringList);                 //podpunkt b)
        System.out.println(stringList.get(2));          //c)
        System.out.println(stringList.size());          //d)
        System.out.println(stringList.contains("lista"));   //e)
        System.out.println(stringList.remove(stringList.size() - 1));           //f)
        stringList.add("Ktorys napis");         //g)
        stringList.add("lista 100");
        stringList.add("Trzeci dum dum");
        for (String element : stringList) {
            System.out.println(element);            //h)
        }
        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(stringList.get(i));          //i)
            } else {
                stringList.set(i, "NIEPARZYSTY");
            }
        }
        System.out.println(stringList);

        List<Car> cars = new ArrayList<>();         // tworze liste z obiektami cars
        cars.add(new Car("bmw"));               // dodaje nowe auto marki bmw
        cars.add(CarFactory.createCar(CarsEnum.FORD));      // uzywam CarsFactory, ktore tworzy mi nowe auto marki ford i zwraca
        System.out.println(cars);                       // wyswietlam liste
        System.out.println(cars.get(0).getBrand());     // odwoluje sie do elememntu 0 czyli Car BMW i uzyskuje marke
        Car car = cars.get(1);                      // zwracany element  o indeksie 1 przyposuje do referencji car typu Car
        System.out.println(car.toString());          // wyswietlam auto w postaci toString()

        List<Double> doubles = new ArrayList<>();
        doubles.add(5.4);
        System.out.println(doubles);
        doubles.add(5.5);
        System.out.println(doubles);
        doubles.add(1.4);
        System.out.println(doubles);

    }

    private static void enumTheory() {
        // istnieje pewny specjalny rodzaj klasy.... jest to enum. inna nazwa to typ wyliczeniowy....
        //dalsza czesc wewnatrz enuma Liczby

        System.out.println(Liczby.DWA.ordinal());   // czyli po wywolaniu metody ordinal dostajemy wartosc liczbowa....

//        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();

//        final int number2 = Liczby.DWA.ordinal();

//        switch (number){
//            case number2:
//
//        }
//

//        // zaleta enuma jest taka ze od razu na poziomie wywolania uzystkujemy inforamcje na temat tego czego enum dotyczy
//        if(number == Liczby.DWA.ordinal()){
//            System.out.println("Jest to liczba 2");
//        }
//
//        String color = scanner.nextLine();
//
//        // enum sluzy w takim razie do przechowywania stalych ....
////        zaleta jest taka ze wiemy ktorych infromacji mozemy uzyc
//        if (Kolory.ZIELONY.toString().toLowerCase().equals(color.toLowerCase())) {
//            System.out.println("Jest to kolor zielony");
//        }
//        if (Kolory.CZERWONY.toString().toLowerCase().equals(color.toLowerCase())) {
//            System.out.println("Jest to kolor czerwony");
//        }
//        if (Kolory.NIEBIESKI.toString().toLowerCase().equals(color.toLowerCase())) {
//            System.out.println("Jest to kolor niebieski");
//        }
//
//        boolean isContaining = false;
//        for (Kolory colour : Kolory.values()) {
//            if (colour.toString().equals(color)) {
//                System.out.println("Enum posiada taka stala");
//                isContaining = true;
//            }
//        }
//        if (!isContaining) {
//            System.out.println("Nie udalo sie odnalezc koloru");
//        }
//
//        Car car = CarFactory.createCar(CarsEnum.BMW);
//        System.out.println(car);
//
//        colors(Kolory.NIEBIESKI);
//
//        System.out.println(Liczby.ZERO);
//        System.out.println(Liczby.ZERO.getValue());
//        System.out.println(Liczby.TRZY.getTextInEnglish());
//
//        System.out.println(Kolory.NIEBIESKI.getDescription());

        //posidanie wielu enumow jest rekomendowane....
//        - pozwala unikac bledow
//        - pozwala przechowywac kilka inforamcji wewnatrz jednej stalej
//        - pozwala wyeliminowac wpisywanie informacji z palca

//       sytaucja w ktorej trzeba wybrac static final vs enum
//        statci final gdy stalych jest malo, maja jedna wartosc np LAGER = "lager", nie uzywamy za czesto w innych klasach
//        enum gdy chcemy by stala przechowywala opis, kilka wartosci w roznych postaciach, uzywamy czeseto w innych klasach


//        zadanie: stworz enuma ktory
//        a) bedzie okreslal rodzaje rowerow....
//        b) beda wystepowaly rowery miejskie, gorskie, wyczynowe....
//        c) kazdy rodzaj powinien miec krotki opis oraz cene
//        d) stworz metode buyBike, ktora jako argumnet przyjmie enuma wybranego przez uzytkownika - tzn uzytwkonik wpisuje wawrtosc i nastepuje
//        sprawdzenie czy taki rower istnieje w sklepie... jesli nie to daj komunikat o tym, daj szanse sprobowac ponownie...
//        e) jesli tak to pokaz cene, opis i spytaj czy na pewno zakup ma sie odbyc

        boolean isValid = false;
        while (!isValid) {
            System.out.println("Jaki chcesz rower? \n1.Miejski \n2.Gorski \n3.Wyczynowy");
            String choice = scanner.nextLine();

            BikesEnum choosenBike = checkIfExists(choice);
            if (choosenBike == null) {
                System.out.println("Nie istnieje taki rower");
            } else {
                isValid = buyBike(choosenBike);
                if (isValid) {
                    System.out.println("Zakupiono rower!!! ");
                }
            }

        }
    }

    private static BikesEnum checkIfExists(String choice) {
//        iterujemy po wszystkich elementach enuma....
//        jesli nazwa konkretnego enuma jest taka sama jak wybrana przez uzytkownika to zwroc tego enuma
        for (BikesEnum bike : BikesEnum.values()) {
            if (bike.getName().equals(choice)) {
                return bike;
            }
        }
        return null;
    }

    public static boolean buyBike(BikesEnum bikesEnum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cena: " + bikesEnum.getPrice());
        System.out.println("Opis: " + bikesEnum.getDescription());

        System.out.println("Czy na pewno ten rower Cie interesuje \n 1. Tak \n 2. Nie");
        String choice = scanner.nextLine();

        return choice.toLowerCase().equals("tak");

    }

    private static void colors(Kolory colour) {
        if (colour == Kolory.NIEBIESKI) { // enumy porownujemy ==
            System.out.println("Jest to neibieski kolor");
        }
    }

    private static void classExercise() {
        //stworz klase Computer w ktorej:
//        a) stworzysz pola o nazwie ip, marka, cena
//        b) stworzysz gettery i settery(do pewnych pol)
//        c) dodasz walidacje w tych metodach
//        d) dodaj pole isRunning
//        e) dodaj metode run  => modyfikuj pole isRunning
//        f) dodaj metode stop => modyfikuj pole isRunning
//        g) wyswietl informacje czy komputer jest wlaczony a takze swtorz metode wyswietlajaca jego parametry....
//        h) dostan sie do nich rowneiz za pomcoa getterow.....

        Computer computer = new Computer("89.43.29.10", "dell", 3500);
        System.out.println("Marka tego komputera to: " + computer.brand);
//        computer.brand = "123234"; // nie moge bo pole jest final....
        System.out.println("Hmmm czy komputer jest domyslnie wlaczony?? " + computer.isRunning());
        System.out.println("Siadam do pracy.");
        computer.run();
        System.out.println("Moj komputer jest wlaczony??? " + computer.isRunning());
        System.out.println("Skonczylem prace...");
        computer.stop();
        System.out.println("Czy przypadkiem moj komputer pzoostal wlcaozny???" + computer.isRunning());

        System.out.println("Parametry mojego komputera to...");
        computer.showSpecification();

        Computer computer1 = new Computer("asdasd", "", 10000000);
        computer1.showSpecification();

        System.out.println();

        System.out.println(computer); // domyslnie przy wywolaniu obiektu dostaniemy nazwa_pakietu_nazwa_klasy_@_adres_w_hex
//        po przeslonieciu toString() => ppm => generate => toString() => wybrane pola ktore chcemy by byly widoczne....


        // istnieje jeszcze modyfikator dostepu defaultowy .... jest to dostep pakietowy....

//        computer.ip; // moglbym odwolac sie bo dostep jest pakietowy

//        defaultowy  .... => private dla innych pakietow oraz public dla swojego pakietu

//        PRZYKLAD uzycia defaultowego modyfikatora dostepu....
//       jest pakiet oblusgi konta bankoweg w ktorym sa klasy bank, konto, uzytkownik i np transfer .... na tym etapie moze byc przydatnym aby pewne zmienne
//       instancji byly widoczne dla innych klas w obrebie pakietu.... natomiast niepozadanym jest aby te pola byly widoczne z jakiegokowliek innego meijsca
    }

    private static void privateVsPublicVsDefault() {
        // w javie obowiazuje zasada jak najwiekszego ukrywania danych....
//        czyli tzw enkapsulacji / hermetyzacji
//
        Account accountKowalskiego = new Account();
        accountKowalskiego.add(1000);
        System.out.println(accountKowalskiego.getBalance());
        accountKowalskiego.debit(300);
        System.out.println(accountKowalskiego.getBalance());

//        accountKowalskiego.balance = 900000000;

//        accountKowalskiego.balance = 0;
//        System.out.println(accountKowalskiego.balance);               // nie mozna odwolac sie.... modyfikator dostepu private... uzyj gettera....
//        accountKowalskiego.balance = -500;
//        System.out.println(accountKowalskiego.balance);
//        accountKowalskiego.balance = "k";
//        System.out.println(accountKowalskiego.balance);

        //public - modydifkator dostepu do pola/metody/klasy do ktorego KAZDY z kazdego miejsca ma dostep....

//        accountKowalskiego.pesel = "456"; //NIEDOPUSZCZALNA SYTUACJA.....
        accountKowalskiego.setPesel("555");
        accountKowalskiego.setPesel("12345678912");
//        accountKowalskiego.pesel = "234345"; // nie pozmienia juz nigdy w spsoob nieporpawny.... jesli pole jest private
        accountKowalskiego.setPesel("98765432198");
        System.out.println("Pesel kowalskiego to " + accountKowalskiego.getPesel());
        System.out.println(accountKowalskiego.NAME_OF_BANK);
        System.out.println(Account.VALUE_OF_MBANK);

        // kowalski wie ze wyslac pieniadze... oczekuje ze beda na koncie.... o wszystkich operacjach w miedzyczasie robionym przez bank nie musi wiedziec.....
//        accountKowalskiego.saveTransaction(0); // niewykonalne I DOBRZE bo klasa Account udostepnia jedynie uslugi.... dodaj do konta, wyplac, transfer.....
//        accountKowalskiego.doImportantCalculationsKnownOnlyForBank();

        System.out.println(accountKowalskiego);
    }

    private static void thisAsAnotherConstrucotr() {
        // slowa this mozna uzyc rowniez do wywolania innego kosntrutkora......
    }

    private static void solid() {
//         istnieje taki wzorzec do zarzadzania klasami jak solid..... wygooglowac.....
//         dana klasa powinna miec jedna odpowiedzialnosc.....
//         pzoostale zasady do doczytania i bezwglednego stosowania.....
    }

    private static void finalExamplesWithOneBiggerEx() {

        // zmienne / obiekty final

        // final - oznacza stałą
//
//        int mutableVariable = 5;
//        System.out.println(mutableVariable);
//        mutableVariable = 10;
//        System.out.println(mutableVariable);
//
//        final int constVariable = 10;
//        System.out.println(constVariable);
////        constVariable = 90;
//        System.out.println(constVariable);
//
//        final int value;
//        value = 10;
////        value = 20; mozna raz tylko przypisac wartosc do zmiennych final
//        System.out.println(value);

        StaticFinalFieldsExamples ex = new StaticFinalFieldsExamples();
        ex.showInitialValuePlusAnotherValue(4);

        ex.showSth();

        System.out.println(StaticFinalFieldsExamples.INITIAL_VALUE); // pola sa static i public, mzona sie odwolac....

//        zadanie...
//        a) stworz klase Beer w ktorej stworzysz pola statyczne i finalne okreslajace nazwy i zawartosc alkoholu trzech piw
//        Lager,Pils,free
//        b) stworz konstruktor w ktorym stworzysz piwo o danym rodzaju.... parametry konstrutkora powinny pochodzic tylko ze stalych
//        (przeciez nie chcemy utworzyc nieistniejacego w danym pubie piwa)
//        c) wyswietl % alkhoolu dla danego obiektu....
//        d) swtorz kilka obiektow piw....
//        e) Stworz klase Person posiadajaca pole permills i metode statyczna drink przyjmujaca jako parametr obiekt Beer. Pole permills ma byc zwiekszane o wartosc %alkoholu / 10
//        f) wyswietl poziom alkoholu we krwi dla osob

        Beer lager = new Beer(Beer.LAGER, Beer.LAGER_ALCOHOL); // tworze piwo wysylajac tam stale.....
        System.out.println(lager.alcohol);      // wyswietlam zawartosc alkoholu dla lagera
        Beer pils = new Beer(Beer.PILS, Beer.PILS_ALCOHOL); // tworze piwo wysylajac tam stale.....
        Beer free = new Beer(Beer.FREE, Beer.FREE_ALCOHOL); // tworze piwo wysylajac tam stale.....

        int amountOfDrunkBeers = 0;             //ilosc wypitych piw
        Person person = new Person();           //tworze osobe
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);        //odowluje sue do ilosci promili
        person.drink(lager); //pije piwo......
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);        //odowluje sue do ilosci promili
        person.drink(pils); //pije piwo......
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);        //odowluje sue do ilosci promili
        person.drink(free); //pije piwo......
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);        //odowluje sue do ilosci promili


    }


}
