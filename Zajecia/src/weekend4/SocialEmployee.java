package weekend4;

public class SocialEmployee extends Employee {
    private final int numberOfClients;
    public SocialEmployee(String name, double salary, int numberOfClients) {
        super(name, salary); // jest to koniecznie poneiwaz w przypadku odwolania sie do metod z nadklasy bez tego nie bylaby ona jakby utworzona...
        this.numberOfClients =numberOfClients;
    }

    public void explainSth(){
        System.out.println("I am explaining!");
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    @Override
    public String toString() {
        return "SocialEmployee{" +
                "numberOfClients=" + numberOfClients +
                '}';
    }
}

