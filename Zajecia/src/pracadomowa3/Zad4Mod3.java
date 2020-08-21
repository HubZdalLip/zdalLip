package pracadomowa3;

public class Zad4Mod3 {
    public static void main(String[] args) {
// jak widac statyczne finalne pola sa bardzo przydatne w unikaniu literowek jak i
// np w sugerowaniu dostepnych odpowiedzi
        new Ball(Ball.BASKETBALL_TYPE);
        new Ball(Ball.BASKETBALL_TYPE);
        new Ball(Ball.FOOTBALL_TYPE);
        new Ball(Ball.OTHERBALL_TYPE);
        new Ball(Ball.VOLLEYBALL_TYPE);
        new Ball(Ball.VOLLEYBALL_TYPE);
        new Ball(Ball.VOLLEYBALL_TYPE);
        Ball ball1 = new Ball("testball");
        Ball ball2 = new Ball("basketball");
        Ball ball3 = new Ball("football");
        Ball.getStatistics();
// widac tutaj zastosowanie typu argumentu metody play (Ball...) - podajemy tyle pilek ile chcemy
        Juggler juggler = new Juggler();
        juggler.play(ball1,ball2,ball3);
    }

}

class Ball {
    // statyczne finalne pola pomagaja przy klasie testujacej osobie ktora musi podac wartosc
// do konstruktora - dzieki wpisaniu Ball. widzimy wszystkie poprawne mozlwisoci
    public static final String VOLLEYBALL_TYPE = "volleyball";
    public static final String BASKETBALL_TYPE = "basketball";
    public static final String FOOTBALL_TYPE = "football";
    public static final String OTHERBALL_TYPE = "otherball";
    // liczniki dla kazdej pilki , rowniez statyczne poniewaz dotycza calej klasy
    private static int footballCounter;
    private static int volleyballCounter;
    private static int basketballCounter;
    private static int otherballCounter;
    // pole finalne NIEstatyczne okreslajace typ aktualnej (!) pilki
    private final String type;
    public Ball(String type) {
// Dzieki takiemu zabiegowi latwo w konstruktorze podac wartosci ktore bedą poprawne.
// Taki sposob bardzo pomaga w obsludze wiekszych programow
        switch (type) {
            case VOLLEYBALL_TYPE:
                volleyballCounter++;
                this.type = type;
                System.out.println("Utworzyles " + volleyballCounter + " obiekt " + type);
                break;
            case FOOTBALL_TYPE:
                footballCounter++;
                this.type = type;
                System.out.println("Utworzyles " + footballCounter + " obiekt " + type);
                break;
            case BASKETBALL_TYPE:
                basketballCounter++;
                this.type = type;
                System.out.println("Utworzyles " + basketballCounter + " obiekt " + type);
                break;
            default:
                this.type = type;
                otherballCounter++;
                System.out.println("Nie utworzyles nic sensownego!");
        }
    }
    //metoda przydatna przy metodzie play w klasie Juggler - zwraca ona typ obecnego obiektu
    public String getType() {
        return type;
    }
//metoda statyczna ogolnie wywolywana z klasy pokazuje ile razy dany typ obiektu zostal stworozny
    public static void getStatistics() {
        System.out.println("Ilosc utworzonych obiektow do siatkowki " + volleyballCounter);
        System.out.println("Ilosc utworzonych obiektow do pilki noznej " + footballCounter);
        System.out.println("Ilosc utworzonych obiektow do koszykowki " + basketballCounter);
        System.out.println("Ilosc utworzonych innych obiektow " + otherballCounter);
    }


    //nie uzywamy teraz ale warto mieć... UWAGA! na ogół metody które "warto" mieć powinny wylecieć od razu w kosmos, ale na potrzeby przykładu je zostawiam
    public static int getFootballCounter() {
        return footballCounter;
    }
    public static void setFootballCounter(int footballCounter) {
        Ball.footballCounter = footballCounter;
    }
    public static int getVolleyballCounter() {
        return volleyballCounter;
    }
    public static void setVolleyballCounter(int volleyballCounter) {
        Ball.volleyballCounter = volleyballCounter;
    }
    public static int getBasketballCounter() {
        return basketballCounter;
    }
    public static void setBasketballCounter(int basketballCounter) {
        Ball.basketballCounter = basketballCounter;
    }
    public static int getOtherballCounter() {
        return otherballCounter;
    }
    public static void setOtherballCounter(int otherballCounter) {
        Ball.otherballCounter = otherballCounter;
    }
}
class Juggler {
    // do metody przyjmowana jest dowolna liczba argumentow typu Ball. Dla kazdego zwracany jest typ
    public void play(Ball... balls){
        for(Ball ball: balls){
            System.out.println(ball.getType());
        }
    }
}
