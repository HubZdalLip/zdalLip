package weekend4;

// dziedziczenie uruchamiamy slowem kluczowym extends
public class Boss extends Employee {
    private int numberOfMeetings;

    public Boss(String name, double salary, int numberOfMeetings) {
        // w tym miejscu mozemy rownie dobrze uruchomic kosntruktor z nadklasy (czyli klasy z ktorej sie dziedziczy)
        super(name, salary); // to to samo co this ale dziala na nadklasie
        this.numberOfMeetings = numberOfMeetings;
    }

    @Override // adnotacja override wskazuje ze metoda jest przeslonieta!!! tj oryginalna metoda z nadklasy jets anulowana dla tej kalsy!
    public void work() {
        super.work();
        System.out.println("I am working harder...");
    }



    public void meetVIP() {
        System.out.println("I am meeting very importatnt people (other bosses)");
    }


    public String getName() {
        System.out.println("Hello i am boss");
        return super.getName();
    }

    public void setName(String name) {
        System.out.println("Hello i am boss");
        super.setName(name);
    }

    public double getSalary() {
        return super.getSalary();
    }

    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    public int getNumberOfMeetings() {
        return numberOfMeetings;
    }

    public void setNumberOfMeetings(int numberOfMeetings) {
        this.numberOfMeetings = numberOfMeetings;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "numberOfMeetings=" + numberOfMeetings +
                '}';
    }
}
