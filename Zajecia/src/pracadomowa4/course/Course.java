package pracadomowa4.course;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Course {
    private static final Scanner scanner = new Scanner(System.in);  //obiekt scannera w celu niezapychania pamieci scannerami

    private Mode mode = Mode.BASIC;             // domyslnie kurs jest podstawowy
    private Flashcards flashcardsObject;        // pole okreslajace klase fiszek
    private final Map<String, Integer> knownWords = new LinkedHashMap<>();      // pole okreslajace znane juz slowka
    private Map<String, String> flashcards;     // pole okreslajace konkretnie fiszki
    private boolean checkState = false;         // pole sprawdzjaace czy chcemy przystapic do egzamzinu przed zaliczonymi cwiczeniami

    private LocalDateTime start;                // pola okreslajace date
    private LocalDateTime end;

    public void practise() {
        if (failValidate()) {       // walidacja czy potrzebne obiekty sa nullami, jesli tak to anuluj praktyke
            return;
        }
        knownWords.clear();         // na poczatku czyscimy mape znanych slowek

        Map<String, String> copy = new LinkedHashMap<>(flashcards);     //tworzymy kopie mapy fiszek
        // kopia jest po to aby nie pracowac na oryginale, ktory ulegalby modyfikacji, w takim przypadku moznaby cwiczyc jedynie raz

        // tworzymy iterator to par klucz-wartosc... iterator pozwoli na modyfikacje (konkretnie usuwanie) fiszek z kopii w chwili znania slowka
        // zwykle remove nie przejdzie, w chwili wywolanai metody remove w petli otrzymamy wyjatek
        // ConcurrentModificationException
        // WYJASNIENIE:
//        w chwili wejscia do petli zapewniamy ja ze jej rozmiar sie nei zmieni...
//        z momentem zmiany tego rozmiaru rzucany jest wyjatek
//        iterator zapisuje wartosci do swojej struktury, po usuwania z niego elementow usuwamy je z konkretnej kolekcji jednak nie jest ona w petli
//        czyli nie dostajemy wyjatku

        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator(); //inicjalizacja iteratora
        while (iterator.hasNext() && (mode == Mode.EXTENDED || copy.size() > flashcards.size() / 2)) {
            // czesc iteartor.hasNext() && mode == Mode.EXTENDED dotyczy kursu rozszerzonego
//            czesc iteartor.hasNext() && copy.size() > flashcards.size() / 2 dotyczy kursu podstawowego
//            hasNext - sprawdzamy czy element nastepny istnieje...
//            jakbysmy odwolali sie do metody next() a elementu by nie bylo to rzucony bedzie wyjatek NoValuePresentException
            Map.Entry<String, String> actual = iterator.next();         // na poczatku zgarniamy wartosc pary klucz-wartosc, np praca-work
            String actualKey = actual.getKey();                         //obecny klucz
            String actualValue = actual.getValue();                   //obecna wartosc prawdziwa

            System.out.println("Podaj znaczenie słowa: " + actualKey);          //informacja podaj znaczenie slowka
            String valueFromUser = scanner.next();              //wartosc od usera np work
            if (actualValue.equals(valueFromUser)) {           // jesli uzytkownik ma racje
                if (mode == Mode.EXTENDED) {                    //sprawdzamy czy kurs czy jest rozszerzony czy podstawowy
                    knownWords.put(actualKey, knownWords.getOrDefault(actualKey, 0) + 1);
                    //jesli slowko jest poprawne to obecny klucz dodamy do mapy lub zmodfyikujemy isntiejacy:
//                    a) gdy to slowko jest za pierwszym razem to getOrDefault zwroci 0, dodajemy 1 => podano porpawnei 1 razy
//                    b) gdy slowko juz bylo podane poprawnie to getORDeafult da ilosc poprawnych podan, dodajemy 1 => podano poprawnie n razy (n<=3)
                    System.out.println("Podałeś to słówko " + knownWords.get(actualKey) + " poprawnie razy");
                    if (knownWords.get(actualKey) == 3) {
                        iterator.remove();          //gdy podamy element poprawnie 3 razy to dopiero wtedy usuwamy z kopii...
                    }
                } else {
                    System.out.println("Poprawnie!");               // w chwili gdy uzytkownik podal poprawnie slowko (kurs pods)
                    iterator.remove();                              //usuwamy ten element z kopii mapy w celu niewyswietlania go w dalszej nauce
                }
            } else {
                System.out.println("Niepoprawnie!");            // jesli uzytkwonik pomylil sie, np wpisal wokr a nie work to przechomy tutaj
            }

            if (!iterator.hasNext()) {      // jesli juz nei ma wartosci, a ktores slowko zostalo ominiete, to pobierz od poczatku ponownie iterator
                iterator = copy.entrySet().iterator();
            }
        }
        checkState = true;          //ustawiono znacznik zaliczono cwiczenia
    }

    public void exam() {
        if (failValidate() || !checkState) {            //sprawdzamy czy nic nie jest nullem i czy zaliczylismy cwiczenia
            System.out.println("Zalicz ćwiczenia najpierw");
            return;
        }

        System.out.println();
        System.out.println();
        System.out.println();               // tutaj male entery
        System.out.println();
        System.out.println("EGZAMIN! Jeśli trzeba to naciśnij enter");      // czasmi trzeba nacisnac enter aby rpzeszlo dalej
        System.out.println("Masz " + flashcards.size() * 3 + " sekund");    // powiadomienie o pozostalej ilosci czasu bedacej 3xliczby fiszek
        scanner.nextLine();

        setStartTime();                 //ustawimy date rozpoczecia egzaminu
        double valid = 0;               //ilosc poprwanych slowek
        for (Map.Entry<String, String> entry : flashcards.entrySet()) {         //iteracja po wszystkich fiszkach
            System.out.println("Podaj znaczenie słowa " + entry.getKey());      //podaj znaczenie np praca
            String input = scanner.nextLine();                      //info od usera, np work
            if (entry.getValue().equals(input)) {               // jesli
                valid++;                                        //dodajemy do zaliczonych
            }
            setEndDate();           // po podaniu slowka sprawdzamy godzine
            // na ogol ten system ma wady poneiwaz jest jednowatkowy
//            glowna wada => mozemy czekac nneiskonczona ilsoc czasu az uzytkwonik poda slowko
//
//            dedykowany system wielowatkowy, na ejdnym watku egzamin, na drugim lecacy czas, jesli sie skonczy to robimy interrupta do watkow

            if (!checkIfValidTime()) {
                System.out.println("Upłynął czas, niezdany egzamin...");
                return;
            }
            System.out.println("Pozostało " + remainingTime() + " sekund");         //wyswietlamy ile zostalo czasu
        }
        double result = valid / flashcards.size();          // liczymy wyniki

        showResults(result);

    }

    private void showResults(double result) {
        System.out.println("Twój wynik to " + String.format("%.2f", result * 100) + " % ");     //wynik podany w %, String.format w celu zusyaknia 2 miejsc po przecinku
        if (result >= 0.5) {        // jesli mamy polowe slowek lub wiecej poprawnie to egzamin ejst zaliczony
            System.out.println("Egzamin zdany!");
        } else
            System.out.println("Egzamin oblany!");
    }

    private long remainingTime() {
        return flashcards.size() * 3 - Duration.between(start, end).getSeconds();
    }


    private boolean checkIfValidTime() {
        return Duration.between(start, end).getSeconds() < flashcards.size() * 3;
        // metoda statyczna beetween bada okres czasu miedzy podanymi datami, parsujemy wynik do sekund
    }

    private void setEndDate() {
        end = LocalDateTime.now();
    }

    private void setStartTime() {
        start = LocalDateTime.now();            // obecna wartosc czasu
    }

    private boolean failValidate() {
        return mode == null || flashcardsObject == null || flashcards == null;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        checkState = false;         // po zmianie trybu ustawiamy cwiczenia na niezaliczone ( aby ktos np nie zaliczyl pdost i nie przeszedl na roz)
    }

    public void updateFlashcards(Flashcards flashcardsObject) {
        this.flashcardsObject = flashcardsObject;
        this.flashcards = flashcardsObject.getFlashed();
    }

    public enum Mode {
        BASIC, EXTENDED
    }

}
