package pracadomowa4.course;

import java.util.Scanner;

public class MainTest {
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
                    course.updateFlashcards(flashcards);
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
