package weekend3;

public class StaticFinalFieldsExamples {
    // gdy pole jest i final i static czyli jest ogolne dla klasy plus jest stala to zminna pisana jest calkowicie z wielkich liter, kazdy wyraz oddzielony _
    public static final int INITIAL_VALUE = 10;
    public static final String UP = "up";
    public static final String DOWN = "down";

    public void showInitialValuePlusAnotherValue(int a) {
        System.out.println(INITIAL_VALUE + a);
    }

    public void showSth() {
        showThingsDependedOnDirection("up"); // ta wartosc jest z palca..... jakis tam up
        showThingsDependedOnDirection(UP); // widze ze moge wyslac up i down.... kod mniej podatny na bledy..... brak literowek
        showThingsDependedOnDirection(DOWN);
    }

    public void showThingsDependedOnDirection(String direction) {
        switch (direction) {
            case UP:
                System.out.println("Kierunek gora...");
                break;
            case DOWN:
                System.out.println("Kierunek dol...");
        }
    }

}
