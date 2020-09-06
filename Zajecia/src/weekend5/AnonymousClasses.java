package weekend5;

public class AnonymousClasses {
    // klasa anonimowa - klasa bez nazwy.... uzyc jej mozna jedynie raz

    public static void main(String[] args) {
//        anonEx1();
//        anonEx2();
//        anonEx3();
        anonEx4();

    }

    private static void anonEx4() {

        // Stworzyć 1 nieabstrakcyjną klasę Game z przeciążoną metodą start
        // - int start(Movable movable)
        // - int start(Pawn pawn)
        // - int start(Pawn pawn, Playable playable, Movable movable, Beatable beatable)
        // Wywołać wszystkie wersje metody start nie tworząc zewnętrznych klas
        // za pomocą słowa kluczowego class.
        // Kiedy to możliwe użyj lambdy.

        Game game = new Game() {                //game jest interfejsem, co oznacza ze posiada same metody abstarkcyjne....
            //oznacza to ze do Game mozemy stworzyc klase anonimowa
            @Override
            public void start(Movable movable) { //podalismy juz obiekt w psotaci kalsy anonimowej
                movable.move();     // wywolujemy metody move i stop tak jak zostaly okreslone w klasie anonimowej
                movable.stop();
            }

            @Override
            public void start(Pawn pawn) {
                pawn.move();            //odwolujemy sie do labmdy utworzonej ponziej w chwili wysylania do metody!
            }

            @Override
            public void start(Pawn pawn, Playable playable, Movable movable, Beatable beatable) {
                pawn.move();
                playable.play("Ktos", 30);
                movable.move();
                movable.stop();
                beatable.beat();
            }
        };

        // intefejs wyslany musi byc klasa anonimowa albo implementacja tego interfejsu
        game.start(new Movable() {
            @Override
            public void move() {
                System.out.println("Metoda move, movable");
            }
            //okreslamy implementacje metod do Moveable w tym przypadku!
            @Override
            public void stop() {
                System.out.println("Metoda stop, movable");
            }
        });


        // poniewaz interfejs Pawn posiada jedynie jedna metode, moze on byc funkcjonalnym interfejsem, czyli moze byc przedstawiony za pomoca lambdy
        game.start(() -> System.out.println("Metoda move z Pawna"));

        game.start(
                () -> System.out.println("Metoda move z Pawn (wersja 4 parametry)"),
                (who, howLong) -> System.out.println(who + " gra " + howLong + " minut. WERSJA 4 PARAM"),
                new Movable() {
                    @Override
                    public void move() {
                        System.out.println("Metoda move z Moveable, wersja 4 param");
                    }

                    @Override
                    public void stop() {
                        System.out.println("Metoda stop z Moveable, wersja 4 param");
                    }
                },
                () -> System.out.println("Gryzę! WERSJA 4 PARAM")
        );


    }

    private static void anonEx3() {

        int value = 500;
        int anotherValue = 1000;


        Employee employee = new Employee() {
            private double salary = 2500;          // moge tworzyc pola poniewaz jest to zwykla klasa implementujaca interfejs z tym ze nie psoiada nazwy

            @Override
            public void work() {
                System.out.println("Im working");
            }

            @Override
            public void incSalary() {
                salary += value;
                System.out.println(salary);
//                value += 1000;                      //wewnatez klasy anonimowej nie wolno anm modyfikowac zmiennych spoza klasy. Dostac sie mozemy do zmienncyh finalnych lub efektywnie finalnych
                //zmienna efektywnie finalna to zmienna, ktora staje sie niejawnie finalna poniewaz nie jest nigdzie modyfikowana
                //aby modyfikowac te zmienne musza one byc jednoelementowa tablica albo musza to byc zmienne atomowe
            }
        };

        Employee employee2 = new Employee() {
            private double salary = 5300;          // moge tworzyc pola poniewaz jest to zwykla klasa implementujaca interfejs z tym ze nie psoiada nazwy

            @Override
            public void work() {
                System.out.println("Im working");
            }

            @Override
            public void incSalary() {
                salary += anotherValue;
                System.out.println(salary);
            }
        };

        System.out.println();
        System.out.println();
        System.out.println("Pensja");
        employee.incSalary();
        employee2.incSalary();

        // istnieje lambdy

        //opcja 1 stworzyc klase implementujaca interfejs Playable, przelsonic metode play i zapisac Playable playable = new PlayableImpl();
        //opcja 2 stworzyc klase anonimowa i zapisac: Playable playable = new Playable{ @Overdide void play(...){}};
        //opcja 3 stworzyc lambde

//        Playable playable = () /*to samo co play()*/ -> /*wywolanie metody, to samo co { }*/ System.out.println("Gram sobie") /*to samo co kontent metody*/;
//        playable.play();
//
//        //lambda poelga na uproszczeniu nawet klasy anonimowej. Jest to metoda anonimowa. (TYLKO W TYM PRZYPADKU)
//        // tworzona jest implementacja neijawna dla Playable ale poniewaz posiada ona tylko jedna metode to moze byc zapisana jak wyzej
//
//        Playable playable1 = new Playable() {
//            @Override
//            public void play() {
//                System.out.println("Gram sobie");
//            }
//        };

        Playable playable2 = (String who, int howLong) /*to samo co play(String who, int howLong)*/ -> {
            System.out.println(who + " teraz gra");
            System.out.println("Bedize grał " + howLong + " minut");
        };

        playable2.play("Hubert", 30);

        MultiplicationByItself multiplicationByItself = x -> x * x; // najrpostsza postac, polega na tym że jeśli mamy tylko jeden aregument to mozemy odpuscic nawiasy
//        jesli mamy tylko jedna linijke to mozemy odpsucic nawiasy klamrowe
        System.out.println(multiplicationByItself.multiply(5));

        MultiplicationByItself multiplication = numberToMultiplay -> {
            System.out.println("Very complex calculation"); //poniewz mamy wiecej niz jedna linijke kodu to musimy miec nawiasy klamrowe
//            poniewaz metoda cos zwraca a mamy nawiasy klamrowe to musimy miec returna
            return numberToMultiplay * numberToMultiplay * numberToMultiplay * numberToMultiplay;
        };

        System.out.println(multiplication.multiply(3));

        Playable playable = (who, howLong) -> {
            System.out.println(who + "gra teraz bardzo dlugo ");
            System.out.println("Az " + howLong + " minut :o");
        };

        playable.play("Magda", 300);


    }

    private static void anonEx2() {
//        zadanko
//        a) stworz interfejs z roznymi metodami przyjmujacymi parametry
//        b) wywolaj te metody roznie zaimplementowane w petli.
//        Nie wolno uzyc slowa kluczowego class

        Shape rectangle = new Shape() {
            @Override
            public double calculateArea(double a, double b) {
                return a * b;
            }

            @Override
            public double calculatePermiter(double a, double b) {
                return 2 * a + 2 * b;
            }

            @Override
            public String getName() {
                return "rectangle";
            }
        };

        Shape square = new Shape() {                                    // zamiast new Shape{} mozna dac new Square() gdzie: class Square implementes Shape
            @Override
            public double calculateArea(double a, double b) {
                return a * a;
            }

            @Override
            public double calculatePermiter(double a, double b) {
                return 4 * a;
            }

            @Override
            public String getName() {
                return "square";
            }
        };

        Shape[] shapes = new Shape[2];
        shapes[0] = rectangle;
        shapes[1] = square;

        for (Shape shape : shapes) {
            System.out.println("For " + shape.getName());
            System.out.println(shape.calculateArea(3, 5));
            System.out.println(shape.calculatePermiter(2, 7));
            System.out.println();
        }


    }

    private static void anonEx1() {
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


    }

}
