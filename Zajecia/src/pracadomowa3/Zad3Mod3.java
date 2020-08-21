package pracadomowa3;

import java.util.Arrays;

public class Zad3Mod3 {
    public static void main(String[] args) {
        Author author1 = new Author("Horstmann", "caySHorstmann@gmail.com", 'M');
        Author author2 = new Author("Cornell", "garyCornell@gmail.com", 'M');
        Author[] authors1 = new Author[]{author1, author2};
        Book book1 = new Book(authors1, "Java.Podstawy", 89);
        System.out.println(book1.getAuthorNames());
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        System.out.println(book1.toString());
        System.out.println();
        Author author3 = new Author("Wisniewska", "rWisniewska@wp.pl", 'F');
        Author[] authors2 = new Author[]{author3};
        Book book2 = new Book(authors2, "Java jest latwa", 100);
        System.out.println(book2.getAuthorNames());
        System.out.println(book2.getName());
        System.out.println(book2.getPrice());
        System.out.println(book2.toString());
        System.out.println();
        Author author4 = new Author("Kowalski", "jKowalski@wp.pl", 'M');
        Author author5 = new Author("Nowak", "rNowak@interia.pl", 'F');
        Author author6 = new Author("Ornatowski", "kOrnatowski@gmail.com", 'M');
        Author[] authors3 = new Author[]{author4, author5, author6};
        Book book3 = new Book(authors3, "Programowanie w Javie", 120);
        System.out.println(book3.getAuthorNames());
        System.out.println(book3.getName());
        System.out.println(book3.getPrice());
        System.out.println(book3.toString());
        System.out.println();
        System.out.println("Liczba ksiazek: " + Book.amountOfBooks);
    }
}

class Author {
    private final String surname;
    private final String mail;
    private final char gender;

    public Author(String surname, String mail, char gender) {
        this.surname = surname;
        this.mail = mail;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public char getGender() {
        return gender;
    }

    // przesloniecie tej metody sprawdzi sie w dalszej czesci zadania w ktorej bedziemy w stanie w przesłoniętej metodzie toString dla obiektów typu Book
    // wyswietlic dane autorow a nie adres obiektow w pamieci
    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Book {
    public static int amountOfBooks;
    private final Author[] authors;
    private final String name;
    private int price;

    // zmienna statyczna (nieprzydzielona do zadnego obiektu tylko do klasy) zostaje zwiekszana
    public Book(Author[] authors, String name, int price) {
        this.authors = authors;
        this.name = name;
        this.price = price;
        amountOfBooks++;
    }

    // Metoda odpowiedzialna za wyswietlenie wszystkich nazwisk autorow danej ksiazki.
// Stworzona zostaje instancja klasy StringBuilder w celu sumowania nazwisk w petli forEach za pomoca funkcji append
    // Niezalecane w tym przypadku jest uzywanie klasy String, ponieważ obiekty tworzone za pomoca tej klasy są immutable.
    // W praktyce oznacza to ze za kazdym razem, gdy do obecnego obiektu dodac chcemy kolejny łancuch znakow to
    // tworzony jest nowy obiekt o zawartosci powiekszonej o dodana czyniac rozwiazanie niewydajnym. Dzieki klasie StringBuilder tworzony jest tylko jeden obiekt,
    // na rzecz ktorego wywolywana jest metoda append, a ostateczny ciag znakow przypisywany jest jednorazowo i na samym koncu operacji.
    // Aby jednak typ zwracany był zgodny z typem String, nalezy na zmiennej result wywolac metode toString().
    public String getAuthorNames() {
        StringBuilder result = new StringBuilder();
        for (Author author : authors) {
            result.append(author.getSurname()).append(", ");
        }
        return result.toString();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

