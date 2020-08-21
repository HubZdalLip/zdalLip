package pracadomowa3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad6Mod3 {
    public static void main(String[] args) {
        //pierwsza lista
        List<String> names = new ArrayList<>();
        names.add("Tomek");
        names.add("Magda");
        names.add("Hania");

        //druga lista, metoda statyczna Arrays.asList pozwala wysłać tablice ktora zostanie przekonwertowana na listę
        List<String> names2 = new ArrayList<>(Arrays.asList("Hubert","Rafał","Agnieszka"));

        List<String> namesPlusNames2 = new ArrayList<>();
        //metoda addAll dodaje całą kolekcje...
        namesPlusNames2.addAll(names);
        namesPlusNames2.addAll(names2);
        System.out.println(namesPlusNames2);
    }
}
