package weekend4;

import java.util.Comparator;

public class ComparatorByNameLength implements Comparator<String> {

    // aby stworzyc wlasny comparator nalezy zaimplementowac interfejs comparator z dowolnym typem
    // metoda compare powinan zwrocic trzy przypadki : 1, -1 i 0.
    // 1 wystapi gdy chcemy aby elementy byly ustawione rosnaco
    // -1 wystapi gdy chcemy aby elementy byly ustawione malejaco
    // 0 gdy rowne
    @Override
    public int compare(String o1, String o2) {
//        return o1.length() > o2.length() ? 1 : (o1.length() < o2.length() ? -1 : 0 );
        return Integer.compare(o1.length(),o2.length());
    }
}
