package weekend4;

public class Square extends Rectangle implements Shape {

    public Square(double a) {
        super(a, 0);
//        this.a = a;
//        this.b = a;
    }

    @Override
    public double getArea() {
        return getA() * getA();
    }

    @Override
    public double getPerimeter() {
        return 4 * getA();
    }

    @Override
    public String toString() {
        return "Square{a=" + getA() + "}";
    }
}
