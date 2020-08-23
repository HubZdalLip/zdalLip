package weekend4;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    private double halfPerimeter;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public double calculateHalPerimeter() {
        return getPerimeter() / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        halfPerimeter = calculateHalPerimeter();
        double subHalfPerAndSideA = halfPerimeter - sideA;
        double subHalfPerAndSideB = halfPerimeter - sideB;
        double subHalfPerAndSideC = halfPerimeter - sideC;

        return Math.sqrt(halfPerimeter * subHalfPerAndSideA * subHalfPerAndSideB * subHalfPerAndSideC);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", halfPerimeter=" + halfPerimeter +
                '}';
    }
}
