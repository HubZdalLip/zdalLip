package pracadomowa3;

public class Zad1Mod4 {
    // Program działa w kolejności:
// 1. Powstanie poczty
// 2. Powstanie nadawcy
// 3. Powstanie listu
// 4. Ustawienie przez nadawce swojego adresu
// 5. Ustawienie adresu na liście
// 6. Dopasowanie listu do nadawcy
// 7. Wysłanie listu


    public static void main(String[] args) {
        Post post = new Post();
        Sender sender = new Sender();
        Letter letter = new Letter();
        letter.setReceipentAddress("Miła 4 m.3");
        sender.setAddress("Nawojki 10");
        sender.setLetter(letter);
        post.sendLetter(sender);
    }
}
// obiekt klasy Letter posiada swoj wlasny prywatny adres dostarczenia oraz getter i setter do niego.

class Letter {
    private String receipentAddress;

    public String getReceipentAddress() {
        return receipentAddress;
    }

    public void setReceipentAddress(String receipentAddress) {
        this.receipentAddress = receipentAddress;
    }
}

//klasa Post posiada metode odpowiedzialna za wyslanie listu przez odpowiednia osobe.
//    Musi posiadac ona tez informację o adresie listu.

class Post {
    public void sendLetter(Sender sender) {
        String letterReceipentAddress = sender.getLetterReceipentAddress();
        System.out.println("Wysyłanie listu z adresu " + sender.getAddress() + " na adres " + letterReceipentAddress);
    }
}

// Obiekt klasy Sender posiada swój własny list i własny adres do domu a także odpowiednie gettery i settery.
class Sender {
    private Letter letter;
    private String address;

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    String getLetterReceipentAddress() {
        return this.letter.getReceipentAddress();
    }
}

