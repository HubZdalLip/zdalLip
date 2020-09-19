package weekend6.pd.course;

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
    private final String infoAboutUser;
    private IntelligentTeacher intelligentTeacher;
    private boolean isPremium;

    public Course(String infoAboutUser) {
        this.infoAboutUser = infoAboutUser;
    }

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
            if (isPremium) {
                intelligentTeacher.sendToVer(actualKey, valueFromUser);
            }
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

        Exam exam = new Exam(flashcardsObject.getFile(), infoAboutUser);
        exam.execute();
        exam.showResults();

    }

    private boolean failValidate() {
        return mode == null || flashcardsObject == null || flashcards == null;
    }

    public void generateReport() {
        if (isPremium) {
            intelligentTeacher.genReport();
        } else {
            System.out.println("Nie masz wykupionej opcji premium!");
        }
    }

    public enum Mode {
        BASIC, EXTENDED, PREMIUM
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        checkState = false;
        if (mode == Mode.PREMIUM) {
            premiumUtil();
        }
    }

    private void premiumUtil() {
        if (flashcardsObject == null) {
            System.out.println("Ukończ chociaż tryb podstawowy");
            return;
        }
        mode = Mode.EXTENDED;
        isPremium = true;
        intelligentTeacher = new IntelligentTeacher(flashcardsObject.getFile());
    }

    public void updateFlashcards(Flashcards flashcardsObject) {
        this.flashcardsObject = flashcardsObject;
        this.flashcards = flashcardsObject.getFlashed();
    }

}
