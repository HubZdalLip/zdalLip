package weekend3;

public class Zajecia5 {
    public static void main(String[] args) {
        //foreach....
        //petla foreach sluzy do szybkiego przechodzenia po kolekcjach ale takze i po tablicach!!!!
        int[] array = {5, 6, 1, 9, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int element : array) {     // nie podajemy warunku wykonywania.... ZAWSZE iterujemy po wszystkich elementach...
            // w kazdej iteracji element staje sie obecnym elementem w tablicy po ktorej iterujemy...
            System.out.println(element);
        }

        //skladnia
        // for(typ element : tablica/kolekcja){
        //
        // }

        // printf
//        System.out.println();
//        System.out.print();
        System.out.printf("Jestem w metodzie printf. Argument to %s. Teraz bedzie arg2: %s , teraz arg 3 %s, a teraz arg 4: %s ", "ARGUMENT!!", "Argument2", "argument3", "argument 4");
        System.out.println();
        String name = "Krzysztof";
        System.out.printf("Jestem %s mam %d lat", name, 50);
        System.out.println();

//        %s - do stringow
//        %d - do liczb
//        %f - do floatow
//        %n - nowa linia
//        %t - daty....

        //zad przepisz na printf

        String city = "Krakow";
        int years = 30;
        name = "Piotrek";
        System.out.println("Mieszkam w " + city + ". Jestem tutaj od " + years + " lat. Moj brat na imie " + name);

        System.out.printf("Mieszkam w %s. Jestem tutaj od %d lat. Moj brat ma na imie %s", city, years, "Piotr");
        System.out.println();
        // jest mozliwosc okreslenia precyzji danej liczby
        double x = 123.456789;
        System.out.printf("Liczba x to %.3f %n", x);       // %._LICZBA_MIEJSC_f

        // istnieje takze mozliwosc okreslenia odstepu miedzy argumentami....
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.printf("%5d", i * j);                   //odstep tworzymy piszac % ODSTEP d
            }
            System.out.println();
        }

        //dziala tak samo jak printf.....
        System.out.println("Magiczna liczba! Wynois ona " + String.format("%5d", 10));


        //zad. podaj liczbe i wyswietl ja z jednym miejscem po przecinku.
//             Podaj dwie liczby i wyswietl je w zadanym przez siebie odstepie

        


    }
}
