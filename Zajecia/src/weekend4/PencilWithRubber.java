package weekend4;

public class PencilWithRubber extends Pencil {
    private boolean hasRubber;

    public PencilWithRubber(double price, PencilType pencilType) {
        super(price, pencilType);
        hasRubber = true;
    }

    @Override
    public void writeSth() {
        System.out.println("Piszę coś na papierze");
        wipeWithRubber();
    }

    public void wipeWithRubber(){
        System.out.println("Scieram...");
    }
}
