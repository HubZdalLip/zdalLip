package weekend6.pd.course;

import java.io.File;
import java.util.*;

public class Flashcards {
    private final File flashcardsFile;
    private Decorator decorator;

    public Flashcards() {
        decorator = new LowerDecorator();
        flashcardsFile = new File("flashcards.txt");
        init();
    }

    private void init() {
        Map<String, String> map = new HashMap<>();
        map.put("praca", "work");
        map.put("krzeslo", "chair");
        map.put("niebo", "sky");
        map.put("czerwony", "red");
        map.put("swiatlo", "light");
        map.put("gitara", "guitar");

        //operacja wyslania do pliku
        FileUtilsFlashcards.saveToFile(flashcardsFile, map);

    }

    public void decorate() {
        decorator.decorate(flashcardsFile);
    }

    public void addToFlashCards(String pol, String eng) {
        if (pol == null || eng == null) {
            return;
        }
        FileUtilsFlashcards.saveToFile(flashcardsFile, pol + " - " + eng);
    }

    public String getWordByTransaltion(String pol) {
        return FileUtilsFlashcards.getWordByTrans(flashcardsFile, pol);
    }

    public void showFlashcards() {
        FileUtilsFlashcards.showFC(flashcardsFile);
    }

    public void sortFlashCardsEasy() {
        FileUtilsFlashcards.sortAlf(flashcardsFile);
    }

    public void shuffleFlashCards() {
        FileUtilsFlashcards.shuffleFC(flashcardsFile);
    }

    public Map<String, String> getFlashed() {
        return FileUtilsFlashcards.getFlashesAsMap(flashcardsFile);
    }

    public File getFile() {
        return flashcardsFile;
    }

    public void chooseDecorator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz dekorator!");
        System.out.println("1. Lower");
        System.out.println("2. Upper");
        System.out.println("3. Mixed");
        switch (scanner.nextInt()){
            case 1:
                decorator = new LowerDecorator();
                break;
            case 2:
                decorator = new UpperDecorator();
                break;
            case 3:
                decorator = new MixedCaseDecorator();
        }
    }
}
