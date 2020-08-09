package weekend3;

public class Zajecia6 {
    public static void main(String[] args) {
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

        Beer lager = new Beer(Beer.LAGER, Beer.LAGER_ALCOHOL);
        System.out.println(lager.alcohol);
        Beer pils = new Beer(Beer.PILS, Beer.PILS_ALCOHOL);
        Beer free = new Beer(Beer.FREE, Beer.FREE_ALCOHOL);

        int amountOfDrunkBeers = 0;
        Person person = new Person();
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);
        person.drink(lager);
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);
        person.drink(pils);
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);
        person.drink(free);
        amountOfDrunkBeers++;
        System.out.println("Stan po " + amountOfDrunkBeers + " piwach: " + person.permills);


    }


}
