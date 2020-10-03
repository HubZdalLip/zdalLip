package weekend7.mockexam.task1;

public class Trojkat extends Ksztalt2D {
    public Punkt A, B, C;
    private double a, b, c;

    public Trojkat() {
//        A(0,0), B(2,-2), C(2,2).
        this(0, 0, 2, -2, 2, 2);
    }

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        A = a;
        B = b;
        C = c;

        boki();
    }

    public Trojkat(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        A = new Punkt();
        B = new Punkt();
        C = new Punkt();

        A.x = Ax;
        A.y = Ay;

        B.x = Bx;
        B.y = By;

        C.x = Cx;
        C.y = Cy;

        boki();
    }

    private void boki() {
        a = Math.sqrt((B.x - C.x) * (B.x - C.x) + (B.y - C.y) * (B.y - C.y));
        b = Math.sqrt((A.x - C.x) * (A.x - C.x) + (A.y - C.y) * (A.y - C.y));
        c = Math.sqrt((B.x - A.x) * (B.x - A.x) + (B.y - A.y) * (B.y - A.y));
    }

    @Override
    public double obwod() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
        boki();
    }

    public void setB(double b) {
        this.b = b;
        boki();
    }

    public void setC(double c) {
        this.c = c;
        boki();
    }
}
