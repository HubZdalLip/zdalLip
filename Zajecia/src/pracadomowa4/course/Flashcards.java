package pracadomowa4.course;

import java.util.*;

public class Flashcards {
    private Map<String, String> flashcards; // pole okreslajace zbior slowek w jezyku polskim i ang

    public Flashcards() {
        this.flashcards = init();       // konstruktor bezparametrowy, ktorego celem jest inicjalizacja fiszek
        //aby nie zasmiecac konstrutkora to inicjalizacja wstepna zachodzi w prywatnej metodzie init()
    }

    private Map<String, String> init() {
        Map<String, String> map = new HashMap<>();  //tworzenie mapy
        map.put("praca", "work");
        map.put("krzeslo", "chair");
        map.put("niebo", "sky");
        map.put("czerwony", "red");
        map.put("swiatlo", "light");
        map.put("gitara", "guitar");
        return map;     //zwracamy mape do mapy fiszek
    }

    public void addToFlashCards(String pol, String eng) {
        if (pol == null || eng == null) {       // metoda przyjmuje parametry po polsku i po ang , sprawdza czy nie sa one nullami ,
            return;                             // a nastpenie wrzuca do mapy
        }
        flashcards.put(pol, eng);
    }

    public String getWordByTransaltion(String pol) {        // metoda przyjmujaca slowo po polsku i po weryfikacji czy dane slowo istnieje w bazie
        if (flashcards.containsKey(pol)) {                  // zwraca po ang
            return flashcards.get(pol);     // jesli fiszki posiadaja klucz to zgarniamy wartosc
        }
        return "Nie ma takiego słowa w bazie!";
    }

    public void showFlashcards() {                          // metoda wyswietlajaca fiszki
        flashcards.forEach((k, v) -> System.out.println(k + " - " + v));
//        for (Map.Entry<String, String> entry : flashcards.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
    }

    public void sortFlashCardsEasy() {                      // metoda sortujaca alfabetycznie
        flashcards = new TreeMap<>(flashcards);
//        Map<String,String> map = new TreeMap<>();         // zapis rownoznaczny
//        map.putAll(flashcards);
//        flashcards = map;
    }

    public void shuffleFlashCards() {                       // hashuje mape
        flashcards = new HashMap<>(flashcards);
    }

    public Map<String, String> getFlashed() {               //getter do mapy fiszek
        return flashcards;
    }
}
