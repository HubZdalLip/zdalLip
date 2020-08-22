package weekend4;

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


    }
}
