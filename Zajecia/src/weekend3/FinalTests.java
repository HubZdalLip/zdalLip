package weekend3;

public class FinalTests {
    //    public final String text="sdfg";// jedna mozliwa inicjalizacja wartosci
    public final String text;// druga mozliwa w konstruktorze, poniewaz ta metoda jest wywolywana TYLKO raz dla DANEGO obiektu....

    public FinalTests(String text) {
        this.text = text;
    }
}
