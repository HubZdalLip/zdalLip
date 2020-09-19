package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class IntelligentTeacher {
    private static final Scanner scanner = new Scanner(System.in);
    private final File file;
    private final List<Word> wordList;

    public IntelligentTeacher(File file) {
        this.file = file;
        wordList = new ArrayList<>();
        addToList();
    }

    private void addToList() {
        Map<String, String> flashesAsMap = FileUtilsFlashcards.getFlashesAsMap(file);
        addToList(flashesAsMap);
    }

    public void addToList(Map<String, String> map) {
        if (map != null) {
            map.forEach((k, v) -> wordList.add(new Word(k, v)));
        }
    }

    public void addToList(String text) {
        String[] splitted = text.split("-");
        wordList.add(new Word(splitted[0], splitted[1]));
    }

    public void sendToVer(String pol, String ang) {
        Map<String, String> flashesAsMap = FileUtilsFlashcards.getFlashesAsMap(file);

        assert flashesAsMap != null; // w chwili gdy flash bedzie nullem zostanie rzucony od razu wyjatek....
        String angValue = flashesAsMap.get(pol);

        if (angValue.equals(ang)) {
            wordList.stream()
                    .filter(s -> pol.equals(s.getPol()) && angValue.equals(s.getAng()))
                    .findFirst()
                    .ifPresent(s -> s.setGood(s.getGood() + 1));
        } else {
            wordList.stream()
                    .filter(s -> pol.equals(s.getPol()) && angValue.equals(s.getAng()))
                    .findFirst()
                    .ifPresent(s -> s.setBad(s.getBad() + 1));
        }
    }

    private List<String> submitAll() {
        wordList.sort((w1, w2) -> Double.compare(w2.submit(), w1.submit()));
        List<String> stringList = new ArrayList<>();
        for (Word word : wordList) {
            String text = "Słówko " + word.getPol() + " zostało podane poprawnie " + String.format("%.2f", word.submit()) + " % razy";
            stringList.add(text);
        }
        return stringList;
    }

    public void genReport() {
        System.out.println("Wybierz formę");
        System.out.println("1.Konsola");
        System.out.println("2.Plik txt");
        switch (scanner.nextInt()) {
            case 1:
                generateInConsole();
                break;
            case 2:
                generateToTxt();
        }
    }

    private void generateToTxt() {
        List<String> list = submitAll();
        try {
            Files.write(Paths.get("raport.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateInConsole() {
        submitAll().forEach(System.out::println);
    }

}
