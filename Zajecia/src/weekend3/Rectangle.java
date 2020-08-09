package weekend3;

public class Rectangle {
    public double sideA;
    public double sideB;
    public static int counter;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

        if (sideA > 5 || sideB > 5) {
            counter++;
        }
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public static double calculateAreaForSentParameters(double sideA, double sideB) {
        return sideA * sideB;
    }

    public double calculateCircumreference() {
        return 2 * sideA + 2 * sideB;
    }

}
