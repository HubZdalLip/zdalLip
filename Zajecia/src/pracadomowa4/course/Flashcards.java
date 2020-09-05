package pracadomowa4.course;

import java.util.*;

public class Flashcards {
    private Map<String, String> flashcards;

    public Flashcards() {
        this.flashcards = init();
    }

    private Map<String, String> init() {
        Map<String, String> map = new HashMap<>();
        map.put("praca", "work");
        map.put("krzeslo", "chair");
        map.put("niebo", "sky");
        map.put("czerwony", "red");
        map.put("swiatlo", "light");
        map.put("gitara", "guitar");
        return map;
    }

    public void addToFlashCards(String pol, String eng) {
        if (pol == null || eng == null) {
            return;
        }
        flashcards.put(pol, eng);
    }

    public String getWordByTransaltion(String pol) {
        if (flashcards.containsKey(pol)) {
            return flashcards.get(pol);
        }
        return "Nie ma takiego słowa w bazie!";
    }

    public void showFlashcards() {
        flashcards.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    public void sortFlashCardsEasy() {
        flashcards = new TreeMap<>(flashcards);
    }

    public void shuffleFlashCards() {
        flashcards = new HashMap<>(flashcards);
    }

    public Map<String, String> getFlashed() {
        return flashcards;
    }
}
