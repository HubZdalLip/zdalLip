package weekend5;

import java.util.HashMap;
import java.util.HashSet;

public class Zajecia9 {
    public static void main(String[] args) {

        //przeslanianie metod hashCode i Equals()

        //equals - metoda sprawdzajaca rownosc obiektow
        //hashCode - metoda zwracajaca hash dla danego obiektu czyli identyfikator w miare mozliwosci unikalny
//        new HashMap<>();
//        new HashSet<>();

        String string ="asd";
        System.out.println(string.hashCode());

        // 1. mozę się zdarzyc ze hashCode bedzie powtorzony dla jakiegos elementu co zwroci bledna informacje w przypadku porownania tlyko za pomoca hashCode
        // 2. gdy hashCody sa rowne to przy porownaniu wchodzi metoda equals()

//         UWAGA! Jaki zachodzi kontrakt meidzy hashCode i Equals
//        1. Gdy Equals daje true to zawsze hashCody sa rowne
//        2. Gdy Hashcode daje true to nei zawsze Equals da true

        User user1 = new User(1L,"Wojtek","Ornatowski","12345678911"); // obiekt zostal stworzony w innym miejscu w pamieci
        System.out.println(user1);
        User user2 = new User(1L,"Wojtek","Ornatowski","12345678911");
        System.out.println(user2);


        // bardzo dobra praktyka jest przeslanianie metod equals i hashCode, unikamy bledow....
        // mozna zerknac na biblioteke o nazwie Lombok ktora udostepnia adnotacje @EqualsAndHashCode, @Getter
        System.out.println(user1.equals(user2));

        // po prostu od teraz praktycznie zawsze przeslaniamy equals() i hashCode();


    }

}
