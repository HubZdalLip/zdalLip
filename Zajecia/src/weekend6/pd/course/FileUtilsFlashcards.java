package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//finalna klasa to taka po ktorej nie mozna dziedziczyc
public final class FileUtilsFlashcards {
    //klasa utils to klasa narzedziowa czyli taka ktora nie posiada stanu, ma same metody statyczne
    public static void saveToFile(File file, Map<String, String> map) {
        //zapisujemy do pliku w postaci "klucz - wartosc"
        List<String> list = new ArrayList<>();
        map.forEach((k, v) -> list.add(k + " - " + v));
        //metoda statyczna write przyjmuje sciezke i iterable
        try {
            Files.write(Paths.get(file.getAbsolutePath()), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveToFile(File file, String text) {
        try {
            Files.write(Paths.get(file.getAbsolutePath()), Collections.singletonList(text), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveToFile(File file, List<String> list) {
        try {
            Files.write(Paths.get(file.getAbsolutePath()), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showFC(File flashcardsFile) {
        try {
            Files.lines(Paths.get(flashcardsFile.getAbsolutePath()))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getWordByTrans(File file, String pol) {
        try {
            Optional<String> stringOptional = Files.lines(Paths.get(file.getAbsolutePath()))              //trim() metoda ktora usuwa spacje (nie liczac tych wewnatrz, np      text =>text
                    .filter(s -> pol.equals(s.split("-")[0].trim()))
                    .map(s -> s.split("-")[1])
                    .findFirst();

            if(stringOptional.isPresent()){
                return stringOptional.get();
            }else{
                throw new IllegalStateException("Nie znaleziono fiszki!");
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void sortAlf(File file) {
        try {
            List<String> list = Files.readAllLines(Paths.get(file.getAbsolutePath()));
            list.sort(Comparator.naturalOrder());
            saveToFile(file, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void shuffleFC(File file) {
        try {
            List<String> list = Files.readAllLines(Paths.get(file.getAbsolutePath()));
            Collections.shuffle(list);
            saveToFile(file, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> getFlashesAsMap(File flashcardsFile) {
        try{
            Function<String,String> keyCreator = s1 -> s1.split("-")[0].trim();         //metoda split dzieli wg zadanego regexa, tutaj jest to "-" czyli gdy np praca - job to rezultat jest string[0] = praca i string[1] = job
            Function<String,String> valueCreator = s1 -> s1.split("-")[1].trim();

            return Files.lines(Paths.get(flashcardsFile.getAbsolutePath()))
                    .collect(Collectors.toMap(keyCreator,valueCreator));

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
}
