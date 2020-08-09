package weekend3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Zajecia5 {
    String var = "blabla";

    public static void main(String[] args) {

//        foreache();
//        printfIStringFormat();
//        overloadedMethods();
//        randomNumbers();
//        classes();
//        staticFields();
        microHomeWork();

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

        User user1 = new User();
        user1.showInfoAboutUser();
        User user2 = new User("Zbyszek", 60, "Gdansk");
        user2.showInfoAboutUser();
        user1.originCity = "Radom";
        user2.originCity = "Wroclaw";
        user1.showInfoAboutUser();
        user2.showInfoAboutUser();

        String stringVariable = User.staticMethod();
        System.out.println(stringVariable);

//      Przyklad
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 1);

        // generowanie szybkie w klasie... alt+insert...

        System.out.println(point1.x);
        System.out.println(point1.y);
        System.out.println();
        System.out.println(point2.x);
        System.out.println(point2.y);

        double distance = Point.distance(point1, point2);
        System.out.printf("Odlegosc miedzy punktami wynosi: %.3f %n", distance);

        thisKeyword();


    }

    private static void thisKeyword() {
        //this - wieloznaczeniowe slowo kluczowe...
        // odnoszace sie do doslownie tego (obecnego) obiektu
        Point point = new Point(5, 4);
        point.showX();


    }

    private static void staticFields() {
        System.out.println(Dog.counter);
        System.out.println(Dog.info);
        Dog dog = new Dog();
//        dog.info; // nie da sie dostac do tych pol.... sa statyczne....
//        dog.counter;

    }

    private static void microHomeWork() {

        //        Zadanie
//        stworzyc klase Rectangle
//        a) stworzyc konstruktor ustawiajacy wartosci bokow prostokata
//        b) stwprzyc metoda niestatyczna obliczajaca pole
//        c) stworzyc metoda statyczna obliczajaca pole
//        d) stworzyc pole statyczne ktore zlicza ilosc utworzonych prostokatow ktorych ktorys bok ma wartosc wieksza niz 5
//        e) stworzyc metode ktora obliczy obwod prostokata

//        Zadanie
//        stworzyc klase UserFactory ktora
//        a) bedzie posiadac metode createUser
//              wewnatrz metody program spyta sie uzytkownika o wartosci imienia oraz adresu... metoda ma zwrocic nowego usera
//        b) dodac walidacje ktora sprawdzi czy user ma imie ktore nie jest puste. Jesli jest to zamiast nowego usera program ma zwrocic pusta referencje...
//        c) dodac walidacje na etapie klasy w ktorej obiekt jest tworzony np Zajecia5, w ktorym srpawdzasz czy dany obiekt istnieje... jesli tak to wyswietl inforamcje
//            jesli nie - umiesc komunikat
//
//        Zadanie
//        stworzyc klase A i B
//        - klasa A ma posiadac metoda statyczna przyjmujaca tekst i zwracajaca pierwsza i ostatnia litere
//        - klasa B ma posiadac metode niestatyczna przyjmujaca tekst i zwracajaca tekst od tylu...
//

//        konwencja - tworzenie klas
//        kazda klasa tworzona
//        - musi nie posiadac bialych znakow
//        - powinna zgodnie z konwencja zaczynac sie od wielkeij litery , nastepne wyrazy z malej
//
//        CuteDogo
//        Employee
//        SalaryEmployee
//        VeryLongNameOfClass
//
//
        System.out.println();
        System.out.println();
        System.out.println();
//        System.out.println("Zadanie z UserFactory");
//        User createdUser = UserFactory.createUser();
//        if (createdUser != null) {  // w przypadku nullow uzywamy porownania ==
//            createdUser.showInfoAboutUser();
//        } else {
//            System.out.println("Blad przy tworzenia Usera. Referencja ma wartosc null. Obiekt nie istnieje!! ");
//        }
//
//        //wyrazenie z koniunkcja wywolywane jest od lewej do prawej. Jesli warunek kolejno z lewej strony bedzie falszem to anstepne nie zostnaa wywolane nawet.....
//        //wyrazenie z alternatywea wywolywane jest od lewej do prawej. Jesli warunek kolejno z lewej strony bedzie prawda to anstepne nie zostnaa wywolane nawet.....
//
//        if (createdUser != null && createdUser.age > 15) {
//            // warto zapamietac taki sposob walidowania!
//            //
//        }
//        //aby w koniunkcji wszystkie warunki zostaly wywolane to nalezy uzyc zamiast operatora && => &
//        //aby w alternatywie wszystkie warunki zostaly wywolane to nalezy uzyc zamiast operatora || => |

//        System.out.println("Zadanie z prostokatem");
//        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
//        System.out.println("Podaj parametry a i b !");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(a, b);
//        System.out.println("Pole obliczone indywidualnie dla danego obiektu " + rectangle.calculateArea());
//        new Rectangle(5, 7);
//        new Rectangle(50, 7);
//        new Rectangle(556, 7);
//        new Rectangle(2, 3);
//        new Rectangle(1, 3);
//        System.out.println("Utworzono " + Rectangle.counter + " obiektow ktorych jakis bok maja wartosc wieksze od 5");
//        System.out.println("Pole obliczone statycznie, po prostu metoda obliczeniowa... " + Rectangle.calculateAreaForSentParameters(6, 9));
//        System.out.println("Obwod dla obiketu nowego jest rowny " + new Rectangle(6, 1).calculateCircumreference());


        System.out.println("Pierwszy i ostatni znak to " + Arrays.toString(A.getSomeChars("SentText")));
        B b1 = new B(); // odowlanie do konsturtkora domyslnego

//        public B(){
//            //domyslny kosntrutkor dla B
//        }

        System.out.println("Odwcrony tekst dla \"jakisTekst\" to " + b1.getInvertedText("jakisTekst"));





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
