package weekend5;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zajecia10 {
    public static void main(String[] args) {
//        exWithChangingChars();
        exWithFiles();
        exWithFiles2();


    }

    private static void exWithFiles2() {
        // stworz kilka plikow w dowolnej lokalizacji, a nastepnie wyswietl tylko te z roszerzeniem csv dodatkowo sortujac je alfabetycznie

    }

    private static void exWithFiles() {
        String path = "C:\\Users\\Hubert\\Desktop\\folderTest";
        File fileDir = new File(path); //mimo ze to jest file, to jest on folderem ( ze wzgledu na podana sciezke)
        System.out.println(fileDir.isDirectory());
        File[] files = fileDir.listFiles();
        System.out.println(Arrays.toString(files));
        if (files == null) {
            return;
        }
        for (File file : files) {
            System.out.println(file.getName());
        }

//        methodI(files);
        methodII(fileDir);

    }

    private static void methodII(File fileDir) {
//        FileFilter
//        a) albo tworzymy klase implementujaca interfejs                           // musimy tworzyc nowa klase, ktorej nigdzie juz nie uzyjemy
//        b) albo tworzymy klase anonimowa ktora dajemy bezposrednio do listFiles   // tworzymy klase anonimowa ktora zaciemnia kod lekko ale wszystko jest w ejdnym meijscu
//        c) albo tworzymy lambde                                                   // tworzymy lambde ktora jest zwiezla, nie musimy ani zaciemniac kodu ani twowrzyc nowej klasy

//        File[] files = fileDir.listFiles(new FileFilter() {
//            // te pliki ktorych nazwa po przetworzeniu zwroci true zostana przypisane do tablicy, te co false - nie
//            @Override
//            public boolean accept(File pathname) {
//                return !pathname.getName().startsWith(".") && pathname.getName().endsWith(".docx");
//            }
//        });

        // te pliki ktorych nazwa po przetworzeniu zwroci true zostana przypisane do tablicy, te co false - nie
        File[] files = fileDir.listFiles(pathname -> !pathname.getName().startsWith(".") && pathname.getName().endsWith(".docx"));

        System.out.println("Plik z rozszerzeniem docx");
        System.out.println(Arrays.toString(files));

        System.out.println("Plik z rozszerzeniem csv");
        File[] files1 = fileDir.listFiles((dir, name) -> !name.startsWith(".") && name.endsWith("csv"));
        System.out.println(Arrays.toString(files1));



    }

    private static void methodI(File[] files) {
        List<File> fileList = new ArrayList<>();
        for (File file : files) {
            if (!file.getName().isEmpty() && !file.getName().startsWith(".") && file.getName().endsWith(".txt")) {
                fileList.add(file);
            }
        }
        System.out.println();
        System.out.println("Pliki txt:");
        for (File file : fileList) {
            System.out.println(file.getName());
        }

    }

    private static void exWithChangingChars() {
        //zadanie: zamien w stringu 2 znak z 1, 4 z 3 , itd....
        System.out.println(modify("Hubert"));
        System.out.println(modify("Ksiazka"));
        System.out.println(modify("Kurs"));
        System.out.println(modify("Cos"));
    }

    private static String modify(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < text.length(); i = i + 2) { // w chwili gdy "Hubert" ma 6 znakow to jest, jak Hubertt ma 7 to w chwili przejscia na i = 8
            char charAtSecPos = text.charAt(i); // znak na pozycji n
            char charAtFirPos = text.charAt(i - 1); //znak na pozycji n - 1
            stringBuilder.append(charAtSecPos).append(charAtFirPos);
        }
        if (text.length() % 2 == 1) {           // w chwili gdy mamy nieparzysta liczbe znakow w tekscie dopisuejmy na sztywno ostatni wczesniej
//            przez nas pominiety znak
            stringBuilder.append(text.charAt(text.length() - 1));
        }

        return stringBuilder.toString();
    }

}
