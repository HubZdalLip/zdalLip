package weekend5.FileTheory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilesInfo {
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



    }
}
