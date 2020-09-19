package weekend6.pd;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) {
        zad2();
    }

    private static void zad2() {
//        Napisz program, w którym zapiszesz do pliku dowolne liczby lub litery. Następnie odczytaj wpisane wartości. Litery ułóż w jedno zdanie, cyfry zsumuj.
        int total = 0;
        StringBuilder textSB = new StringBuilder();

        File file = saveToFile();

        List<String> content = getFromFile(file);


        //sposob I - sprawdzenie czy podany input miesci sie w znakach ascii w wartosciach okreslajacyh liczby
        //sposob II - uzycie metody instanceOf
        //sposob III - try-catch, probujemy sparsowac input do liczby np Integer.parseInt, jesli sie nie uda to wiadomo ze to litera!
        for (String text : content) {
            if (checkIfNumber(text)) {
                int number = Integer.parseInt(text);
                total += number;
            } else {
                textSB.append(text);
            }
        }

        System.out.println("Suma liczb wpisanych do pliku to " + total);
        System.out.println("Całkowity tekst wpisany do pliku to " + textSB.toString());


    }

    private static List<String> getFromFile(File file) {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String fromFile = scanner.next();
                list.add(fromFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static File saveToFile() {
        Scanner scanner = new Scanner(System.in);
        File file = new File("inputs.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            while (true) {
                String input = scanner.next();

                if ("exit".equals(input)) {
                    break;
                }

                printWriter.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static boolean checkIfNumber(String input) {
        for (char singleChar : input.toCharArray()) {
            if (singleChar < 48 || singleChar > 57) {
                return false;
            }
        }
        return true;
    }
}
