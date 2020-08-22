package pracadomowa3;

import java.util.Random;

public class Zad1Mod3 {

//    Stwórz klasę Point, która:
//    a) zawierać będzie publiczne pola x i y.
//            b) powinna posiadać również metodę statyczna distance z odpowiednimi argumentami pozwalającą na obliczenie odległości między dwoma punktami.
//    Teraz stwórz klasę Triangle, która posiada:
//    a) 3 pola typu Point - współrzędne wierzchołków trójkąta
//    b) 3 pola typu double - długości boków trójkąta.
//    c) dodać do niej konstruktor, który przyjmuje 3 argumenty typu Point i ustawia pola typu Point, a następnie liczy długości boków i na ich podstawie ustawia pola typu double
//    d) dodać do niej metodę, która wypisuje współrzędne punktów oraz długości boków
//    e) dodać do niej metodę (niestatyczną), która liczy obwód na podstawie pól tej klasy
//    f) dodać do niej metodę statyczną, która liczy obwód na podstawie 3 argumentów typu Point
//    g) stworzyć obiekt klasy Triangle reprezentujący trójkąt o trzech punktach
//    h) wywołać metody z pktów d), e) i f)


    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 2;
        p1.y = 0;
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 7;
        Point p3 = new Point();
        p3.x = 0;
        p3.y = 0;
        Triangle triangle = new Triangle(p1, p2, p3);
        triangle.showSpecification();
        System.out.println("Obwod niestatycznie: " + triangle.countCircumReference());
        System.out.println("Obwod statycznie: " + Triangle.countCircumReferenceStatic(p1, p2, p3));
    }

}

class Point {
    public int x;
    public int y;

    // statyczna metoda przyjmujaca argumenty typu Point i liczaca dystans miedzy tymi punktami
    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
}

class Triangle {
    private Point A, B, C;
    private double a, b, c;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
// wykorzystujac napisana juz metode mozna latwo obliczyc boki
        a = Point.distance(A, B);
        b = Point.distance(B, C);
        c = Point.distance(C, A);
    }

    // ta metoda wyswietla parametry zgodnie z punktem d)
    public void showSpecification() {
        System.out.println("A(" + A.x + "," + A.y + ")");
        System.out.println("B(" + B.x + "," + B.y + ")");
        System.out.println("C(" + C.x + "," + C.y + ")");
        System.out.println("Boki maja dlugosc:\na = " + a + "\nb = " + b + "\nc = " + c);
    }

    // ponizej metoda niestatyczna obliczajaca obwod na podstawie pol przypisanych do danej instancji
    // czy nei bardziej countPerimeter??
    public double countCircumReference() {
        return a + b + c;
    }

    // metoda statyczna obliczajaca obwod nieprzypisana do zadnego obiektu takze nalezy podac trzy arguemnty typu Point
    public static double countCircumReferenceStatic(Point p1, Point p2, Point p3) {
        double a = Point.distance(p1, p2);
        double b = Point.distance(p2, p3);
        double c = Point.distance(p3, p1);
        return a + b + c;
    }
}

