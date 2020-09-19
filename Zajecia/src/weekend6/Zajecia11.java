package weekend6;

import java.util.regex.Pattern;

public class Zajecia11 {
    // wyrazenia regularne sa to takie fragmenty kodu (Stringi) za pomoca ktotrych mozemy sprawdzic czy dane wyrazenia sa zapisane poprawnie

    public static void main(String[] args) {
        regex1();
    }

    private static void regex1() {
        String regex = "\\d+";  // \d to oznaczenie digit czyli cyfry,
        // + - wiecej lub rowno 1 wystapienie
        // * - wiecej lub rowno 0 wystapien
        // ^ - brak wystapien
        String text = "4123";
        System.out.println(text.matches(regex)); // sprawdzamy za pomoca metody matches(regex)

//        alternatywnie uzywamy klasy Pattern i Matcher ktore sa bardziej wydajne

        String regex1 = ".-"; // . oznacza cokolwiek

        System.out.println("q-".matches(regex1));

        //mozemy wymagac np samych liter malych

        String regex2 = "[a-z]+";
        System.out.println("Hubert".matches(regex2));
        System.out.println("krzeslo".matches(regex2));
        System.out.println("123123".matches(regex2));
        System.out.println("sopdfspd234234".matches(regex2));

        String regex3 = "[0-9]*";
        System.out.println("".matches(regex3));
        System.out.println("123".matches(regex3));
        System.out.println("qwe".matches(regex3));

        System.out.println();
        String regex4 = "[a-z]{2}A[0-9]{3,4}";
        System.out.println("asdf".matches(regex4));
        System.out.println("aA345".matches(regex4));
        System.out.println("abA345".matches(regex4));
        System.out.println("AbA345".matches(regex4));
        System.out.println("Aba345".matches(regex4));
        System.out.println("abA3554".matches(regex4));

        //zadanie stworz metode ktora poprosi o numer telefonu i sprawdz czy jest on poprawny, wynik zwroc

    }

}
