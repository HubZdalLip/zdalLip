package zajecia1;

public class Zajecia1 {

    /**
     * Metoda sluzy do uruchamiania
     *
     * @param args buibui
     */
    public static void main(String[] args) {
        //nazwa klasy musi być taka sama jak nazwa kalsa w drzewku projetkowym
        //zawsze musi być metoda main

        //konwencja camel case
        // - nazwa klasa: Pierwsza litera duza, reszta malych: Zajecia, ObliczanieCzegosTam. Nazwa klasa MUSI (powinna) odzwierciedlac to co dana klasa wykonuje, BRAK bialych znakow, cyfry moga byc ale nie na jako pierwszy znak
        // - nazwa zmiennej: brak bialych znakow, NIEZALECANE podkreslniki, cyfry moga byc ale nie na poczatku, pierwszy wyraz caly male litery, nastepny wyraz pierwsza liera duza, reszta male, int cosTam, int obliczanie, int nazwaJakiejMegaDlugiejZmiennej,
        // nazwa zmienna MUSI odzwierciedlac to za co odpwoeidzialna jest dana zmienna , int
        // nazwy zmiennych, nazwy klas powinny być anglojezyczne

        // komentarze: (mega polecam robic, wiaodmo o co chodzi pozniej w kodzie
        // // - komentarz jednoliniowy - istenieje srkot klawiszowy ctrl+/
        // /* - komentarz blokowy

//
//            cos tam blabla
//                sdfsdfsd
//                sdf
//

        // stackoverflow, dokumentacja, Java Podstawy Horstmann, Thinking in Java (dla bardziej zaaw) (95% aktualne, 5% przestarzale), Programowanie w Javie. Solidna wiedza w praktyce. Wydanie XI Paul Deitel, Harvey Deitel

        //PO KAZDEJ LINIJCE MUSI BYC SREDNIK
        //napis wewnatrz metody println musi być wewnątrz cudzyslowiu
        System.out.println("Hello world!"); // metoda zakonczona println przechodzi do kolejnej linii
        System.out.println("World is beautiful");
        System.out.println();
        System.out.print("Hello world!"); //metoda print nieposiada niejawnego przejscia do nowej linii
        System.out.print("World !");
        System.out.println();
//        System.out.printf("","");

        // -1 -  zamkniecie przez uzytkownika reczne POPRAWNE
        // 0  -  koniec programu - zakonczenie POPRAWNE
        // 1   -  koniec programu ze wzgledu na blad - NIEPOPRAWNE

        // wewnatrz katalogu out....nazwa_klasy.class - postac po kompilacji, uzupelniona o konieczne funkcjonalnosci ktrocyh samych nie musimy pisac

//        konwencja TYP_ZMIENNEJ NAZWA_ZMIENNEJ = WARTOSC_ZMIENNEJ; opcja 2 TYP_ZMIENNEJ NAZWA_ZMIENNEJ;

        String helloWorld = "Hello World";
        System.out.println(helloWorld);
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + " " + world);
        // String - typ (na chwile oebcna mowimy na to zmienna) przechowujacy teskt
        System.out.println("Hello" + " " + world);

        //zadanie 1
        //Wyswietl na konsoli napis Programming is easy
//        a) za pomoca trzech zmiennych i dodatkowo bez przejscia do nastepnej linii
//        b) za pomoca dwoch zmiennych i literalu znakowego z dodatkowym przejsicem do nast linii


        String programming1 = "Programming "; // zmienna nr1
        String is = "is ";                    // zmienna nr2
        String easy = "easy ";                // zmienna nr3
        System.out.print(programming1 + is + easy); // bez przejscia do nast linii ---- zmienna1+ zmienna2 + zmienna 3

        String programming2 = "Programming "; // zmienna nr1
        String is2 = "is ";                   // zmienna nr2
        System.out.println(programming2 + is2 + "easy"); // przejeiscie do nast linii bo println - zmienna1+zmienan2+"easy"

        // zadanie 2
        // Wyswietl na konsoli napis "I am (imie)." z tym że imie ma byc zmienna. Ma wystapic przejscie do nast linii
        // Wyswietl w nowej linii napis I am student. z tym że dwa wyrazy (bez student) maja byc zmiennymi a student ma byc literalem znakowym typu String (cudzyslow)

//        Output: I am Hubert.
//                I am student.

        String imie;                            // zmienna oznaczajaca imie         DEKLARACJA (istnienia w pamieci) ZMIENNEJ i DEFINICJA I INICJALIZACJA
//        imie = "Michal";                      // nadpisanie zmiennej              NOWA DEFINICJA, DEKLARACJA JEST WYZEJ
//        imie = "Krzysztof";
        imie = "Cos tam";

        System.out.println("I am " + imie + ".");   // gotowy literal+ zmienna+ gotowy literal
        String i = "I ";                        // zmienna1
        String am = "am ";                      // zmienna2
        System.out.println(i + am + "student"); // zmienna1+zmeinna2 + gotowy literal

        // TIP - ctrl+alt+l -> refactoring kodu

        // debug - robaczek - pozwala na ZATRZYMANIE DZIALANIA PROGRAMU WE WSKAZANYM MEIJSCU W KODZIE

        String nazwisko, nrTelefonu, cosTam;    //  = String naziwsko; String nrTelefonu; String cosTam                           DEKLARACJA TYLKO WTEDY GDY OKRESLAMY TYP!!!!
        nazwisko = "NOWAK";
        nrTelefonu = "123456789";
        String nazwisko2 = "Kowalski";
        nazwisko2 = nazwisko;   // nazwisko2 to juz nie jest kwoalski tylko NOWAK
        System.out.println(nazwisko);
        System.out.println(nazwisko2);
        nrTelefonu = nazwisko;
        nrTelefonu = "123456789";
        String nazwiskoNowaka = nazwisko;       // JUZ PRZY DEKLARACJI INICJALIZUJEMY WARTOSCIA ZMIENNEJ NAZWISKO CZYLI "NOWAK"

        System.out.println();
        System.out.println("Cos tam \nponon");         // w javie wystepuja znaki ucieczki ktore poprzedzone sa backslashem. W literale nie mozna uzyc backslasha od tak
        System.out.println();
        System.out.print("Pan Nowak powiedzial: \"Jestem nowak\" ");          // backslash umozliwia ominiecie zdefiniowanego przez jave znaku np "", \ ,
                                                            // \n,\r,

        //zadanko
        // a) Wyswietlic na konsoli napis Programming is easy uzywajac JEDNEJ metody print lub println w taki sposob aby kazdy wyraz byl w nowej linii, podpowiedz TRZEBA UZYC ZNAKU UCZIECKI
        // b) zadeklarowac zmienne typu String o nazwie computer, keyboard i zdefiniowac ich wartosc tesktowa NIE przy deklaracji. wyswietlic na ekranie
    }
}
