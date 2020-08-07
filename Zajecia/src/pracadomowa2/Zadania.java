package pracadomowa2;


import java.util.Arrays;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
//        exercise1Mod1();
//        exercise2Mod1();
//        exercise3Mod1();
//        exercise4Mod1();
//        exercise5Mod1();
//        exercise1Mod2();
//        exercise2Mod2();
//        exercise3Mod2();
//        exercise4Mod2();
//        exercise5Mod2();
//        exercise1Mod3();
//        exercise2Mod3();
//        exercise3Mod3();
//        exercise4Mod3();
//        exercise5Mod3();
//        exercise6Mod3();
    }

    private static void exercise6Mod3() {
        System.out.println(average());
        System.out.println(average(8));
        System.out.println(average(4, 6));
        System.out.println(average(9, 6, 1));
    }

    private static double average(int... values) {
        double result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        if (values.length == 0) {
            return 0;
        }
        return result / values.length;
    }

    private static void exercise5Mod3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n ");
        int n = scanner.nextInt();

        printSpecialArray(n);
    }

    private static void printSpecialArray(int n) {
        int temp = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp *= 10;
            }
            array[i] = temp * i;
            temp = 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void exercise4Mod3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz poczatkowy a");
        int a = scanner.nextInt();
        System.out.println("Podaj krok k");
        int k = scanner.nextInt();
        System.out.println("Podaj ilosc iteracji n");
        int n = scanner.nextInt();

        System.out.println(sum(a, k, n));

    }

    private static int sum(int a, int k, int n) {
        int ak = a;
        int sum = a;
        for (int i = 0; i < n - 1; i++) {
            ak += k;
            sum += ak;
        }
        return sum;
    }

    private static void exercise3Mod3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pieniek i gwiazdka....
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (i == 1) {
                    System.out.print("@");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    private static void exercise2Mod3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    private static void exercise1Mod3() {
        int i = 0, j = 0;
        j = (i < j && i++ < ++j) ? ++i : i++; // falsz juz w 1 wyrazeniu - zatem drugie nie ejst nawet sprawdzane...
        System.out.println(i);  // wartosc i jest postinkrementowana zatem tutaj wynosi juz 1
        System.out.println(j); // wartosc j byla inicjalizowana w trakcie postinkrementacji i ktorego wartosc wynosila wtedy 0

        // i=1, j=0 teraz
        j = (i < j || i++ < ++j) ? ++i : i++; //pierwsze falsz, nastepne falsz rowniez
        System.out.println(i); // 3 poniewaz jedna postinkrementacja w warunku, druga pozniej przy przypisaniu
        System.out.println(j); // 2 poniewaz wartosc i przy przypisaniu do j wynosila jeszcze 2 (post a nie preinkr)

        //i=3, j=2 teraz
        j = j++;
        System.out.println(j); // postinkrementacja - do j zostaje ostatecznie przypisane 2 poniewaz kolejnosc wykonywania przypisania od prawej do lewej. Postinkrementacja jest "anulowana"

        //i=3, j=2 teraz
        j += j++; // j = j + j++ (wartosc j aktualna to 2) zatem przy dodaniu j+j = 4
        System.out.println(j);

        //i=3, j=4 teraz
        j += (i < j || i++ < ++j) ? ++i : i++; // warunek lewy prawdwa, zatem prawy nawet nie jest sprawdzany
        System.out.println(i); // warrtosc i jest preinkrementowana z 3 na 4
        System.out.println(j); // j ma wartosc j (4) + preinkrementowane i czyli juz 4 => ostatecznie 4+4 = 8

        //i=4, j=8 teraz
        j = --i | i++ + + + ++j | i--;

        //operator przypisania od prawej do lewej czyli
        // ++j | i-- czyli 1001|0100 =>1101=>13
        // --i | i++ czyli 0010|0010 => 2
        // trzy plusy działają jak jeden

        System.out.println(i); //3
        System.out.println(j); //15
    }


    private static void exercise5Mod2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc");
        int val = scanner.nextInt();
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }

    private static void exercise4Mod2() {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Podaj wartosc n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Silnia z " + n + " to " + factorial);
    }

    private static void exercise3Mod2() {
        for (int i = 100; i >= -25; i = i - 25) {
            System.out.println(i);
        }
        int i = 100;
        while (i >= -25) {
            System.out.println(i);
            i -= 25;
        }
        i = 100;
        do {
            System.out.println(i);
            i -= 25;
        } while (i >= -25);
    }

    private static void exercise2Mod2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("liczba " + i + " jest podzielna przez 2");
            }
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb podzielnych przez 3 to " + sum);
    }

    private static void exercise1Mod2() {
        Scanner scanner = new Scanner(System.in);
        String string1, string2 = "indeks", string3;
        System.out.println("Podaj wartosc zmiennej string3");
        string3 = scanner.nextLine();
        int intval = 10;
        string1 = string2.equals("indeks") ? "Trzeci znak wyrazu " + string3 + " to " + string3.charAt(3) : //
                (intval > 5 || intval < -5) ? "Jest ok" : "Jest dalej w porzadku";
        System.out.println(string1);
    }

    private static void exercise5Mod1() {
        int[] arr = {1, 5, 2, 7, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - 1 - i]);
        }
    }

    private static void exercise4Mod1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile tablica ma miec elementow?");
        int numberOfElementsInArray = scanner.nextInt();
        int[] array = new int[numberOfElementsInArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj wartosc " + i + " elementu");
            array[i] = scanner.nextInt();
        }
        if (array.length > 3) {
            System.out.println(Arrays.toString(array));
        } else {

            System.out.println("Element 0 to " + array[0]);
            System.out.println("Element n to " + array[array.length - 1]);
        }
    }

    private static void exercise3Mod1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc...");
        String var = scanner.nextLine();
        System.out.println("Podaj tryb");
        int mode = scanner.nextInt();
        switch (mode) {
            case 1:
                System.out.println("----" + var.toUpperCase() + "----");
                break;
            case 2:
                System.out.println("****" + var.toLowerCase() + "****");
        }
    }

    private static void exercise2Mod1() {
        String var = " jakas wartosc.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz tryb:");
        int mode = scanner.nextInt();
        switch (mode) {
            case 1:
                System.out.println("Podaj nastepna wartosc");
                int anotherVar = scanner.nextInt();
                if (anotherVar < var.length()) {
                    System.out.println(var.substring(anotherVar));
                }
                break;
            case 2:
                System.out.println("Podaj nastepna wartosc");
                int anotherVar2 = scanner.nextInt();
                if (anotherVar2 + 3 < var.length()) {
                    System.out.println(var.substring(anotherVar2, anotherVar2 + 3));
                }
                break;
            case 3:
                if (var.startsWith("abc")) {
                    System.out.println("Zaczynam sie od \"abc\"");
                } else if (var.endsWith(".")) {
                    System.out.println("Kończę się na kropkę");
                } else {
                    System.out.println("Zaden z warunkow nie jest spelniony");
                }
        }
    }

    private static void exercise1Mod1() {
        String var;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int varInt1 = scanner.nextInt();
        int varInt2 = scanner.nextInt();

        var =
                varInt1 > varInt2 ? //
                        "Liczba " + varInt1 + " jest wieksza od liczby " + varInt2 : //
                        varInt1 < varInt2 ? //
                                "Liczba " + varInt1 + " jest mniejsza od liczby " + varInt2 : //
                                "Liczba " + varInt1 + " jest rowna liczbie " + varInt2;

        System.out.println(var);
    }
}
