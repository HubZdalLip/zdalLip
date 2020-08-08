package weekend3;

import java.util.Random;

public class Zajecia5 {

    public static void main(String[] args) {

//        foreache();
//        printfIStringFormat();
//        overloadedMethods();
//        randomNumbers();
        classes();

    }

    private static void classes() {
        //klasa - jest to po prostu typ "zmiennej" (dotychczas) obiektu....
        //klasa - reprezentacja danego obiektu
        int var = 0; // jest to zmienna, ( wartosc ukladana na stosie ), nic sie nie kryje jakby pod slowem kluczowym int orpocz tego ze wskazuje na liczbe
        String text = ""; // jest to obiekt, text to referencja do obiektu.... jest to zlozony typ.... (wartosc ukaldana jest na stercie...)
//        text.length();  // mozna odwolac sie do infromacji ktore sa czescia tego obiektu
//        String string = new String();
        Dog dog1 = new Dog();
        System.out.println(dog1); // wyswietlenie da jedynie reprezentacje pamieciowa....
        int age = dog1.age;
        System.out.println(age);

        Dog owczarek = new Dog();
        owczarek.name = "Owczarek";
        System.out.println(owczarek.age);
        Dog husky = new Dog();
        husky.name = "Husky";
        System.out.println(husky.age);

        owczarek.age = 3;
        husky.age = 1;
        System.out.println("Halo jestem owczarek. Mam " + owczarek.age + " lat");
        System.out.println("Halo jestem husky. Mam " + husky.age + " lat");

        new Dog(); //konsturktor..... (domyslny!)

//        Dog york = null; // null => slowo kluczowe oznaczajace referencje do niczego....
////        gdy chcemy odwolac sie do obiektu ktory nie isntieje to dostajemy NullPointerException
//        System.out.println(york.age);

        Dog anotherDoggo = new Dog();
        System.out.println(anotherDoggo.name);

        Dog jamnik = new Dog(2, "Max"); // wywolujemy konstruktor PRZECIAZONY!!!!
        System.out.println("Mam na imie " + jamnik.name + ". Mam " + jamnik.age + " lat ");


//        text.length()
//        text.indexOf(blabla)

        owczarek.bark(); //metoda NIEstatyczna
        husky.bark();
        jamnik.bark();

        owczarek.sleep(3); //metoda NIEstatyczna
        husky.sleep(10);
        jamnik.sleep(1);

        Dog.meetAllDoggos(); // metoda statyczna jest to metoda ktora jest zwiazana z istnieniem klasy, nie danego obiektu

//    Zadanie.... stworzyc klase User....
//    a) stworzyc pola okreslajace imie, wiek, miasto pochodzenia
//    b) stworzyc konstruktor bezparametrowy, który ustawia domyslnie wartosc imienia na "Nie podano" i wieku na -1. Miasto pochodzenia - Nie podano
//    c) stowrzyc konstruktor parametrowy ktory ustawia imie w zaleznosci od przeslanego parametru.... i inne parametry
//    d) stworzyc dwa obiekty takiej klasy i wywolac metode(czyli najpierw ja stworzyc) ktora wyswietli informacje o userze
//    e) zmodyfikowac na poziomie klasy Zajecia5 wartosci miasta pochodzenia, ponownie wyswietlic informacje
//    f) stworzyc metode statyczna ktora zwroci komunikat "Jestem metoda statyczna ale jeszcze nic nie robie", wyswietlic po przypisaniu do zmiennej na pozoiomie klasy Zajecia5

    }

    private static void randomNumbers() {
        Random random = new Random(); // deklaracja obiektu klasy Random, obiekt ma nazwe random
        int randomNumber = random.nextInt(10); //losowanie ZAWSZE (przynajmniej w tej postaci) odbywa sie od 0 do
//        a) jesli brak argumentow to wartosci max typu
//        b) jesli arguemnt to jakas gorna granica....
//        System.out.println(randomNumber);
//
////         zadanie: wyswietl na ekranie n (liczba podanada przez uzytkownika) losowych liczb
////
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj n");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int rand = random.nextInt(40);  // w kazdej iteracji jest losowanie, przypisanie do zmiennej rand
//            System.out.println(rand);   // wyswietlenie!
//        }

        // zadanie wylosuj wartosc w przedzialu 10 ; 20
//        int anotherRandomNumber = random.nextInt(10) + 10; // od 0 do 10
////        System.out.println(anotherRandomNumber);
//        // sposob na losowanie od innej wartosci niz 0 do po prostu dodanie tej wartosci
//        anotherRandomNumber = random.nextInt(100); // od 0 do 100
//        System.out.println(anotherRandomNumber);
//        // jakbysmy chcieli od 50 do 100
//        int bottom = 50;
//        anotherRandomNumber = random.nextInt(100 - bottom) + bottom;
//        System.out.println(anotherRandomNumber);


    }

    private static void overloadedMethods() {

        //metoda przeciążone....

        //stare podejscie
        int sum = add(5, 10);
        System.out.println(sum);
//        double sumD = addDouble(5.1, 10.9);
//        System.out.println(sumD);

        // podejscie z metodami przeciazonymi....
        // mozna stworzyc wiele metod o tej samej nazwie!!! ALE z warunkiem takim ze zestaw argumentow ma byc rozny....
        // typ zwracany nie ma znaczenia....
        // kompilator jest w stanie rozroznic argumenty ktore sa przekazywane....

//        double sumD = add(5.1, 10.9);
//        System.out.println(sumD);
//        System.out.println(add(5.13, 5));
//        System.out.println(add(5, "10"));

        // zadanie napisz metode welcomeUser
//         a) bedzie przyjmowac imie i zwracac komunikat witajacy
//         b) bedzie przyjmowac imie i wiek i zwracac podstawowe ifnormacje
//         c) bedzie przyjmowac imie, wiek i nazwisko i zwracac te informacje

        String result = welcomeUser("Hubert");              //a
        System.out.println(result);
        result = welcomeUser("Natalia");
        System.out.println(result);
        result = welcomeUser("Hubert", 40);             //b
        System.out.println(result);
        result = welcomeUser("Władek", 15);
        System.out.println(result);
        result = welcomeUser("Hubert", 40, "Nowak");             //b
        System.out.println(result);
        result = welcomeUser("Magda");
        System.out.println(result);
        result = welcomeUser("Władek", 15);
        System.out.println(result);
        result = welcomeUser("Pawel", 15, "Kowalski");
        System.out.println(result);

        // uwaga! przeciazenie metody to nic specjalnego.... na etapie kompilowania program dopisuje do nazw metod kilka liter ktore pozwalaja mu rozroznic te metody

        // zadanie. Napisz metode ktora przyjmie nieokreslona liczbe elementow int oraz jeden element typu String zaweirajacy liczbe. Zwroc roznice....

        System.out.println("Roznica to : " + subEx("7", 5, 6, 1, 8));

        //uwaga do przeciazenia

    }

    private static int multiply() {
        return 0;
    }

    private static int multiply(int a) {
        return 0;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    private static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }
//
//    unikac! (typ...) moze powodowac bledu przy przeciazaniu
//    private static int multiply(int... ints){
//        //logic
//        return 0;
//    }
//

    private static int subEx(String s, int... ints) {
        int numberFromString = Integer.parseInt(s); // parsowanie wartosci string na int w tym miejscu
        int init = numberFromString; // wartosc poczatkowa ma to sparsowana liczba
        for (int value : ints) {
            init -= value;
        }
        return init;
    }

    private static String welcomeUser(String name) {
        return "Mam na imie " + name;
    }

    private static String welcomeUser(String name, int age) {
        return "Mam na imie " + name + ". Metoda jest przeciazona. Moj wiek to " + age + " lat";
    }

    private static String welcomeUser(String name, int age, String surname) {
        return "Mam na imie " + name + ". Moje nazwisko to " + surname + ". Metoda jest przeciazona \"jeszcze bardziej\". Moj wiek to " + age + " lat";
    }


    private static double add(int i, String string) {
        int number = Integer.parseInt(string);          //istnieje rowniez parseDouble.....
        return i + number;
    }


    private static double add(double v, double v1) {
        return v + v1;
    }

    private static int add(int i, int i1) {
        return i + i1;
    }


    private static void printfIStringFormat() {
        // printf
//        System.out.println();
//        System.out.print();
        System.out.printf("Jestem w metodzie printf. Argument to %s. Teraz bedzie arg2: %s , teraz arg 3 %s, a teraz arg 4: %s ", "ARGUMENT!!", "Argument2", "argument3", "argument 4");
        System.out.println();
        String name = "Krzysztof";
        System.out.printf("Jestem %s mam %d lat", name, 50);
        System.out.println();

//        %s - do stringow
//        %d - do liczb
//        %f - do floatow
//        %n - nowa linia
//        %t - daty....

        //zad przepisz na printf

        String city = "Krakow";
        int years = 30;
        name = "Piotrek";
        System.out.println("Mieszkam w " + city + ". Jestem tutaj od " + years + " lat. Moj brat na imie " + name);

        System.out.printf("Mieszkam w %s. Jestem tutaj od %d lat. Moj brat ma na imie %s", city, years, "Piotr");
        System.out.println();
        // jest mozliwosc okreslenia precyzji danej liczby
        double x = 123.456789;
        System.out.printf("Liczba x to %.3f %n", x);       // %._LICZBA_MIEJSC_f

        // istnieje takze mozliwosc okreslenia odstepu miedzy argumentami....
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.printf("%5d", i * j);                   //odstep tworzymy piszac % ODSTEP d
            }
            System.out.println();
        }

        //dziala tak samo jak printf.....
        System.out.println("Magiczna liczba! Wynois ona " + String.format("%5d", 10));


        //zad. podaj liczbe i wyswietl ja z jednym miejscem po przecinku.
//             Podaj dwie liczby i wyswietl je w zadanym przez siebie odstepie

        System.out.printf("Liczby: %.1f %10d %n", 1234.13152, 6000); // odstep liczony jest od lewej....

    }

    private static void foreache() {
        //foreach....
        //petla foreach sluzy do szybkiego przechodzenia po kolekcjach ale takze i po tablicach!!!!
        int[] array = {5, 6, 1, 9, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int element : array) {     // nie podajemy warunku wykonywania.... ZAWSZE iterujemy po wszystkich elementach...
            // w kazdej iteracji element staje sie obecnym elementem w tablicy po ktorej iterujemy...
            System.out.println(element);
        }

        //skladnia
        // for(typ element : tablica/kolekcja){
        //
        // }

    }


}
