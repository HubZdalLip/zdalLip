package weekend4;

import java.util.ArrayList;
import java.util.List;

public class Zajecia7 {
    public static void main(String[] args) {

        // dziedziczenie....
        // o co chodzi?
        //

        Employee employee = new Employee("Bartek", 5000);
        Boss boss = new Boss("Magdalena", 10000, 7);
        SocialEmployee socialEmployee = new SocialEmployee("Michał", 4000, 20);


        // bardzo neidobrze, pola i metody sie powtarzaja....
        // jak wiadomo boss jest tez pracownikiem ( pracwonik bossem juz niekoneicznie....)
        // boss dziedziczy po pracowniku!
        // boss zgarnia wszystkie funckjonalnosc z pracownika (o ile sa publiczne albo protected) a takze rozszerza go o wlasne funckjonalnosci

//naprawa!
        employee.work();
        boss.work();
        boss.meetVIP();
        socialEmployee.work();
        socialEmployee.explainSth();
//        boss.
//        Person-> Employee-> Boss
        // w javie mozna dziedziczyc jednokrotnie na jednym poziomie
//      nie moze byc tak ze:
//        Person -> Employee -> Boss
//               -> Student  ->

        System.out.println(employee.getName());
        System.out.println(boss.getName());

        // object - najbardizej macierzysty typ ze wszystkich, root

        // kazda, dosłownie każda klasa dziedziczy po czymś, jawnie lub nie... jesli wskazujemy na co słowkiem extends to wtedy
//        dziedziczymy po tej klasie
        // gdy nie wskazemy nic slowkiem extends to wtedy domyslnie niejawnie dziedziczymy po klasie Object


        // zadanie:
//        a) stworz trzy klasy
//        b) stworz podstawowy mechanizm dziedziczenie miedzy tymi klasami
//        c) stworz kilka pol ktore beda dziedziczone (protected) lub nie....
//        d) stworz kilka metod, ktore przeslonisz, niektorych nie przeslonisz
//        e) zaprezentuj mechanizm na przykladzie kilka obiektow w klasie testowej


        // zgodnie z zasadami SOLID powinno być tak że każdy element podklasy może korzystać z metod z nadklasy....
        // klasa ma rozszerzac nadklase ale byc rowniez poniekąd nią samą

        // Alcohol -> Drink -> DrinkWithVodka

        // polimorfizm - wielopostaciowosc....

//        boss.work();
//        boss2.work();
//        boss3.work();
//        boss4.work();
//        boss5.work();
//        socialEmployee.work();
//        socialEmployee2.work();
//        socialEmployee3.work();
//        socialEmployee4.work();
//        socialEmployee5.work();
//        socialEmployee6.work();

        //problem jest taki że np chcę stworzyć klasę Company ktora będzie mieć listę pracowników
        // musimy tworzyc pola dla kazdego typu rpacownika i oddzielna obsluge....
        // nie idziemy za zasadmi solid poneiwaz nasza klasa nie jest otwarta na rozszerzenie (wymaga przerobki implementacji)

        List<Employee> employeeList = new ArrayList<>(); // tutaj troche inaczej poniewaz List to najbardziej abstrakcyjny typ (interfejs)

        Employee boss1 = new Boss("Jacek", 15000, 3);
        Employee socialEmp = new SocialEmployee("Marlena", 7000, 50);

        employeeList.add(boss1);
        employeeList.add(socialEmployee);
        employeeList.add(boss);
        employeeList.add(socialEmp);

        System.out.println();
        System.out.println();
        System.out.println();
        for (Employee employee1 : employeeList) {
            // na poczatku employee jest bossem
            // jest to w tej chwili rownoznaczne z Blokiem kodu
//            (sytaucja wczesniej) => Boss boss1 = new Bos(blabla);
//            boss1.getName();.... itd
            System.out.println("Jestem " + employee1.getName() + ". Oto moja pensja: " + employee1.getSalary());
            employee1.work();

//             nalezy unikac tego.... poczytac na stackoverflow czemu instanceOf i downcasting jest zly
//            nalezaloby albo zmienic mechanizm dziedziczenia, albo zrobic oddzielna obsluge albo najlepiej uzyc wzorca visitator
            if (employee1 instanceof Boss) {
                Boss boss2 = (Boss) employee1;
                boss2.meetVIP();
            }

        }

        //zadanie
//        a) stworz klase Pencil, klase PencilWithRubber i BrokenPencil ktore beda dziedziczyc po niej
//        b) dodaj do klas odpwoiednie pola okreslajace rodzaj olowka (może być enum), cene olowka oraz metody writeSth()
//        c) nadpisz impelmentacje w poszczegolnych podklasach tak aby odwzierceidlay poprawnie to co robią
//        d) dodaj do klasy PencilWithRubber metode wipeWithRubber sciarającą napis
//        e) stworz metode z klasie Zajecia7 ktora jako argument przyjmie dowolna liczbe olowkow i wewnatrz tej metody wywolaj metode writeSth() dla kazdego arguemntu...
//        wywolaj metody ktore mowia o cenie i rodzaju olowka....

        // korzystaj z poznanych technik....

        System.out.println();
        Pencil pencil = new Pencil(1, Pencil.PencilType.B4);
        BrokenPencil brokenPencil = new BrokenPencil(4, Pencil.PencilType.H8);
        PencilWithRubber pencilWithRubber = new PencilWithRubber(6, Pencil.PencilType.HB);
        write(pencil, brokenPencil, pencilWithRubber);

    }

    public static void write(Pencil... pencils) {
        for (Pencil pencil : pencils) {
            pencil.writeSth();
            System.out.println("Rodzaj ołowka to: " + pencil.getPencilType().toString() + ". A jego grubośc to: " + pencil.getPencilType().getThickness());
            System.out.println("Cena: " + pencil.getPrice());
        }
    }

}
