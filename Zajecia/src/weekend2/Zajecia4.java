package weekend2;

import java.util.Scanner;

public class Zajecia4 {
    public static void main(String[] args) {
        //petle cd.
//
//        for (int i = 50; i > 0; i = i - 3) {
//            System.out.println(i);
//        }
//
//        //i-- , i++                         //rownoznaczne
//        // i=i-1,  i=i+1
//        //10 = 10 -1      10=10+1
////        i=9              i=11
//
//        //zadanie wyswietlic na ekranie liczby od 100 do 0 z krokiem rownym 20
//
//        for (int i = 100; i >= 0; i = i - 20) {                 // konwencja, nazwa moze byc teoretycznie dowolna ale w malych petlach zaleca sie uzywac indeksow
//            // i, j, k , l, index
//            System.out.println(i);
//        }
//
//        //zakres danych
//
//        int x;                  // zmienna stworzona w danym bloku istnieje tylko w tym bloku i w blokach bardziej zagniezdzonych
//        if (true) {
//            x = 0;
//        }
//
//        System.out.println(x);
//
//        // petla II rodzaj
////        while(){
////
////        }
//        //skladnia
////        while(warunek){}
//        System.out.println();
//        System.out.println("To jest petla while");
//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);          // i = 10; i = 9
//            i--;                // tutaj UWAGA (do wyjasnienia) i = 10, i = 9
//            // i = 9;   , i = 8;
//        }
//
//        // zadanie wyswietlic liczby od 30 do 20 z krokiem 2 za pomoca petli while
//
//        i = 30; //nadpisanie
//        while (i >= 20) {
//            System.out.println(i);
//            i = i - 2;
//        }
//        //jesli chodzi o petle while to warunek sprawdzany jest NA POCZATKU
//
//        //roznica miedzy do-while a while jest taka ze sa one IDENTYCZNE oprocz tego ze do while wykona sie MINIMUM RAZ
//        // roznica druga - po napisaniu while musi byc srednik!!!!
//
//
//        do {
//            // operacje jakies
//            // jesli chcesz kontynuowac to nacisnij 1
//        } while (i > 0); // <- srednik
//
//
////        zadanie napisac program ktory bedzie wyswietlal na ekranie napis "Hello" do chwili gdy uzytkownik wpisze 1, jesli wpisze co innego kontynuowac
//
//        Scanner input = new Scanner(System.in);
//        int x1;
//        do {
//            System.out.println("Hello");
//            System.out.println("Czy chcesz kontynuowac??");
//            x1 = input.nextInt();   // tutaj uzytkownik wpisuje swoja wartosc... jesli 1 to w while 1!=1, jesli 2 != 1
//        } while (x1 != 1);  // czy 1 rozne od 1 ??? falsz...
//        System.out.println("Wyszedlem z petli");

//
//        // zadanie napisac program ktory bedzie wyswietlal kolejne liczby naturalne do chwili gdy uzytkownik wpisze koniec lub exit....
//        Scanner input = new Scanner(System.in);
//        int i = 0;
//        String text;                // nadrzednie tworze i oraz text poniewaz z koncem klamry niewidoczny bylby text(tyczy sie to zakresu)
//        do {
//            System.out.println(i);  //wyswietlamy liczbe natualrana
//            i = i + 1;              //zwiekszamy ja o 1
//            System.out.println("Czy chcesz zakonczyc");     //pytamy czy zakocnzycy
//            text = input.next();        //sciagamy od uzytkwonika wartosc
//        } while (!text.equals("koniec") && !text.equals("exit"));       //sprawdzamy czy nie rowna jest ona koniec i czy nierowna jest ona exit


        // zadanie napisac program ktory bedzie wyswietlal liczby w odpwoeidnim trybie:
        // a) jesli uzytkownik wpisze liczbe 1 to wyswietla mu sie liczby od 1 do 10        - (uzyc for) wewnatrz jednej iteracji nalezy wywolac petle ktora wyswietli liczby....
        // b) jesli wpisze 2 to od 1 do 50 ale tylko podzielne przez 10
        // c) jesli wpisze 3 to koniec programu....

//        for (int j = 0; j < 10; j++) {
//            for (int k = 0; k < 10; k++) {
//                System.out.println("Nadrzedny licznik j " + j);
//                System.out.println("    Podrzedny licznik k " + k);
//            }
//        }


//        Scanner input = new Scanner(System.in);
//        int numberFromUser;                 // liczba od usera
//        do {
//            System.out.println("Jaki wybrac tryb: 1 , 2 , 3");
//            numberFromUser = input.nextInt();               //wybranie trybu
//            if (numberFromUser == 1) {                      //podpunkt a)
//                for (int i = 1; i <= 10; i++) {             // petla wyswietlajaca liczby od 1 do 10
//                    System.out.println(i);
//                }
//            } else if (numberFromUser == 2) {               //podpunkt b)
////                for (int i = 10; i <= 50; i = i + 10) {       //alternatywa...
////
////                }
//                for (int i = 1; i <= 50; i++) {
//                    if (i % 10 == 0) {
//                        System.out.println(i);
//                    }
//                }
//            }
//
//        } while (numberFromUser != 3);                  // jesli liczba od usera rowna 3 to falsz bo 3 nie jest rozne od 3


//        zadanie napisasc program ktory w petli bedzie pytal uzytkownika o tryb:
//        a) jesli bedzie rowny "parzyste" to spyta o zakres gorny petli , np parzyste, 10 => 0,2,4,6,8,10
//        b) jesli bedzie rowny "nieparzyste" to spyta o zakres gorny petli , np nieparzyste, 8 => 1,3,5,7
//        c) jesli bedzie rowny exit/wyjdz/koniec to zakonczy dzialanie programu.... UWAGA! podpunkt c) powinien dzialac dla wyrazow takze z rozna wielkoscia znakow
//                  ExiT, WYJDZ,kONiEc .... WSKAZOWKA: cofnac sie do zajec nr 3 i sprawdzic metody ktore wykorzsytywalismy ze stringami....
//
//        jesli wynik (tryb) jest inny, nie rob nic
//
//        algorytm

//        1. pytaj o tryb
//        2. jesli tryb jest przypisany do jakiejs akcji to spytaj o gorny zakres petli, wywloaj inna petle
//        3. spraw aby wybrany tryb zostal na poczatku zmodyfikowany tak, aby pasowal... jesli tryb bedzie rowny warunkom z c) to wyjdz....
//        4. do innego trybu nie przypisuj nic, powrot do 1)
//


//        Zadanie napisz program ktory bedzie w zaleznosci od trybu (String) :
//        a) dodaj  => pytal o dwie liczby typu int i wyswietlil sume
//        b) odejmij => pytal o dwie liczby typu int i wyswietlil roznice
//        c) koniec => konczy dzialanie programu....
        


//        for (licznik; WARUNEK WYKONANIA PETLI => ile razy ma sie petla wykonac ??? nie implementowac logiki w tym miejscu; i++)




    }
}
