package weekend3;

public class Zajecia6 {
    public static void main(String[] args) {
//        finalExamplesWithOneBiggerEx();
//        solid();
//        thisAsAnotherConstrucotr();
        privateVsPublicVsDefault();
        classExercise();
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
//        h) dostan sie do nich rowneiz za pomcoa getterow,.....
        
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
