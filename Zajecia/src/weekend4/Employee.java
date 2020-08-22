package weekend4;

public class Employee {

    // protected to kiepska praktyka....
    // pokazuje ze klasa jest slaba i powinna byc zmodyfikowana....
//    protected String name;   // jest tym samym co private ale dla klas pochodnych jest to publikiem
    private String name;
//    protected double salary;
    private double salary;   // jest tym samym co private ale dla klas pochodnych jest to publikiem

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("I am working, like everyone...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
