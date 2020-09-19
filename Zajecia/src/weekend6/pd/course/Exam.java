package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Exam {

    private static final String winPattern = "" +
            " ------------------CERTYFIKAT------------------ " + System.lineSeparator() +
            "Z przyjemnością pragnę poinformować że Pan/Pani " + System.lineSeparator() +
            "                   :nameSurname                 " + System.lineSeparator() +
            "  osiągnął/ła :results na egzaminie znajomości  " + System.lineSeparator() +
            "               języka angielskiego              " + System.lineSeparator() +
            "          tym samym zdobywając ocenę :grade     ";

    private static final String losePattern = "" +
            " -------------------PORAŻKA-------------------- " + System.lineSeparator() +
            "               Niestety Pan/Pani                " + System.lineSeparator() +
            "                  :nameSurname                  " + System.lineSeparator() +
            "  osiągnął/ła :results na egzaminie znajomości  " + System.lineSeparator() +
            "               języka angielskiego              " + System.lineSeparator() +
            "   tym samym nie zaliczając testu ostatecznego  ";

    private static final Scanner scanner = new Scanner(System.in);


    private final File file;
    private final Map<String, String> flashcards;
    private LocalDateTime start;
    private LocalDateTime end;
    private double result;
    private boolean isPassed;
    private final String infoAboutStudent;

    public Exam(File file, String infoAboutStudent) {
        this.file = file;
        this.infoAboutStudent = infoAboutStudent;
        flashcards = FileUtilsFlashcards.getFlashesAsMap(file);
    }

    public void execute() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("EGZAMIN! Jeśli trzeba to naciśnij enter");
        System.out.println("Masz " + flashcards.size() * 3 + " sekund");
        scanner.nextLine();

        setStartTime();
        double[] valid = {0};
        flashcards.forEach((k, v) -> {
            System.out.println("Podaj znaczenie słowa " + k);
            String input = scanner.nextLine();
            if (v.equals(input)) {
                valid[0]++;
            }
            setEndDate();

            if (!checkIfValidTime()) {
                System.out.println("Upłynął czas, niezdany egzamin...");
                return;
            }
            System.out.println("Pozostało " + remainingTime() + " sekund");
        });

        result = 100 * valid[0] / flashcards.size();
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

    public void showResults() {
        isPassed = result > 50;

        System.out.println("Wybierz formę:");
        System.out.println("1.Konsola");
        System.out.println("2.Wydruk txt");
        switch (scanner.nextInt()) {
            case 1:
                printInConsole();
                break;
            case 2:
                printToTxt();
        }
    }

    private void printToTxt() {
        String pattern = modifyPattern();
        try {
            Files.write(Paths.get("results.txt"), Collections.singleton(pattern));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printInConsole() {
        System.out.println(modifyPattern());
    }

    private String modifyPattern() {
        String copy;

        if (isPassed) {
            copy = winPattern;
            copy = copy.replace(":nameSurname", infoAboutStudent);
            copy = copy.replace(":results", String.format("%.2f", result) + " %");
            copy = copy.replace(":grade", calcGrade());
        } else {
            copy = losePattern;
            copy = copy.replace(":nameSurname", infoAboutStudent);
            copy = copy.replace(":results", String.format("%.2f", result) + " %");
        }
        return copy;

    }

    private String calcGrade() {
        if (result > 50 && result <= 65) {
            return "C";
        }
        if (result > 65 && result <= 85) {
            return "B";
        }
        if (result > 85) {
            return "A";
        }
        return "F";
    }

}
