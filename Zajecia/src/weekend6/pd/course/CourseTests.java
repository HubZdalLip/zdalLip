package weekend6.pd.course;

import java.util.Scanner;

public class CourseTests {
    private static final Scanner scanner = new Scanner(System.in);

//    Zmodyfikuj miniprojekt kursu pol-ang w ten sposób, aby używał lambd. Fiszki przetrzymuj w oddzielnym pliku flashcards.txt .
//    W chwili dodania nowej fiszki, do pliku flashcards.txt powinna ona być dopisana.
//    Wyniki egzaminu zapisz do pliku w formie certyfikatu. Dodaj interfejs Decorator, który będzie implementowany przez fiszki.
//    W opcjach kursu dodaj opcję udekorowania fiszek:
//    opcja 1: fiszki z wielkich liter
//    opcja 2: fiszki z małych liter
//    opcja 3: fiszki z na zmianę wielkimi i małymi literami.
//    Klasa kurs powinna również agregować klasę IntelligentTeacher, która będzie posiadać metody pozwalające na określenie procentowo, jak często poszczególna fiszka była podawana poprawnie podczas procesu nauki.
//    Opcję wyświetlania statystyk lub zapisania ich do pliku dodaj w menu kursu.
//    Klasa IntelligentTeacher powinna również posiadać metodę learnInModernWay(), której celem będzie nauka w ten sposób, że: słówka które zostały źle napisane będą wyświetlane częściej niż te które są mówione dobrze.
//    Sam opracuj algorytm. Opcja learnInModernWay() powinna być dostępna tylko, jeśli użytkownik wybierze opcję trybu kursu: rozszerzony premium.


    public static void main(String[] args) {
        Flashcards flashcards = new Flashcards();
        System.out.println("Podaj imie i nazwisko ");
        Course course = new Course(scanner.nextLine());
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
                    course.updateFlashcards(flashcards);
                    course.practise();
                    break;
                case 8:
                    course.exam();
                    break;
                case 9:
                    course.generateReport();
                    break;
                case 10:
                    flashcards.chooseDecorator();
                    break;
                case 11:
                    flashcards.decorate();
                    break;
                case 12:
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
        System.out.println("3.Premium");
        int choice = scanner.nextInt();
        if (choice == 1) {
            course.setMode(Course.Mode.BASIC);
        } else if (choice == 2) {
            course.setMode(Course.Mode.EXTENDED);
        } else {
            course.setMode(Course.Mode.PREMIUM);
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
        System.out.println("---RAPORT---");
        System.out.println("9.Raport");
        System.out.println("---DEKOROWANIE FISZEK---");
        System.out.println("10.Ustaw dekorator");
        System.out.println("11.Dekoruj fiszki");
        System.out.println("12.Wyjdz");
        System.out.println();
    }
}
