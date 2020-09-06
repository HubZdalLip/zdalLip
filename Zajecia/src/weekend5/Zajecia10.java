package weekend5;

import java.io.File;
import java.util.*;
import java.util.stream.IntStream;

public class Zajecia10 {
    public static void main(String[] args) {
//        exWithChangingChars();
//        exWithFiles();
//        exWithFiles2();
        streams();

    }

    private static void streams() {
//        strumien - struktura danych uzywajaca lambd oraz interfejsow z pakietu function udostepnionego w Javie 8
//        ciekawostka - praktycznie cale programowanie w JS opiera sie na strumieniach, lambdach, prog. funkcyjnym

        IntStream.range(0, 10).forEach(s -> System.out.println(s));
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // IntStream - tworze strumien intow
        // range - zakres ktorego ma dotyczyc stream, tzw potok
        // w kazdej operacji strumienia brany jest kolejny element

//        0 idzie do forEach i zastepuje w lambdzie zmienna s ( s=0 ). nastepneie wywolywana jest metoda sout(s);
//        1 idzie do forEach i zastepuje w lambdzie zmienna s ( s=1 ). nastepneie wywolywana jest metoda sout(s);
//        2 idzie do forEach i zastepuje w lambdzie zmienna s ( s=2 ). nastepneie wywolywana jest metoda sout(s);
//        3 idzie do forEach i zastepuje w lambdzie zmienna s ( s=3 ). nastepneie wywolywana jest metoda sout(s);
//        ..
//        ..
//        ..
//        n idzie do forEach i zastepuje w lambdzie zmienna s ( s=n ). nastepneie wywolywana jest metoda sout(s); gdzie n jest w zakresie range (a,n-1)

        IntStream.rangeClosed(4, 7).forEach(s -> System.out.print(s + ", "));
        System.out.println();
        for (int i = 4; i <= 7; i++) {
            System.out.print(i + ", ");
        }

        int sumFromStream = IntStream.rangeClosed(1, 10).sum();          // kazdy element strumienai po kolei jest dodawany do siebie
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println();
        System.out.println("Suma klasycznie: " + total);
        System.out.println("Suma funkcyjnie: " + sumFromStream);

        // zadanie:
        // a) wygenerować strumień 10 liczb zaczynając od 5 i wyświetlić je na ekranie
        // b) zsumować taki sam strumień

        IntStream.range(5, 15)
                .forEach(s -> System.out.println(s));
        System.out.println(IntStream.range(5, 15).sum());

        mapping();
        someExamplesOfEagerOperations();


    }

    private static void someExamplesOfEagerOperations() {
        int sum;
//        OptionalDouble average;         //optional to taki obiekt ktory nie moze posiadac nulla. Jesli Optional ma wartosc null to rzucany jest wyjatek NoValuePresentException
        double average;
        int max;
        int min;
        long count;

        int[] ints = {1, 5, 3, 2, -9, 4, 4, 1, -4, -8};
        sum = IntStream.of(ints)
                .sum();
        average = IntStream.of(ints)
                .average()
                .getAsDouble();
        max = IntStream.of(ints)
                .max()
                .getAsInt();
        min = IntStream.of(ints)
                .min()
                .getAsInt();
        count = IntStream.of(ints)
                .count();

        System.out.println(Arrays.toString(ints));
        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Ilość elementów: " + count);

        IntSummaryStatistics statistics = IntStream.of(ints)
                .summaryStatistics();

        System.out.println(statistics);

        // zadanie
//        stworz liste elementow int. Beda one uzupelniane w petli losowymi wartosciami 5 razy. Nastepnie w losowe indeksy wstaw 5 elementow ktore
//        sam dodasz. Nastepnie wyswietl max, min i srednia tych elementow


    }

    private static void mapping() {
        System.out.println("Mapowanie");
        IntStream.rangeClosed(1, 10)              // instrukcja tworzenia strumienia
                .map(s -> s * 2)            // instrukcja mapowania, czyli kazdy element ktory wejdzie do mapy jest zamieniany na to co sie dzieje w lambdzie
                .forEach(s -> System.out.println(s));       // instrukcja wysweitlania, jest to rowniez instrukcja konczaca czyli gorliwa

        IntStream.rangeClosed(1, 15)
                .map(s -> s * 2)
                .mapToObj(s -> "Liczba " + s)
                .forEach(s -> System.out.println(s));

        IntStream.rangeClosed(10, 100)
                .asDoubleStream() // sprawiamy by strumien by nie intow juz a doubli
                .map(s -> s / 5)        // dzielenie kazdego elementu przez 5
                .forEach(s -> System.out.println(s));

        IntStream.rangeClosed(0, 10)
                .mapToDouble(s -> s * 2)
                .forEach(s -> System.out.println(s));


        //zadanie
//        a) stworz IntStream skladajacy sie z 10 liczb
//        b) zmapuj ten stream tak aby kazdy element byl dzielony przez 5 i dodatkowo byl dodawany tekst : Mapuję!
//        c) wyświetl strumień
//
        IntStream.rangeClosed(0, 10)                //IntStream === Stream<Integer>
                .asDoubleStream()                   //DoubleStream === Stream<Double>
                .mapToObj(s -> "Mapuję " + s / 2)   // Stream<String>
                .forEach(System.out::println);    // metoda referencyjna, mozliwa do niej konwersja jest tylko wtedy, gdy
        // metoda wywolywana w lambdzie przyjmuje tylko parametr lambdy i nic wiecej sie nei dzieje
        // zapis ten ^^^ oznacza odwolanie sie do metody println klasy System i obiketu out z aktualnym parametrem

    }

    private static void exWithFiles2() {
        // stworz kilka plikow w dowolnej lokalizacji, a nastepnie wyswietl tylko te z roszerzeniem csv dodatkowo sortujac je alfabetycznie
        String path = "C:\\Users\\Hubert\\Desktop\\folderTest";     //sciezka
        File[] files = new File(path).listFiles(((dir, name) -> !name.startsWith(".") && name.endsWith(".csv"))); //filtrowanie
        // 1. new File(path) => tworze "plik" (tutaj to jest folder)
        // 2. listuje pliki by dowiedziec sie co jest w srodku
        // 3. uzywam intefejsu FilenameFilter(dir, name) za pomoca lambdy odfiltrowywujac je do tych z roz .csv
        if (files != null) {
            System.out.println(new TreeSet<>(Arrays.asList(files)));
        }
        // uzywam TreeSet domyslnie sortujacego alfabetycznie, ktory przyjmuje kolekcje w konsturktorze (opcjonalnie)
        // aby tablica stala sie kolekcja mozemy uzyc metody Arrays.asList();
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
