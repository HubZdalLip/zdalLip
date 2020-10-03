package weekend7.mockexam.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    private static final String INIT_PATH = "src/weekend7/mockexam/task2/";

    public static void main(String[] args) {

        List<String> list = getFromFile(); // 1)

        Map<Character, Integer> characterIntegerMap = histogram(list); //2_

        String[] arr = transformToArray(characterIntegerMap); //2)

        saveToFile(arr, "hist.txt"); //2)

        char firstPlace = returnMostOften(characterIntegerMap, null); // 3)
        char secPlace = returnMostOften(characterIntegerMap, firstPlace); // 3)

        List<String> replaced = replaceInList(list, firstPlace, secPlace); // 3)

        saveToFile(replaced.toArray(new String[0]), "zamiana.txt"); // 3)

        List<String> reversed = reverseList(list); // 4)

        saveToFile(reversed.toArray(new String[0]), "wspak.txt"); // 4)

    }

    private static List<String> reverseList(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> reversed = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(list.size() - i - 1));
            reversed.add(stringBuilder.reverse().toString());
            stringBuilder = new StringBuilder();
        }

        return reversed;
    }

    private static List<String> replaceInList(List<String> list, char firstPlace, char secPlace) {
        List<String> replaced = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String text : list) {
            for (char character : text.toCharArray()) {
                if (character == firstPlace) {
                    sb.append(secPlace);
                } else if (character == secPlace) {
                    sb.append(firstPlace);
                } else {
                    sb.append(character);
                }
            }
            replaced.add(sb.toString());
            sb.delete(0, sb.length()); // usuwamy wszystkie znaki
        }
        return replaced;
    }

    private static char returnMostOften(Map<Character, Integer> characterIntegerMap, Character bypass) {
        int max = 0;
        char maxAsChar = ' ';
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            if (entry.getValue() > max && !entry.getKey().equals(bypass)) {
                max = entry.getValue();
                maxAsChar = entry.getKey();
            }
        }
        return maxAsChar;
    }

    private static void saveToFile(String[] arr, String whereToSave) {
        try {
            Files.write(Paths.get(INIT_PATH + whereToSave), Arrays.asList(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] transformToArray(Map<Character, Integer> map) {
        return map.entrySet().stream()
                .map(s -> "Litera " + s.getKey() + " wystąpiła " + s.getValue() + " razy")
                .toArray(String[]::new);
    }

    private static Map<Character, Integer> histogram(List<String> list) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (String text : list) {
            for (char character : text.toCharArray()) {
                if (map.containsKey(character)) {
                    map.replace(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
        return map;
    }

    private static List<String> getFromFile() {

        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get(new File(INIT_PATH + "literki.txt").getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Rozpatrywany tekst:");
        list.forEach(System.out::println);
        return list;
    }
}
