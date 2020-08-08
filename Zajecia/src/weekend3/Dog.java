package weekend3;

public class Dog {
    //pole
    // zmienne instancji (obiektu) sa inicjalizowane automatycznie wartoscia domyslnia
    String name;
    int age = 5;

    //skladnia kosntruktora
    //nazwa_klasy (arguemnty....)
    //ta postac jest domyslna i nie jest wymagana....
//    Dog() { // nic innego jak pewna specjalna metoda ktora wywolywana jest w momencie tworzenia nowego obiektu
//    }

    //natomiast gdy tworzymy wlasne kosnturktory to domyslny przestaje istniec....
    Dog() {
        System.out.println("Tworzę dogo");
    }

    Dog(int age1, String name1) {
        name = name1;
        age = age1;
    }

    // NIE MA SLOWA STATIC
    public void bark() { // metoda poneiwaz nie ma static to zostanie wywolana dla konkretnego obiektu.....
        System.out.println("Jestem " + name + ". Hau hau!");
    }


    public void sleep(int duration) {
        System.out.println("Ide spac na " + duration + " minuty");
    }

    public static void meetAllDoggos() {
        System.out.println("Psy sie spotykają");
//        System.out.println(name); // nie wolno odwolac sie do statycznego pola, poniewaz program nei wie jaka by mialo miec wartosc
    }
}
