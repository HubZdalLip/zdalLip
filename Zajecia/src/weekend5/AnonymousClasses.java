package weekend5;

public class AnonymousClasses {
    // klasa anonimowa - klasa bez nazwy.... uzyc jej mozna jedynie raz

    public static void main(String[] args) {
        Movable movable1 = new FastMove();
        Movable movable2 = new SlowMove();

        movable1.move();
        movable2.move();

        Movable movable = new Movable() { // NIE tworzymy instancji interfejsu, tylko tworzymy anonimowa klase ktora niejawnie impelmentuje ten interfejs
            @Override
            public void move() {
                System.out.println("Biegnę szybko. Jestem w klasei anonimowej!");
            }

            @Override
            public void stop() {
                System.out.println("Zatrzymuję się wolno. Jestem w klasie anonimowej!");
            }
        };

        movable.move();
        movable.stop();

        //anonimowe klasy przydaja sie czesto w roznych bibliotekach sluzacych do np przechwycenia eventu od uzytkwonika (JavaFx, Swing)


//        zadanko
//        a) stworz interfejs z roznymi metodami przyjmujacymi parametry
//        b) wywolaj te metody roznie zaimplementowane w petli.
//        Nie wolno uzyc slowa kluczowego class




    }

}
