package weekend4;

public class BrokenPencil extends Pencil {
    private boolean isBroken;

    public BrokenPencil(double price, PencilType pencilType) {
        super(price, pencilType);
        isBroken = true;
    }

    @Override
    public void writeSth() {
        System.out.println("Nie jestem w stanie pisać :(");
    }


}
