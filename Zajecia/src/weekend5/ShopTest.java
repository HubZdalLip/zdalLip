package weekend5;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
//    Napisz program, który będzie reprezentował sklep spożywczy.
//    niech istnieje klasa Sklep posiadająca informacje o artykułach spożywczych
//    oraz dochodach.
//    udostępnij użytkownikowi opcję spytania się o cenę produktu.
//    Jeśli dany produkt nie istnieje to zwróć informację: przepraszam, nie mamy aktualnie tego produktu.
//    stwórz algorytm pozwalający na kupno danego produktu. Powiększaj dochody sklepu w razie kupna.
//    Jeśli dochody sklepu są większe niż trzykrotna wartość wszystkich produktów zwróć informację: Na dziś zamykamy..
//        budzet konkretnej osoby jako dod funcjonlanosc

        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();



        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Witaj w sklepie. WYbierz czynność");
            System.out.println("1. Wyswietl produkty");
            System.out.println("2. Spytaj o cene konkretnego produktu");
            System.out.println("3. Kup produkt");
            System.out.println("Cena wszystkich produktow to: " + shop.getPriceForAll());
            System.out.println("Dochod sklepu wynosi: " + shop.getBudget());
            int input = scanner.nextInt(); //czynnosc od uzytkownika

            switch (input) {
                case 1:
                    shop.showProducts();
                    break;
                case 2:
                    System.out.println("Podaj produkt");
                    scanner.nextLine();
                    String productFromUser = scanner.nextLine();
                    shop.askForPrice(productFromUser);
                    break;
                case 3:
                    System.out.println("Podaj produkt");
                    scanner.nextLine();
                    String productFromUser1 = scanner.nextLine();
                    shop.buyProduct(productFromUser1);
                    break;
                default:
                    System.out.println("Wychodzimy ze sklepu");
                    return;
            }
        }


    }
}
