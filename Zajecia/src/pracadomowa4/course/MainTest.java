package pracadomowa4.course;

import java.util.Scanner;

public class MainTest {
//    Miniprojekt II Stwórz strukturę danych reprezentującą fiszki polsko-angielskie. Dodaj funkcjonalności:
//    a) dodanie słowa po polsku wraz z definicją po angielsku
//    b) dostęp do danego słowa w języku angielskim wpisując słowo po polsku
//    c) dodaj możliwość sortowania alfabetycznie
//    d) dodaj możliwość wymieszania słówek
//    Następnie stwórz klasę Course z konstruktorem przyjmującym parametr określający czy kurs jest podstawowy czy rozszerzony.
//    a) Dodaj metodę practise, która będzie odpytywać użytkownika ze znajomości języka.
//    b) W kursie podstawowym będzie wyświetlana połowa słówek. Dane słówko będzie wyświetlane do chwili udzielenia poprawnej odpowiedzi.
//    c) W kursie rozszerzonym wyświetlany będzie cały zestaw, a znajomość słówka jest zaliczana dopiero przy 3-krotnej poprawnej odpowiedzi
//    d) W klasie course dodaj metodę exam, która odpyta użytkownika z wiedzy o języku. Wyniki wyświetli dopiero po zakończonym egzaminie.
//    e) Zaliczenie powinno być wyświetlane od 50%. DLA CHĘTNYCH: dodaj opcję odwrotu struktury na ang-pol.



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Flashcards flashcards = new Flashcards();
        Course course = new Course();
        while (true) {
            showOptions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    getByTrans(flashcards);
                    break;
                case 2:
                    flashcards.showFlashcards();
                    break;
                case 3:
                    addToFlashes(flashcards);
                    break;
                case 4:
                    flashcards.sortFlashCardsEasy();
                    break;
                case 5:
                    flashcards.shuffleFlashCards();
                    break;
                case 6:
                    setModeOfCourse(course);
                    break;
                case 7:
                    course.updateFlashcards(flashcards); // zakladamy ze ktos mogl dodac fiszki w miedzyczaise, musimy je updatowac w kursie
                    course.practise();
                    break;
                case 8:
                    course.exam();
                    break;
                case 9:
                    System.out.println("Dziękujemy");
                    return;
            }
        }


    }

    private static void getByTrans(Flashcards flashcards) {
        System.out.println("Podaj słowo");
        scanner.nextLine();
        System.out.println(flashcards.getWordByTransaltion(scanner.nextLine()));
    }

    private static void setModeOfCourse(Course course) {
        System.out.println("1.Podstawowy");
        System.out.println("2.Rozszerzony");
        if (scanner.nextInt() == 1) {
            course.setMode(Course.Mode.BASIC);
        } else {
            course.setMode(Course.Mode.EXTENDED);
        }
    }

    private static void addToFlashes(Flashcards flashcards) {
        System.out.println("Podaj słowo po polsku");
        scanner.nextLine();
        String pol = scanner.nextLine();
        System.out.println("Podaj słowo po ang");
        String ang = scanner.nextLine();
        flashcards.addToFlashCards(pol, ang);

    }

    public static void showOptions() {
        System.out.println("Witaj w kursie pol-ang");
        System.out.println("Wybierz opcję :)");
        System.out.println("1.Podaj słowo i uzyskaj tłumaczenie!");
        System.out.println("2.Pokaż fiszki");
        System.out.println("3.Dodaj do fiszki");
        System.out.println("4.Sortuj alfabetycznie");
        System.out.println("5.Mieszaj");
        System.out.println("---OPCJE KURSU---");
        System.out.println("6.Ustaw tryb (domyslnie podstawowy)");
        System.out.println("7.Ucz sie");
        System.out.println("8.Egzamin");
        System.out.println("9.Wyjdz");
        System.out.println();
    }
}
