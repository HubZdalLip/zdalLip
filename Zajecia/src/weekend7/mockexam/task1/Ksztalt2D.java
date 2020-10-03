package weekend7.mockexam.task1;

public abstract class Ksztalt2D {
    public abstract double obwod();     // obwod może być abstrakcyjny poneiwaz dla ksztaltu2d nic nie policzymy... musi to byc np kwadrat, trojkat, kolo
    // metoda jest pusta i zwraca wartosc double

    public void show() {
        System.out.println("Obwód figury wynosi " + obwod());
    }
}
