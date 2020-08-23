package weekend4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zajecia8 {
    public static void main(String[] args) {
        exWithShape();

        lists();

    }

    private static void lists() {

        // zadanie
        // a) stworz liste String a nastepnie dodaj do niej 3 elementy
        // b) wyswietl tylko te ktore maja wiecej niz 3 znaki
        // c) dodaj jeszcze 4 elementy
        // d) usun co drugi element
        // e) wyswietl wyniki....
        // f) stworz kolejna liste String zawierajaca 3 stringi
        // g) dodaj cala liste do pierwszej listy
        // h) dla indeksow parzystych wyswietl elementy
        // i) pokaz rozmiar

        System.out.println();
        System.out.println();
        List<String> stringList = new ArrayList<>();
        stringList.add("element1");
        stringList.add("element2");             //a)
        stringList.add("element3");
        for (String elem : stringList) {
            if (elem.length() > 3) {
                System.out.println(elem);       //b)
            }
        }
        stringList.add("element4");
        stringList.add("element5");             //c)
        stringList.add("element6");
        stringList.add("element7");

        //uzycie tzw iteratora....
        stringList.remove("element1");
        stringList.remove("element3");
        stringList.remove("element5");       //d)
        stringList.remove("element7");

        System.out.println(stringList);         //e)

        List<String> anotherList = new ArrayList<>(Arrays.asList(
                "anotherElem1",
                "anotherElem2",                 //f)
                "anotherElem3"
        ));

        stringList.addAll(anotherList);         //g)

        System.out.println(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0){
                System.out.println(stringList.get(i));      //h)
            }
        }
        System.out.println(stringList.size());          //i)


        // zadanie
//        a) stworz liste integerow
//        b) dodawaj liczby od uzytkownika w petli az wpisze -1 - ta liczba nie powinna sie znalezc w liscie
//        c) gdy uzytkownik wpisze replace to elementy ktorych wartosc jest wieksza niz 4 bedą podmienione na polowe swojej obecnej wartosci
//        d) gdy uzytkownik wpisze insert to dodaj trzy losowe liczby na poczatku listy
//        e) gdy uzytkownik wpisze remove to spytaj sie o indeks do usuniecia i usun ten element
//        f) gdy uzytkownik wpisze average to zwroc srednia arytmetyczna dla drugiej polowy listy


    }

    private static void exWithShape() {
        //      Stworz interfejs Shape z metoda getArea i getPerimeter
//        a) stworz dodatkowo klasy Rectangle, Square ktory bedzie dziedziczyc po Rectangle, Triangle oraz Circle
//           ktore beda odppwiednio implementowac ten interfejs
//        b) stworz tablice ksztaltow i wyswietl wyniki!

        Shape[] shapes = new Shape[]{
                new Rectangle(4, 3),
                new Square(3),
                new Triangle(2, 3, 4),
                new Circle(5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}
