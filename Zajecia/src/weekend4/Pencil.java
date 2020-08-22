package weekend4;

public class Pencil {
    private double price;
    private PencilType pencilType;

    public Pencil(double price, PencilType pencilType) {
        this.price = price;
        this.pencilType = pencilType;
    }

    public void writeSth(){
        System.out.println("Pisze coś na papierze");
    }

    public double getPrice() {
        return price;
    }

    public PencilType getPencilType() {
        return pencilType;
    }

    public enum PencilType{
        H8(3),
        HB(7),
        B4(10);

        private final int thickness;

        PencilType(int thickness){
            this.thickness =thickness;
        }

        public int getThickness() {
            return thickness;
        }
    }
}
