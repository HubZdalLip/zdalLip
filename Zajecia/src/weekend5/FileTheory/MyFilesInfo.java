package weekend5.FileTheory;

import java.io.*;
import java.util.*;

public class MyFilesInfo {

    private static String name = "plikUtworoznyWdgDobrychPraktyk.txt";
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        // podstawy, informacje o pliku
        File file = new File("data.txt");
        // jest to postac abstrakcyjna.... czyli jakby szkielet plik zostal utworozny, jest on przygotowany do tego by go boslugiiwac ale jeszcze nie istnieje

        try {
            System.out.println(file.exists());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.getCanonicalPath());
            boolean cond = file.createNewFile();
            System.out.println(cond);
            System.out.println(file.getName());
        } catch (IOException e) {
            System.out.println("Blad");
        }
        // zadanie
        // a) stworzyc plik, wywolac metody przestawiajace głowne wlasnosci tego pliku
        // b) stworzyc drugi plik, jesli nazwa bedzie taka sama co pierwszego to dopisac 1 do nazwy, w celu utworzoeniu nowego pliku

        try {
            File file1 = new File("anotherFile.txt"); // a)
            System.out.println(file1.exists());
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
            System.out.println(file1.getPath());
            file1.createNewFile();
            System.out.println(file1.exists());
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
            System.out.println(file1.getPath());
        } catch (IOException e) {
            System.out.println(e);
        }
        // b)

        try {
            String name = "anotherFile.txt";
            int i = 1;
            File file2 = new File(name);
            if (file2.createNewFile()) {
                System.out.println("Utworzono nowy plik");
            } else {
                System.out.println("Plik już istnieje");
                String newName = name.substring(0, name.length() - 4) + i++ + ".txt";
                System.out.println(newName);
                File file3 = new File(newName);
                file3.createNewFile();
//            file3.delete();
                file3.deleteOnExit();
//            new Scanner(System.in).nextLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

//
//        try{
//
//        }
        PrintWriter writer = null;
        try {
            //zapis do pliku....
            File file1 = new File("newFile.txt");
            writer = new PrintWriter(file1);
            writer.println("Jakas linijka");
            writer.println("Another text");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // zadanie:
//         a) stworz plik,
//         b) stworz pole statyczne okresjace nazwe pliku,
//         c) wydziel metode do stworzoenia pliku,
//         d) stworz metode wpisujaca do pliku

//        File newFile = createFile();
//        writeToFile(newFile);


        fileExercise();


    }

    private static void fileExercise() {

        // zadanie:
        // a) stwórz metode pytającą o nazwę pliku i stwórz plik o tej nazwie
        // b) stworz metode zapisujaca tekst do pliku w petli wg tego co wpisze uzytkownik
        // c) gdy uzytkwonik wpisze exit wyjdz

//        File file = createNewFile(); //metoda ktora tworzy plik
////        writeToNewFile(file);
//        writeToNewFileTryWithResources(file);
//

//        appendToFile(file);

//        readFromFile(file);

        fileEx();

        ex1();

        ex2Home();


    }

    private static void ex2Home() {
//        Napisz program, który wczyta plik tekstowy o nazwie dane.txt (znaki ASCII),
//        a następnie wypisze pobrane znaki w konsoli.
//        A. Następnie stwórz histogram wystąpienia znaków w tekście. Wyniki zapisz do pliku
//        wyniki.txt
//              Histogram - popularny wykres statystyczny służący do przedstawienia
//              wyników.
//        B. Zamień miejscami dwa najczęściej występujące znaki w tekście i zapisz cały
//        zmieniony ciąg do pliku podmiana.txt
//        C. Odwróć kolejnością wszystkie znaki, a następnie zapisz je do pliku wspak.txt
//        D. ** zamień pierwszy znak z drugim, trzeci z czwartym, itd.

    }

    private static void ex1() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
//        zadanie
//        cz I
//            a) stworz plik, nadaj nazwe od uzytwkonika
//            b) pytaj uzytkownika od liczby
//            c) jesli są większe od 0 to wpisz je do pliku, a jesli mniejsze to do listy
//        cz II
//            d) odczytaj plik i wypisz najwiekszy oraz najmniejszy element
//            e) wylicz srednia ze wszystkich liczb (tych z listy dla ujemnych liczb tez)


        File file = createNewFile(); //a)
        List<Integer> integerList = appendToFileOrReturnList(file); //b,c)
        List<Integer> readElementsFromFile = readListFromFile(file); //d)

        int max = calcMax(readElementsFromFile);        //d)..
        int min = calcMin(readElementsFromFile);

        List<Integer> listWithWholeContent = new ArrayList<>();
        listWithWholeContent.addAll(integerList);
        listWithWholeContent.addAll(readElementsFromFile);

        double average = calcAverage(listWithWholeContent); //e)

        System.out.println("Lista z ujemnymi liczbami: " + integerList);
        System.out.println("Lista z liczbami ktore zostaly zapsiane w pliku : " + readElementsFromFile);
        System.out.println("Lista ze wszystkimi liczbami : " + listWithWholeContent);

        System.out.println("Element max to: " + max);
        System.out.println("Element min to: " + min);
        System.out.println("Srednia ogolna to :" + average);


    }

    private static double calcAverage(List<Integer> listWithWholeContent) {
        double total = 0;
        for (Integer tempInt : listWithWholeContent) {
            total += tempInt;
        }
        return total / listWithWholeContent.size();

    }

    private static int calcMax(List<Integer> readElementsFromFile) {
        int max = Integer.MIN_VALUE;
        for (Integer tempInt : readElementsFromFile) {
            if (tempInt > max) {
                max = tempInt;
            }
        }
        return max;
    }

    private static int calcMin(List<Integer> readElementsFromFile) {
        int min = Integer.MAX_VALUE;
        for (Integer tempInt : readElementsFromFile) {
            if (tempInt < min) {
                min = tempInt;
            }
        }
        return min;
    }

    private static List<Integer> readListFromFile(File file) {
        try (Scanner scanner = new Scanner(file)) {
            List<Integer> tempList = new ArrayList<>();
            while (scanner.hasNext()) {
                tempList.add(scanner.nextInt());
            }
            return tempList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static List<Integer> appendToFileOrReturnList(File file) {
        List<Integer> integerList = new ArrayList<>();
        try (PrintWriter writer = new PrintWriter(file)) {
            while (true) {
                System.out.println("Podaj liczbe");
                int intValue = scanner.nextInt();
                if (intValue == -1) {
                    break;
                }
                if (intValue > 0) {
                    writer.println(intValue);
                } else {
                    integerList.add(intValue);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return integerList;

    }

    private static void fileEx() {

        // zadanie stworz plik o nazwie napisy.txt
        // zczytaj wszystkie linijki jakie sa w tekscie
        // wyswietl liczbe linijek


        try (Scanner scanner = new Scanner(new File("napisy.txt"))) {
            List<String> lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
            System.out.println(lines);
            System.out.println(lines.size());       // liczba linijke czyli rozmiar listy

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    private static void readFromFile(File file) {
        try (Scanner scannerForFiles = new Scanner(file)) { // konstrukcja try-with-resources tworze scannera tylkod la pliku. Tego scannera do niczego innego nie uzyejmy
//            po koncu try zostanie on zamkniety
            List<String> textsFromFile = new ArrayList<>(); // lista dolecowo przechowujaca elementy z pliku
            while (scannerForFiles.hasNext()) {           //dopoki istnieje nastepna linijka
                textsFromFile.add(scannerForFiles.next()); //dodaj do listy
            }
            System.out.println(textsFromFile);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }
    }

    private static void appendToFile(File file) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            scanner.nextLine();
            while (true) {
                System.out.println("Podaj tekst");
                String textFromUser = scanner.nextLine();
                if ("exit".equals(textFromUser.toLowerCase())) {
                    break;
                }
                fileWriter.append(textFromUser).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToNewFileTryWithResources(File file) {
        //tworzac printwritera w ten sposob zadamy aby z chwila wyjscia z bloku try-catch zostal on zamkniety .close() i wszelkie dane na jego temat zostaly wyczyszczone
        try (PrintWriter printWriter = new PrintWriter(file)) {
            scanner.nextLine();
            while (true) {
                System.out.println("Podaj tekst");
                String textFromUser = scanner.nextLine();
                if ("exit".equals(textFromUser.toLowerCase())) {
                    break;
                }
                printWriter.println(textFromUser);
            }
        } catch (FileNotFoundException e) {
            System.out.println("NIe udalo sie odnalezc pliku");
            System.out.println(e.getMessage());
        }
    }

    private static void writeToNewFile(File file) {
        try {
            scanner.nextLine();
            PrintWriter printWriter = new PrintWriter(file);
            while (true) {
                System.out.println("Podaj tekst");
                String textFromUser = scanner.nextLine();
                if ("exit".equals(textFromUser.toLowerCase())) {
                    break;
                }
                printWriter.println(textFromUser);
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createNewFile() {
        System.out.println("Podaj nazwę pliku");
        String name = scanner.next();
        return new File(name + ".txt");
    }

    private static void writeToFile(File newFile) {
        try {
            PrintWriter printWriter = new PrintWriter(newFile);
            printWriter.println("Some texts");
            printWriter.println("Another texts");
            printWriter.println("Another texts");
            printWriter.println("Another texts");
            printWriter.println("Another texts");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile() {
        return new File(name);
    }
}
