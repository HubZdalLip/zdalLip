package pracadomowa4.course;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Course {
    private static final Scanner scanner = new Scanner(System.in);

    private Mode mode = Mode.BASIC;
    private Flashcards flashcardsObject;
    private final Map<String, Integer> knownWords = new LinkedHashMap<>();
    private Map<String, String> flashcards;
    private boolean checkState = false;

    private LocalDateTime start;
    private LocalDateTime end;

    public void practise() {
        if (failValidate()) {
            return;
        }
        knownWords.clear();

        Map<String, String> copy = new LinkedHashMap<>(flashcards);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext() && (mode == Mode.EXTENDED || copy.size() > flashcards.size() / 2)) {
            Map.Entry<String, String> actual = iterator.next();
            String actualKey = actual.getKey();
            String actualValue = actual.getValue();

            System.out.println("Podaj znaczenie słowa: " + actualKey);
            String valueFromUser = scanner.next();
            if (actualValue.equals(valueFromUser)) {
                if (mode == Mode.EXTENDED) {
                    knownWords.put(actualKey, knownWords.getOrDefault(actualKey, 0) + 1);
                    System.out.println("Podałeś to słówko " + knownWords.get(actualKey) + " poprawnie razy");
                    if (knownWords.get(actualKey) == 3) {
                        iterator.remove();
                    }
                } else {
                    System.out.println("Poprawnie!");
                    iterator.remove();
                }
            } else {
                System.out.println("Niepoprawnie!");
            }

            if (!iterator.hasNext()) {
                iterator = copy.entrySet().iterator();
            }
        }
        checkState = true;
    }

    public void exam() {
        if (failValidate() || !checkState) {
            System.out.println("Zalicz ćwiczenia najpierw");
            return;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("EGZAMIN! Jeśli trzeba to naciśnij enter");
        System.out.println("Masz " + flashcards.size() * 3 + " sekund");
        scanner.nextLine();

        setStartTime();
        double valid = 0;
        for (Map.Entry<String, String> entry : flashcards.entrySet()) {
            System.out.println("Podaj znaczenie słowa " + entry.getKey());
            String input = scanner.nextLine();
            if (entry.getValue().equals(input)) {
                valid++;
            }
            setEndDate();

            if (!checkIfValidTime()) {
                System.out.println("Upłynął czas, niezdany egzamin...");
                return;
            }
            System.out.println("Pozostało " + remainingTime() + " sekund");
        }
        double result = valid / flashcards.size();

        showResults(result);

    }

    private void showResults(double result) {
        System.out.println("Twój wynik to " + String.format("%.2f", result * 100) + " % ");
        if (result >= 0.5) {
            System.out.println("Egzamin zdany!");
        } else
            System.out.println("Egzamin oblany!");
    }

    private long remainingTime() {
        return flashcards.size() * 3 - Duration.between(start, end).getSeconds();
    }


    private boolean checkIfValidTime() {
        return Duration.between(start, end).getSeconds() < flashcards.size() * 3;
    }

    private void setEndDate() {
        end = LocalDateTime.now();
    }

    private void setStartTime() {
        start = LocalDateTime.now();
    }

    private boolean failValidate() {
        return mode == null || flashcardsObject == null || flashcards == null;
    }

    public enum Mode {
        BASIC, EXTENDED
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        checkState = false;
    }

    public void updateFlashcards(Flashcards flashcardsObject) {
        this.flashcardsObject = flashcardsObject;
        this.flashcards = flashcardsObject.getFlashed();
    }

}
