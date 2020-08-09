package weekend3;

public class ThisExercise {
    private int firstField;
    private int secField;
    private int thirdField;
    private int forthField;

    public ThisExercise(int firstField) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        this.firstField = firstField;
    }

    public ThisExercise(int firstField, int secField) {
        //this() uzywamy gdy nie chcemy powtarzac kodu, miec metliku, wywolac logike z innego kosnturtkora.....
        this(firstField); // oznacza to tyle ze wywolywany jest konsturtkor do ktorego pasuje wyslany zestaw argumentow....
        this.secField = secField;
    }

    public ThisExercise(int firstField, int secField, int thirdField) {
        this(firstField, secField); //teraz wywola sie kosntrutkor ten wyzej....
        this.thirdField = thirdField;
    }

    public ThisExercise(int firstField, int secField, int thirdField, int forthField) {
        this(firstField, secField, thirdField);
        this.forthField = forthField;
    }
}
