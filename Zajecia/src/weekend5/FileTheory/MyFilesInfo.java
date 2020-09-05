package weekend5.FileTheory;

import java.io.*;
import java.util.Scanner;

public class MyFilesInfo {

    private static String name = "plikUtworoznyWdgDobrychPraktyk.txt";
    private static Scanner scanner = new Scanner(System.in);

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

        File file = createNewFile(); //metoda ktora tworzy plik
////        writeToNewFile(file);
//        writeToNewFileTryWithResources(file);
//


        appendToFile(file);

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
