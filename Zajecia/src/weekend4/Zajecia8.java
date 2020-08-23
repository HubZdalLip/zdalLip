package weekend4;

import java.util.*;

public class Zajecia8 {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    public static void main(String[] args) {
//        exWithShape();

        collections();

    }

    private static void collections() {
//        exWithList1();
//        exWithList2();
        exWithSet1();


    }

    private static void exWithSet1() {
        //zadanie
        // a) dodaj do seta 5 elementow typu double
        // b) oblicz srednia z tych elem
        // c) zwroc rozmiar seta
        // d) jesli set zawiera element bedacy srednia ze wszsytkich elementow to zwroc komunikat: jest ok!
        // e) wlosuj do seta 3 wartości i sprawdz czy rozmiar bedzie rowny 8: jesli tak to zwroc komunikat, jesli nie to tez



    }

    private static void exWithList1() {
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
            if (i % 2 == 0) {
                System.out.println(stringList.get(i));      //h)
            }
        }
        System.out.println(stringList.size());          //i)

    }

    private static void exWithList2() {
        // zadanie
//        a) stworz liste integerow
//        b) dodawaj liczby od uzytkownika w petli az wpisze -1 - ta liczba nie powinna sie znalezc w liscie
//        c) gdy uzytkownik wpisze replace to elementy ktorych wartosc jest wieksza niz 4 bedą podmienione na polowe swojej obecnej wartosci
//        d) gdy uzytkownik wpisze insert to dodaj trzy losowe liczby na poczatku listy
//        e) gdy uzytkownik wpisze remove to spytaj sie o indeks do usuniecia i usun ten element
//        f) gdy uzytkownik wpisze average to zwroc srednia arytmetyczna dla drugiej polowy listy

//        gdy exit to wyjdzie

        List<Integer> integerList = new ArrayList<>();      //a)

        getElements(integerList);                   //b)

        scanner.nextLine();
        while (true) {
            System.out.println("Podaj operacje");

            switch (scanner.nextLine()) {
                case "replace":
                    replaceElements(integerList);
                    System.out.println(integerList);
                    break;
                case "insert":
                    insertOnBeg(integerList);
                    System.out.println(integerList);
                    break;
                case "remove":
                    removeAtIndex(integerList);
                    System.out.println(integerList);
                    break;
                case "average":
                    averageForHalf(integerList);
                    break;
                case "exit":
                default:
                    return;
            }
        }

    }

    private static void averageForHalf(List<Integer> integerList) {
        List<Integer> half = new ArrayList<>();
        for (int i = integerList.size() / 2; i < integerList.size(); i++) {
            half.add(integerList.get(i));
        }
        double average = calculateAverage(half);
        System.out.println("Oto średnia dla elementow "+ half+" : " + average);

    }

    private static double calculateAverage(List<Integer> half) {
        double sum = 0;
        for (int elem : half) {
            sum += elem;
        }
        return sum / half.size();
    }

    private static void removeAtIndex(List<Integer> integerList) {
        System.out.println("Podaj indeks do usuniecia!");
        int index = scanner.nextInt();
        if (index <= integerList.size()) {
            integerList.remove(index);
        } else {
            System.out.println("Index jest poza lista!");
        }
        scanner.nextLine();
    }

    private static void insertOnBeg(List<Integer> integerList) {
        for (int i = 0; i < 3; i++) {
            integerList.add(0, random.nextInt(20));
        }
    }

    private static void replaceElements(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 4) {
                integerList.set(i, integerList.get(i) / 2);
            }
        }
    }

    private static void getElements(List<Integer> integerList) {
//        List<Integer> integerList = new ArrayList<>();
        while (true) {
            System.out.println("Podaj liczbę! Wpisz -1 jeśli chcesz zakończyć!");
            int number = scanner.nextInt(); // w javie wystepuje mechanizm autoboxingu i autounboxingu....
            if (number == -1) {                             //b)
                break;
            }
            integerList.add(number);
        }
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
