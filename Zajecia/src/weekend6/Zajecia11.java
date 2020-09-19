package weekend6;

import java.util.regex.Matcher;
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

        //zadanie stworz metode ktora poprosi o numer telefonu i sprawdz czy jest on poprawny, wynik zwroc. Numer powinien być oddzielony myślnikami w charakterystych miejscach albo spacją

        System.out.println("Positives");
        checkNumber("123456789");
        checkNumber("123-456-789");
        checkNumber("48-456-78-99");
        checkNumber("+48-456-78-99");
        checkNumber("+48 456 78 99");
        checkNumber("+48456 78 99");
        System.out.println("Negatives...");
        checkNumber("48456 78+ 99");
        checkNumber("48456 78+ 929");
        checkNumber("48456 d78+ 99");
        checkNumber("+48 4f56 78 99");

        //przyklad: napisz regex ktory sprawdzi czy imie jest poprawnie wpisane
        String regexName = "\\w+"; // w (word) - czy zawiera min 1 wyraz

        System.out.println("Hubert".matches(regexName));

        //przyklad: napisz regex do maili:
             //         ,     odrzuc:   ,
        //{n,} - min n
        //{,m} - max m
        //{n,m} - min n,max m
        //{n} - dokladnie n
        // \d - digits
        // \w - slowa
        // \s - biale znaki
        // [] - zespoly znakow wewnatrz
        // - oznacza zakres np a-z
        // . cokolwiek
        // ? 0 lub 1 razy
        // * 0 i wiecej razy
        // + 1 i wiecej razy
        // ^ $ poczatek i koneic regexa

        System.out.println("Poprawne");
        checkMail("jan.kowalski@wp.de");
        checkMail("hubert123@gmail.com");
        checkMail("h1313123131231231231313123131312@gmail.com");
        System.out.println("Niepoprawne");
        checkMail("hubert123@gmai@l.com");
        checkMail("hubert123gmail.como");
        checkMail("h@gmail.com");

        //zadanko
        //napisz regex do fiszek,
        // praca - job jest OK .......
        // wer4 sdf jest ZLE
        // 123 - 123 jett ZLE

        checkFlashcard("praca - job");
        checkFlashcard("wer4 sdf");
        checkFlashcard("123 - 123");

    }

    private static void checkFlashcard(String text) {
        String regex = "[a-zA-Z]+ - [a-zA-Z]+";
        System.out.println(text.matches(regex));
    }

    private static void checkMail(String mail) {
        String regexMail = "[a-zA-Z.0-9]{4,}@[a-z]+[.]{1}[a-z]{2,3}";
        System.out.println(mail.matches(regexMail));
    }

    private static void checkNumber(String number) {
        String regex = "([+]?[0-9]{3}[- ]?[0-9]{3}[- ]?[0-9]{3})|([+]?[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{2}[- ]?[0-9]{2})"; // ? oznacza wystapienie 0 lub 1 razy
//        String anotherRegex = "[+]?[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{2}[- ]?[0-9]{2}";
        System.out.println(number.matches(regex));

        // numery miedzynarodowe....
        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"); // ^ - poczatek regexa, $ - koniec
        Matcher matcher = pattern.matcher("+111 (202) 555-0125");
        System.out.println(matcher.matches());

    }

}
