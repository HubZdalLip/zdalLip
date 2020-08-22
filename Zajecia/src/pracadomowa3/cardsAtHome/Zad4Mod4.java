package pracadomowa3.cardsAtHome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad4Mod4 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card card : deck.getCards()) {
            System.out.println(card.getInfo());
        }


//        grę w wojnę pozostawiam Wam. Jej zrobienie byłoby na pewno niezłą frajdą i nie chcę jej popsuć :)
//        zasadniczo zamiast Stacka można użyc ArrayDeque będącą implementacją interfejsu Queue kolejki
//        pomocnicze metody to peek(), poll(), offer(), isEmpty() itd
//
//        podpowiedź:
//        - jeden ze sposobów to stworzyć kilka stosów - stos kart (talia w dłoni) gracza i komputera oraz pomocnicze stosy będące kartami zgarniętymi ze stołu
//        - porownywanie z enuma getValue - stąd wiadome będzie że król jest wyżej niż dama bo 13>12


    }


}

class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initDeck();
    }

    private void initDeck() {
        for (Figure figure : Figure.values()) {
            for (Color color : Color.values()) {
                cards.add(new Card(figure, color));
            }
        }
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}

class Card {
    private final Figure figure;
    private final Color color;

    public Card(Figure figure, Color color) {
        this.figure = figure;
        this.color = color;
    }

    public String getInfo() {
        return color.getType() + " - " + figure.getRepresentation();
    }

    @Override
    public String toString() {
        return "Card{" +
                "figure=" + figure +
                ", color=" + color +
                '}';
    }
}

enum Color {
    DIAMOND("karo"),
    HEART("kier"),
    CLUB("trefl"),
    SPEND("pik");

    private final String type;

    Color(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

enum Figure {
    NUMBER2(2, "2"),
    NUMBER3(3, "3"),
    NUMBER4(4, "4"),
    NUMBER5(5, "5"),
    NUMBER6(6, "6"),
    NUMBER7(7, "7"),
    NUMBER8(8, "8"),
    NUMBER9(9, "9"),
    NUMBER10(10, "10"),
    JACK(12, "Walet"),
    QUEEN(12, "Dama"),
    KING(13, "Król"),
    ACE(14, "As");

    private final int value;
    private final String representation;

    Figure(int value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public int getValue() {
        return value;
    }

    public String getRepresentation() {
        return representation;
    }
}
